import java.util.Scanner;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("Chương trình tính nghiệm phương trình bậc 1");
        System.out.println("Mời nhập vào các Hằng số Ax + B = 0");

        Scanner scanner = new Scanner(System.in);
        System.out.println("A : ");
        double a = scanner.nextDouble();
        System.out.println("B : ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô Nghiệm");
            }
        }
        else {
            double x = -b/a;
            System.out.println("Phương trình có nghiệm là x = "+ x);
        }
    }
}
