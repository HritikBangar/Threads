package com.example.testingproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

// you can also say that this is a common resource that is getting used also.......
public class Company {

    private ArrayList<Integer> currentItems = new ArrayList<Integer>();
    private Random random = new Random();

    synchronized public void produce(){
        if(currentItems.size()>0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i=0;i<5;i++){
            currentItems.add(random.nextInt());
        }
        System.out.println("Produced 5 Items");
        notify();
    }

    synchronized public void consume(){
        if(currentItems.size()==0){
            try {
                System.out.println("waiting for items to be produced");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumer is consuming item number: " +currentItems.get(currentItems.size()-1));
        currentItems.remove(currentItems.size()-1);
        if(currentItems.size()==0){
            produce();
            notify();
        }
    }

}
