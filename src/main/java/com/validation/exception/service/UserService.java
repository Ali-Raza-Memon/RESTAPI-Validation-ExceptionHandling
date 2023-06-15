package com.validation.exception.service;

import com.validation.exception.dto.UserRequest;
import com.validation.exception.entity.User;
import com.validation.exception.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;


//    public User saveUser(UserRequest userRequest){
//        User user = User.build(0,userRequest.getName(),
//                userRequest.getAge(),
//                userRequest.getGender(),userRequest.getMobile(),
//                userRequest.getNationality());
//
//        return userRepository.save(userRequest);
//    }




    public User saveUser(@RequestBody User user){
        return userRepository.save(user);
    }


    public List<User> getUser(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findByUserId(id);
    }


}
