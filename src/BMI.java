import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        System.out.println("Chương trình tính BMI");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cân nặng : ");
        float weight = scanner.nextFloat();
        System.out.println("Nhập chiều cao (m) : ");
        float height = scanner.nextFloat();

        float bmi = weight/(height*height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        }
        if (25<= bmi && bmi < 30) {
            System.out.println("Overweight");
        }
        if (bmi >= 30) {
            System.out.println("Obese");
        }
    }
}
