package com.aisha;
import java.io.*;
import java.util.*;
import java.math.*;

public class primenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        sc.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
