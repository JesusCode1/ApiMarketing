
package com.marketingsolucinones.ApiMarketing.dao;

import com.marketingsolucinones.ApiMarketing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
    
    User findByEmail(String email);
  
}
