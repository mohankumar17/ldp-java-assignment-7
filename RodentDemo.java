package com.java.assignments.assignment7;

abstract class Rodent{
    public Rodent(){
        System.out.println("This is Rodents Base Class");
    }
    public abstract void printMessage();
}

class Mouse extends Rodent{
    public Mouse(){
        System.out.println("This is Mouse");
    }
    @Override
    public void printMessage(){
        System.out.println("A mouse is a small mammal. Characteristically, " +
                "mice are known to have a pointed snout, small rounded ears, " +
                "a body-length scaly tail, and a high breeding rate");
    }
}

class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("This is Gerbil");
    }
    @Override
    public void printMessage(){
        System.out.println("A burrowing mouse-like rodent that is specially " +
                "adapted to living in arid conditions, found in Africa and Asia.");
    }
}


class Hamster extends Rodent{
    public Hamster(){
        System.out.println("This is Hamster");
    }
    @Override
    public void printMessage(){
        System.out.println("Hamsters are rodents belonging to the subfamily " +
                "Cricetinae, which contains 19 species classified in seven genera");
    }
}

public class RodentDemo {
    public static void main(String args[]){
        Mouse mObj=new Mouse();
        mObj.printMessage();

        Gerbil gObj=new Gerbil();
        gObj.printMessage();

        Hamster hObj=new Hamster();
        hObj.printMessage();
    }
}
