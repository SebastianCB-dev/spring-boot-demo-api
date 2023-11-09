package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IUserDAO;
import com.example.demo.Entities.User;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDAO userDAO;
    @Override
    public void guardarCliente(User user){
        userDAO.save(user);
    }

}  