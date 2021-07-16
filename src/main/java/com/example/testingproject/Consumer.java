package com.example.testingproject;

public class Consumer extends Thread{
    Company company;
    public Consumer(Company company){
        this.company=company;
    }

    /**
     * 20 in here means as 20 is the times item is getting produced
     * it would take the same time to get consumed
     */
    public void run(){
        for(int i=0;i<20;i++){
            company.consume();
        }
    }
}
