
package com.marketingsolucinones.ApiMarketing.service;

import com.marketingsolucinones.ApiMarketing.dao.UserRepository;
import com.marketingsolucinones.ApiMarketing.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
        
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    
}
