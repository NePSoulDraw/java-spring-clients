
package com.clients.data;

import com.clients.domain.UserEnt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntDao extends JpaRepository<UserEnt, Long>{
    
    UserEnt findByUsername(String username);
    
}
