package com.example.testingproject;


public class TestingProjectApplication {
    public static void main(String[] args) {
        RunnableThread runnableThread=new RunnableThread();
        Thread thread=new Thread(runnableThread);
        ThreadThread threadThread=new ThreadThread();
        // now, what i want to see the ordering in which these things are going to happens
        // I also want to have my own ordering in here see how are you going to implement that
        thread.start();
        threadThread.start();
        // these threads are running in the non-blocking state as none of them are waiting for other one
    }
}
