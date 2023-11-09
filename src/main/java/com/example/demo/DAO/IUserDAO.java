package com.example.demo.DAO;

import com.example.demo.Entities.User;
import org.springframework.data.repository.CrudRepository;


public interface IUserDAO extends CrudRepository<User, Long>{

}