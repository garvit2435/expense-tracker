package com.garvit.expensetracker.services;

import com.garvit.expensetracker.domain.User;
import com.garvit.expensetracker.exceptions.EtAuthException;
import com.garvit.expensetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if(email !=null)  email.toLowerCase();
        return userRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        Pattern pattern=Pattern.compile("^(.+)@(.+)$");
        if(!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid Email format");
        Integer count= userRepository.getCountByEmail(email);
        if(count>0)
            throw new EtAuthException("Email already in use!");
        Integer userId=userRepository.create(firstName, lastName, email, password);
        return userRepository.findById(userId);


    }
}
