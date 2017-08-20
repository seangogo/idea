package com.sean.java8_lambda;

/**
 * Created by admin on 2017/8/13.
 */
public class Lambda02 {
    public static void main(String[] args) {
        new Action() {
            @Override
            public void execute(String content) {
                System.out.println(content);
            }
        }.execute("jdk8之前的的匿名方式");



        Action login=(String lambda)->{
            System.out.println(lambda);
        };
        login.execute("lambda");
    }
    static interface Action{
        void execute(String content);
    }
}
