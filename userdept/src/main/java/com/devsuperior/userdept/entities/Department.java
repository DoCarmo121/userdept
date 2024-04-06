package com.devsuperior.userdept.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name = "tb_department")
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //automaticamente gerado pelo db;
    private Long id;
    private String name;
    
    public Department(){
        
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
}
