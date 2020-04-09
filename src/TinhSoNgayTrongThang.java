import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        System.out.println("Chương trình tính số ngày trong 1 tháng");
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng mà bạn muốn kiểm tra : ");
        month = scanner.nextInt();
        String dayOfMonth;

        switch (month) {
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                dayOfMonth = "31";
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                dayOfMonth = "30";
                break;
            case 2 :
                dayOfMonth = "28 hoặc 29";
                break;

            default:
                dayOfMonth = "Bạn nhập ko chính xác";
        }
        if (dayOfMonth != "Bạn nhập ko chính xác") {
            System.out.printf("Tháng %d có %s ngày", month, dayOfMonth);
        } else  {
            System.out.println(dayOfMonth);
        }
    }
}
