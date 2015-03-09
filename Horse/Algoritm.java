
public class Algoritm {
    public void alg (String hod){

        char a = hod.toUpperCase().charAt(0);
        char b = hod.toUpperCase().charAt(1);
        char c = hod.toUpperCase().charAt(2);
        char d = hod.toUpperCase().charAt(3);

        int a1 = 0;
        int c1 = 0;
        switch (a) {
            case 'A' :a1 = 1;break;
            case 'B':a1 = 2;break;
            case 'C':a1 = 3;break;
            case 'D':a1 = 4;break;
            case 'E':a1 = 5;break;
            case 'F':a1 = 6;break;
            case 'G':a1 = 7;break;
            case 'H':a1 = 8;break;

            default:
                System.err.println("It`s incorrect move for chess");
                System.exit(1);
        }

        switch (c) {
            case 'A':c1 = 1;break;
            case 'B':c1 = 2;break;
            case 'C':c1 = 3;break;
            case 'D':c1 = 4;break;
            case 'E':c1 = 5;break;
            case 'F':c1 = 6;break;
            case 'G':c1 = 7;break;
            case 'H':c1 = 8;break;

            default:
                System.err.println("It`s incorrect move for chess");
                System.exit(1);
        }

        int b1 = Character.getNumericValue(b);
        int d1 = Character.getNumericValue(d);

        if ((b1 > 8) ||(b1 < 1)||(d1 < 1) || (d1 > 8)) {
            System.err.println("It`s incorrect move for chess");
            System.exit(1);
        }

        if (   (Math.abs(a1-c1) == 2 && Math.abs(b1-d1)== 1 ) ||
                ( Math.abs(a1-c1) == 1 && Math.abs(b1-d1)==2)   ) {
            System.out.println("Yes, it`s horse!!!");

        }

        else {
            System.out.println("No, it`s other animal");
        }



    }




}
