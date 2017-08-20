package com.sean.java8_lambda;

/**
 * Created by admin on 2017/8/13.
 */
public class lambda01 {
    public static void main(String[] args) {
//        new Runnable(){
//
//            @Override
//            public void run() {
//                System.out.println("实现匿名内部类方法");
//            }
//        }.run();
        int i =1;
        Runnable runnable=()->{
            System.out.println("用lambda调用");
            System.out.println("i="+i);
        };
        runnable.run();

    }
}
