package OOP3;

public class box {
    int h;
    int l;
    box(){
        this.h= 1;
        this.l = 2;
    }
    box(int s){
        this.h = s;
    }
    box( int d, int b){

        this.l = d;
        this.h = b;
    }

    box(box old){
        this.l = old.h;
    }
}
