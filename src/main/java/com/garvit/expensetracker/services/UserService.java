package com.garvit.expensetracker.services;

import com.garvit.expensetracker.domain.User;
import com.garvit.expensetracker.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
