package com.threadproj;

import java.util.Scanner;
class add extends calculatorthreads {
    int x,y;
    public add(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void run(){
        try{
            System.out.println("addition");
            System.out.println(x+y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class sub extends calculatorthreads {
    int x,y;
    public sub(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run(){
        try{
            System.out.println("subtraction");
            System.out.println(x-y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class mul extends calculatorthreads {
    int x,y;
    public mul(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void run(){
        try{
            System.out.println("multiplication");
            System.out.println(x*y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class div extends calculatorthreads {
    int x,y;
    public div(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public void run(){
        try{
            System.out.println("division");
            System.out.println(x/y);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


public class calculatorthreads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a:");
        a=input.nextInt();
        System.out.println("enter the value of b:");
        b=input.nextInt();
        add aobj=new add(a,b);
        sub sobj=new sub(a,b);
        mul mobj=new mul(a,b);
        div dobj=new div(a,b);

        aobj.start();
        sobj.start();
        mobj.start();
        dobj.start();


    }
}
