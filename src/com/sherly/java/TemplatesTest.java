package com.sherly.java;

import com.sherly.bean.Customer;

import java.util.ArrayList;

/**
 * @author Sherly
 * @date 2020/8/29 - 11:46
 * @func. :
 * 1. IDEA中代码模板所处的位置 settings - Editor - Live TemplatesTest / General - Postfix Completion
 * 2. 常用的模板
 */
public class TemplatesTest {

    //模板六：prsf 可生成private static final
    private static final Customer cust = new Customer();

    //变形：psf
    public static final int NUM = 0;

    //变形：psfi
    public static final int NUM2 = 2;

    //变形：psfs
    public static final String NATION = "china";


    //模板一：PSVM
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int i = 0;
        int j = 0;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
        System.out.println(i);
        System.out.println(j);


        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }


        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //变形：itar
        for (int k = 0; k < arr.length; k++) {
            String s = arr[k];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("345");
        list.add("678");
        for (String s : list) {
            
        }

        //变形：list.fori
        for (int i1 = 0; i1 < list.size(); i1++) {
            
        }

        //变形：list.forr 倒序遍历
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            
        }
    }


    public void method(String str){
        String info = null;
        System.out.println("TemplatesTest.method");
        System.out.println("str = [" + str + "]");
        System.out.println("info = " + info);

        //模板五：ifn
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("345");
        list.add("678");
        if (list == null) {

        }

        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list == null) {

        }

        if (list != null) {

        }

    }

}
