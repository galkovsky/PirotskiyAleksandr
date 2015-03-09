

import java.util.Scanner;

public class Horse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter move of horse:");
        String hod = scan.nextLine();
        Algoritm algoritm = new Algoritm();
        algoritm.alg(hod);

        }

}


