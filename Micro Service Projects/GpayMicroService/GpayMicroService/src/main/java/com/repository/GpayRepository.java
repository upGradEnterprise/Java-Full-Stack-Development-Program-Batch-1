package com.repository;

import com.document.Gpay;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GpayRepository extends MongoRepository<Gpay,String> {
}
