package OOP.Singleton;

public class SingleTon {
    private SingleTon(){

    }
    private static SingleTon Instance;

    public static SingleTon getInstance(){
        if(Instance == null){
            System.out.println("hello");
             Instance = new SingleTon();
        }

            return Instance;

    }
}
