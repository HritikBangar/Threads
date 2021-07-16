package com.example.testingproject;

public class Company {

    private int n;
    public Boolean flag=false;

    synchronized public void produce(int n){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n=n;
        System.out.println("Produced Item numnber: "+n);
        flag=true;
        notify();
    }
    synchronized public void consume(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer is consuming item number: " +n);
        flag=false;
        notify();
    }
}
