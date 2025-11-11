package com.repository;

import com.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
// custom method to write custom query
    @Query("select ac.amount from Account ac where ac.emailId=:email")
    public float findBalance(@Param("email") String email);

    @Query("select ac.accNo from Account ac where ac.emailId=:email")
    public int findAccountNumber(@Param("email") String email);
}
