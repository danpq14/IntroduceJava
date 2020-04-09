import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Ứng dụng chuyển đổi tiền tệ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tỉ giá hiện tại, bao nhiêu VND đổi được 1 USD? : ");
        double rate = sc.nextDouble();
        System.out.println("Nhập số tiền VNĐ : ");
        double vnd = sc.nextDouble();
        float usd = (float) (vnd/rate);
        System.out.printf("Số tiền đổi sang USD là : %s", usd);
    }
}
