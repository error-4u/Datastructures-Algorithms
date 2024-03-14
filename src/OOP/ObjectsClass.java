package OOP;

import java.util.Scanner;

public class ObjectsClass {
    public static void main(String[] args) {

        Student s1 = new Student();


       System.out.println(s1.roll);
    
    }

    static class Student{
        int roll= 4;
        String name = " vihal kumar";
        float marks;
        void gret(){
          System.out.println("hello " + this.name);

 }
        Student (){
            this.roll = 32;
            this.name = "Chetan kumar";
            this.marks = 87.7f;
        }

    }

}



