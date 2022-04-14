package com.java.assignments.assignment7;

class OuterClass{
    public OuterClass(){
        System.out.println("Outer class constructor");
    }
    class InnerClassParent{
        public void printMessage(){
            System.out.println("Inner class parent method");
        }
    }
    class InnerClassChild extends InnerClassParent{
        public void printMessage(){
            System.out.println("Inner class child method");
        }
    }
}

public class InnerClassDemo {
    public static void main(String args[]){
        OuterClass.InnerClassChild ob=new OuterClass().new InnerClassChild();
        ob.printMessage();
    }
}
