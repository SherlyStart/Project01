package com.sherly.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person {


    private int i;
    private Date date;

    public void eat(){
        System.out.println("吃饭啦");
    }

    //这是单行注释
    //    ArrayL
    public static void main(String[] args) {


        //region Description
        System.out.println();
        System.out.println("Morning Darling!");


        System.out.println("Morning Darling!");
        //endregion
        method1()

    }

    public void getFile() {

        i = 0;
        System.out.println();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        date = new Date();

        Object date1 = new Date();


        File file = new File("C:\\user\\sherly.txt");

    }
    public static void method1(){
        try {
            FileOutputStream fos = new FileOutputStream("customer.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }

}
