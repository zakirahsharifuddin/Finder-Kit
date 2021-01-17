package com.example.myapplication;


public class Inputfile {
   String Name, Email, Comment;

    public Inputfile() {

    }

    public Inputfile(String name, String email, String comment) {
        Name = name;
        Email = email;
        Comment = comment;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}

