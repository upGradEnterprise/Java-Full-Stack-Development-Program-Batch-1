package com.repository;

import com.document.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends MongoRepository<Login, String> {
    //
    public Optional<Login> findByEmailId(String emailId);
}
