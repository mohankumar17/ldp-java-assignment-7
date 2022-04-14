package com.java.assignments.assignment7;

interface Unicycle{
    public void printUniBalance();
}
interface Bicycle{
    public void printBiBalance();
}
interface Tricycle{
    public void printTriBalance();
}

interface Circle extends Unicycle,Bicycle,Tricycle{
    public void printCycleBalance();
}

public class CycleInterfaceDemo implements Circle{

    @Override
    public void printUniBalance() {
        System.out.println("UniCycle Balance");
    }

    @Override
    public void printBiBalance() {
        System.out.println("BiCycle Balance");
    }

    @Override
    public void printTriBalance() {
        System.out.println("TriCycle Balance");
    }

    @Override
    public void printCycleBalance() {
        System.out.println("Cycle Balance");
    }

    public static void main(String args[]){
        CycleInterfaceDemo ob = new CycleInterfaceDemo();
        ob.printUniBalance();
        ob.printBiBalance();
        ob.printTriBalance();
        ob.printCycleBalance();
    }
}
