
package com.marketingsolucinones.ApiMarketing.service;

import com.marketingsolucinones.ApiMarketing.entity.User;


public interface UserService {
    
    User findByEmail(String email);
    User add(User user);
}
