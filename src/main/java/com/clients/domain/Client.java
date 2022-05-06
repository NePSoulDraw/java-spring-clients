
package com.clients.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class Client{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer ClientId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "surname")
    private String surname;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private int phone;
    
    @Column(name = "balance")
    private int balance;
    
}
