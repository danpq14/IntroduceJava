import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("chương trình kiểm tra năm nhuận");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn muốn kiểm tra");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year %100 !=0) {
            System.out.printf("Năm %d là năm nhuận",year);
        }
        if (year % 100 == 0 && year % 400 == 0 ) {
            System.out.printf("Năm %d là năm nhuận",year);
        }
        else {
            System.out.printf("Năm %d ko phải là năm nhuận", year);
        }
    }
}
