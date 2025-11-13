package com.service;

import com.document.Login;
import com.repository.LoginRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    @Autowired
    PasswordEncoder passwordEncoder;    // it do the DI for passwordEncoder()

    public String signUp(Login login) {
    Optional<Login>  result = loginRepository.findByEmailId(login.getEmailId());
    if(result.isPresent()){
        return "Email id already exists";
    }else {
        login.setPassword(passwordEncoder.encode(login.getPassword()));
        loginRepository.save(login);
        return "Account created";
    }
    }

    public String signIn(Login login) {
        Optional<Login>  result = loginRepository.findByEmailId(login.getEmailId());
        if(result.isPresent()){
            Login ll = result.get();            // actual password , hashPassword
            boolean passwordMatch =  passwordEncoder.matches(login.getPassword(), ll.getPassword());
            if(passwordMatch){
                return "Successfully login";
            }else {
                return "Password is wrong";
            }
        }else {
            return "Email id not found";
        }
    }
}
