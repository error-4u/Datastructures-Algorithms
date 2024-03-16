package OOP3;

public class B1 extends box {
    int side = 34;
    B1(){

        this.h = 2;
    }

    B1(int s){

        this.side = s;
    }
      B1(int s, int w){
        super(s);
        this.side = s;
        this.h = w;
    }




}
