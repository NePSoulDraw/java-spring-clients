
package com.clients.service;

import com.clients.domain.Role;
import com.clients.domain.UserEnt;
import com.clients.data.UserEntDao;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Slf4j
public class UserEntService implements UserDetailsService{

    @Autowired
    private UserEntDao userEntDao;
    
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEnt user = userEntDao.findByUsername(username);
        
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
        
        for(Role role: user.getRoles()){
            
            roles.add(new SimpleGrantedAuthority(role.getName()));
            
        }
        
        return new User(user.getUsername(), user.getPassword(), roles);
        
    }
    
}
