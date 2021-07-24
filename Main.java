package com.aisha;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        int l=s.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            rev= rev+ ch[i];
        }
        if(s.equals(rev)){
            System.out.println("Yes");
        }  else{
            System.out.println("No");
        }
    }
}
