package com.tts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <w> void printList(List<w> arr){
        for(w element: arr){
            System.out.println(element);
        }
    }
    public static <T> T returnValue(T value){
        System.out.println("The Type of the passed value: "+value+" is "+ value.getClass().getName());
        return value;
    }
    // *******************************
    public static <T> int greaterThan(T[] numArray,T elem){
        int count=0;
        for(T e:numArray)
           // if(e>elem) It will not work because we are only allowed to compare values not references and T is reference type
                count++;

            return 0;
    }
    ///extending the Comparable interface
    public static <T extends Comparable<T>> int greaterThan(T[] numArray, T elem) {
        int count = 0;
        for (T e : numArray)
            if (e.compareTo(elem)>0 )
                ++count;
        return count;
    }
/////////////////////
    public static <T,R> void printTwoGeneric(T t,R r){
        System.out.println("Two generic types "+r+" "+t);
    }
    public static void main(String[] args) {
 /////////// raw List
        List rawList=new ArrayList();
        rawList.add("Hello");
        rawList.add("Java");
        printList(rawList);
        List<Integer> numList=new ArrayList<Integer>();
        List<String>   stringList=new ArrayList<>();
        Integer[] c= new Integer[]{1,2,3,4};
         numList.addAll(Arrays.asList(c));
        System.out.println(numList);
       returnValue(6);
       printTwoGeneric(4,"Hello");
        }
    }

