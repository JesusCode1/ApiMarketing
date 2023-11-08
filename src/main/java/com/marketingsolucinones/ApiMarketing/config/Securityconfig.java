
package com.marketingsolucinones.ApiMarketing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableMethodSecurity
public class Securityconfig {
    
      @Autowired
        private UserDetailsService userDetailsService;
      
     @Bean
    public static PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
    }
    //luego cambiar .anyRequest().authenticated() a permitAll() para que pueda cargar el swagger
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
    http.csrf().disable()
    .authorizeHttpRequests((authorize) ->
    authorize.requestMatchers("/api/auth/**").permitAll()
    .anyRequest().permitAll()
    );
    return http.build();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration
    configuration) throws Exception{
    return configuration.getAuthenticationManager();

    
    }
}
