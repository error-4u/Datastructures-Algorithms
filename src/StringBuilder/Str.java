package StringBuilder;

public class Str {

    /* == checks wheather both a abd b are pointing to the same obj or not */
    /*  .equals checks wheather the value of both the ref var are same or not */
    public static void main(String[] args) {
        String a = "vishal";
        String b = new String("vishal");
        if( a.equals(b)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
