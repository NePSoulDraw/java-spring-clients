
package com.clients.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "roles")
public class Role implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    
    @Column(name = "name")
    private String name;
    
}
