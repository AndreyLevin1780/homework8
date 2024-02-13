import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задание N1");

        int [] first = new int[3];
        first [0] = 1;
        first [1] = 2;
        first [2] = 3;
        //System.out.println(first[0]);
        //System.out.println(first[1]);
        //System.out.println(first[2]);

        double [] second = {1.57, 7.654, 9.986};
        //System.out.println(second[0]);
        //System.out.println(second[1]);
        //System.out.println(second[2]);

        char [] third = new char [] {'a', 'b', 'c'};
        //System.out.println(third[0]);
        //System.out.println(third[1]);
        //System.out.println(third[2]);

        System.out.println();
        System.out.println("Задание N2");

        for (int ind = 0; ind < first.length; ind++) {
            if (ind == first.length - 1) {
                System.out.println(first[ind]);
                break;
            }
            System.out.print(first[ind] + ", ");
        }

        for (int ind = 0; ind < second.length; ind++) {
            if (ind == second.length - 1) {
                System.out.println(second[ind]);
                break;
            }
            System.out.print(second[ind] + ", ");
        }

        for (int ind = 0; ind < third.length; ind++) {
            if (ind == third.length - 1) {
                System.out.println(third[ind]);
                break;
            }
            System.out.print(third[ind] + ", ");
        }

        System.out.println();
        System.out.println("Задание N3");

        for (int ind = 2; ind >= 0; ind--) {
            if (ind == 0) {
              System.out.println(first[ind]);
                break;
            }
            System.out.print(first[ind] + ", ");
        }

        for (int ind = 2; ind >= 0; ind--) {
            if (ind == 0) {
                System.out.println(second[ind]);
                break;
            }
            System.out.print(second[ind] + ", ");
        }

        for (int ind = 2; ind >= 0; ind--) {
            if (ind == 0) {
                System.out.println(third[ind]);
                break;
            }
            System.out.print(third[ind] + ", ");
        }

        System.out.println();
        System.out.println("Задание N4");

        for (int ind = 0; ind < first.length; ind++) {
            if (first[ind] % 2 != 0) {
                first[ind]++;
                }
            //System.out.print(first[ind] + " ");
        }
        System.out.println(Arrays.toString(first));
    }
}