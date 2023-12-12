package org.example;

import school.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       demoArrays();
       demoVerargs();
       demoSorting();


    }

    private static void demoSorting() {
        int[] i = {10,25,74,5,3,-5,4};
        System.out.println(Arrays.toString(i));
        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.binarySearch(i,74));

    }

    private static void demoVerargs() {
        Object ob = new Object();
        String[] x = {"A","B","C"};
        String[] y = {null,null,null,null};
        System.out.println("x " + Arrays.toString(x));
        System.out.println("y " + Arrays.toString(y));
//        for(int i=0; i < x.length;i++){
//            y[i] = x[i];
//        }

        // use arraycopy in System class
        System.arraycopy(x,0,y,0,2);
        // array that want to copy,the start index that want to cp,The array that want to put,the start index that want to put, the length that want to copy.
        System.out.println("x " + Arrays.toString(x));
        System.out.println("y " + Arrays.toString(y));
    }

    private static void demoArrays() {
        System.out.println("### demo Arrays ###");
        int[] i = {2,-1,10,-10,3};
        int[][] ii = {{0,3},{},{7,-3,9,16}};
        Student s1 = new Student(4,"Dear");
        Student[] s = {new Student(1,"One"),new Student(3,"Two"), new Student(0,"Three"),s1};
        System.out.println("i :"+ i+ "\nArrays.toString(i)" + Arrays.toString(i) +"\n ii : "+ ii +"\nArrays.deppToString(ii)" + Arrays.deepToString(ii));
        System.out.println("s :"+ s+ " \nArrays.toString(s)" + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

        System.out.println( Arrays.binarySearch(s,s1));
    }
}