package evaluation;

public class Problem1 {
    public static void main(String[] args) {
        char c = 'F';
        int  ind = c - 'A' + 1;

        char temp = 'A';

        for (int i = 0; i < ind; i++) {
            for (int j = i; j < ind - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print(temp + " ");
                } else {
                    System.out.print("  ");
                }
            }
            temp++;
            System.out.println();
        }

        temp -= 2;
        for (int i = ind - 1; i > 0; i--) {
            for (int j = ind - 1; j > i - 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                if (k == 0 || k == i - 1) {
                    System.out.print(temp + " ");
                } else {
                    System.out.print("  ");
                }
            }
            temp--;
            System.out.println();
        }


    }
}