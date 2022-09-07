package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<=20; i++)
            System.out.println(sumUpTo(i));
    }

    static int sumUpTo (int n)
    {
        return (n*(n+1)/2);
    }
}
