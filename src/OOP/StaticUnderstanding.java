package OOP;

public class StaticUnderstanding {

   static  class Test{
        String name;

        Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("chetan");
        Test b = new Test("vishal");


        System.out.println(a.name);
        System.out.println(b.name);
    }
}
