/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Date;

/**
 *
 * @author User
 */
public class Author implements Display {
    private int authorId;
    private String name;
    private String address;
    private Date birthDate;
    public String getInfo(){
        return "";
    }

    public Author(int authorId, String name, String address, Date birthDate) {
        this.authorId = authorId;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
    
    
    
    
    
    
}
