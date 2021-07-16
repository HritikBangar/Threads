package com.example.testingproject;

public class Producer extends Thread{
    Company company;
    public Producer(Company company){
        this.company=company;
    }
    public void run(){
        for(int i=0;i<20;i++){
            company.produce(i);
        }
    }
}
