package com.example.pract2;

class Contributor {

    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}