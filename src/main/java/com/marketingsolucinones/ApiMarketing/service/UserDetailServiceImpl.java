
package com.marketingsolucinones.ApiMarketing.service;

import com.marketingsolucinones.ApiMarketing.dao.UserRepository;
import com.marketingsolucinones.ApiMarketing.entity.User;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       
                
        User user= userRepository.findByEmail(email);
                
         Set<GrantedAuthority> authorities= user.getProyecto()
                 .stream()
                 .map((proyecto)-> new SimpleGrantedAuthority(proyecto.getName()))
                 .collect(Collectors.toSet());
           return new org.springframework.security.core.userdetails
                 .User(user.getUserName(),user.getPassword(), authorities);

    }
    
}
