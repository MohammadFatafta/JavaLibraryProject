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
public class Loan implements Display{
    private int loanId;
    private Book book;
    private Student student;
    private Date dueDate;

    public Loan(int loanId, Book book, Student student, Date dueDate) {
        this.loanId = loanId;
        this.book = book;
        this.student = student;
        this.dueDate = dueDate;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public String getInfo(){
    return "";
}
    public boolean isOverdue(){
        return false;
    }
}
