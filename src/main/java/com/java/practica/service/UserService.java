package com.java.practica.service;

import com.java.practica.dto.UserDto;
import com.java.practica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser( UserDto userDto ){

        userRepository.save( userDto.add(userDto) );

    }
}
