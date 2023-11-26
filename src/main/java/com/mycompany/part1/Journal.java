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
public class Journal extends Book{
    private String conferenceName;
    private int conferenceNo;

    public Journal(String title, Author author, int bookNo, String genre, int version, Date date) {
        super(title, author, bookNo, genre, version, date);
    }
    public String getInfo(){
        return "";
    }
    public boolean inLoan(){
        return false;
    }
}
