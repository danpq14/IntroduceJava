import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn : ");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Xin chào "+  name);
    }
}
