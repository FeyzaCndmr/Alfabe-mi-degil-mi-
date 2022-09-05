
import java.util.Scanner;

class Soru1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Bir karakter giriniz.");
            String chr = in.nextLine();
            char c = chr.charAt(0);
            if (Character.isLetter(c))
                System.out.println(c + " bir alfabe karakteri");
            else
                System.out.println(c + " bir alfabe karakteri degil.");
        } finally {
            in.close();
        }

    }

}