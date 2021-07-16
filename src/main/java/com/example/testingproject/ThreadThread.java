package com.example.testingproject;

public class ThreadThread extends Thread{
    public void run(){
        for(int i=20;i<30;i++){
            try{
                Thread.sleep(60);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}
