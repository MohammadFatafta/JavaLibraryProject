/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Student implements Display{
    private int studentId;
    private String name;
    private String address;
    private Date birthDate;
    private String major;
    private ArrayList<Loan> loan=new ArrayList<Loan>();
    public String getInfo(){
        return "";
    }
    public boolean borrowBook(Book book){
        return false;
    }
    public boolean returnBook(Book book){
        return false;
    }

    public Student(int studentId, String name, String address, Date birthDate, String major) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public ArrayList<Loan> getLoan() {
        return loan;
    }

    public void setLoan(ArrayList<Loan> loan) {
        this.loan = loan;
    }
    
}
