/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareagrupal;

/**
 *
 * @author mac
 */
public class Persona {
    
    private String name;
    private String id;
    
    /*
    Constructor por defecto
    */
    public Persona(){
        
    }
    
      /*
    Constructor por defecto
    */
    public Persona(String _name, String _id){
        this.setName(_name);
        this.setId(_id);
    }
    
    /*
    Setters
    */
    public void setName(String _name){
        this.name = name;
    }
    
    public void setId(String _id){
        this.id = _id;
    }
    
    
    /*
    Getters
    */
    public String getName(){
        return this.name;
    }
    
      public String getId(){
        return this.id;
    }
    
    
    
    
    
    
}
