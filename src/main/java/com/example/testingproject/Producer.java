package com.example.testingproject;

public class Producer extends Thread{
    Company company;
    public Producer(Company company){
        this.company=company;
    }
    public void run(){
        company.produce();
    }
}
