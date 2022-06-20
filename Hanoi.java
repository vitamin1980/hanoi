import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        hanoi(n,1,3,2);

    }

    public static void move(int begin, int end){
        System.out.println("Move from "+begin+" to "+end);
    }

    public static void hanoi(int n, int begin, int end, int inter){
        if (n == 1) {
            move(begin, end);
        }
        else {
            hanoi(n-1,begin, inter, end);
            move(begin, end);
            hanoi(n-1, inter, end, begin);

        }




    }

}
