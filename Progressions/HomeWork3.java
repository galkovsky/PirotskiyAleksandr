
import java.util.*;
public class HomeWork3 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        Arithmetic arprog = new Arithmetic();
        Geometric geomprog = new Geometric();

        if (arprog.arProg(arr)== true) {
            System.out.println("This is arithmetic progression");
        } else {
            System.out.println("This is not arithmetic progression");
        }

        if (geomprog.geomProg(arr)== true) {
            System.out.println("This is geometric progression");
        } else {
            System.out.println("This is not geometric progression");
        }
    }
}