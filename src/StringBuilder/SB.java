package StringBuilder;

public class SB {

// TIME COMPLEXITY = 0 ( N^2 )
/*    This is not the effective way to print cuz every time it creates new object and the prev onj is wasted
     and we cannot modify the string so we need a DS to  do this efffectively
 */

    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }

}
