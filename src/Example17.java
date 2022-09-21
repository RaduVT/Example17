import java.util.Scanner;
public class Example17 {
    public static void main (String[] args) {

        //h=hours m=minutes s=seconds
        int h, m, s;
        Scanner imputValue;
        System.out.println("Enter the Hour");

        imputValue = new Scanner(System.in);
        System.out.println("Hours:");
        h = imputValue.nextInt();
        System.out.println("Minutes:");
        m = imputValue.nextInt();
        System.out.println("Seconds:");
        s = imputValue.nextInt();

        s = s + 1;
        if (s == 60) {
            m = m+1;
            s = 0;
            System.out.println(m);
        } if (m == 60) {
            h = h + 1;
            m = 0;
            System.out.println(h + 1);
            System.out.println(h + " hours " + m + " min " + s + " sec ");
        } else {
            System.out.println(h + " hours " + m + " min " + s + " sec ");
        }
    }
}
