import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        double width;
        double height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width : ");
        width = scanner.nextFloat();

        System.out.println("Enter Height : ");
        height = scanner.nextFloat();

        System.out.println("Area is : " + (width*height));

    }
}
