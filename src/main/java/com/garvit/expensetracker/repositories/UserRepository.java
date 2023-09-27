package com.garvit.expensetracker.repositories;

import com.garvit.expensetracker.domain.User;
import com.garvit.expensetracker.exceptions.EtAuthException;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;
    User findByEmailAndPassword(String email, String password) throws  EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
