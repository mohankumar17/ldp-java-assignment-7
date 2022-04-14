package com.java.assignments.assignment7;

import java.util.ArrayList;

class Cycle{
    public void balance(){
        System.out.println("Cycle Balance");
    }
}

class UniCycle extends Cycle{
    public void balance(){
        System.out.println("UniCycle Balance");
    }
}
class BiCycle extends Cycle{
    public void balance(){
        System.out.println("BiCycle Balance");
    }
}
class TriCycle extends Cycle{

}

public class CycleDemo {
    public static void main(String args[]){
        ArrayList<Cycle> cycleList=new ArrayList<>();
        cycleList.add(new UniCycle());
        cycleList.add(new BiCycle());
        cycleList.add(new TriCycle());

        cycleList.get(0).balance();
        cycleList.get(1).balance();
    }
}
