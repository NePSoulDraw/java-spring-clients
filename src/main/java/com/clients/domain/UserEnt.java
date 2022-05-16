
package com.clients.domain;

import java.io.Serializable;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEnt implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Role> roles;
    
}