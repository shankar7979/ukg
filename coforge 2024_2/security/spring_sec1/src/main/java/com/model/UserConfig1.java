package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig1 {


   @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        var userDetailsManager = User.builder().username("amit kumar").password("abcd").roles("ADMIN").build();
        return new InMemoryUserDetailsManager(userDetailsManager);

    }
    //or

  /*  @Bean
    public UserDetailsService userDetailsService() {

        UserDetails service1 = User.withUsername("ram kumar").password("abcd").roles("ADMIN").build();
        UserDetails service2 = User.withUsername("shyam kumar").password("abcd").roles("USER").build();
        //return new InMemoryUserDetailsManager(service1);
        return new InMemoryUserDetailsManager(service1,service2);
    }*/

    @Bean
   public  PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
        //return new BCryptPasswordEncoder();
    }


}
