import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = sc.nextInt();
        int b = 16;
        String s = "";
        while (n > 0) {
            int r = n % b;
            if (r < 10) {
                s = r + s;
            } else {
                s = (char) (r + 55) + s;
            }
            n /= b;
        }
        System.out.println("So vua nhap o he co so B la: " + s);
    }
}
