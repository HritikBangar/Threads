package com.example.testingproject;

public class RunnableThread implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(40);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);

        }
    }
}
