package com.shoaib.bazlur.chap9;

public class GenericClassDemo {
    public static void main(String[] args) {
        Generic<Integer> iObj;

        iObj = new Generic<>(88);
        //In runtime the T obj of generic class will become Integer Type
        iObj.showType();

        int value = iObj.getObj();

        System.out.println("value = " + value);

        Generic<String> strObj = new Generic<>("This is a test");
        strObj.showType();
        String strValue = strObj.getObj();
        System.out.println("strValue = " + strValue);

    }
}
