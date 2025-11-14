package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.repository.LoginDao;

@Service
public class LoginService implements UserDetailsService {

	
	@Autowired
	private LoginDao loginDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String emailid) throws UsernameNotFoundException {
		List<SimpleGrantedAuthority> roles = null;	
		Optional<Login> result = loginDao.findById(emailid);
		
		if (result.isPresent()) {
			Login login = result.get();
			roles = Arrays.asList(new SimpleGrantedAuthority(login.getRole()));
			return new User(login.getEmailid(), login.getPassword(), roles);
		}
		throw new UsernameNotFoundException("User not found with the name " + emailid);	}
	
	public String save(Login login) {
		Optional<Login> result = loginDao.findById(login.getEmailid());
		if(!result.isPresent()) {
				login.setPassword(bcryptEncoder.encode(login.getPassword()));
			loginDao.save(login);
			return "Account created successfully";
		}else {
			return "Account didn't create EmailiId must be unique";
		}
		
	}

}
