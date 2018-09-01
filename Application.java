import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        double rootMoney = 1.0;
        int month = 1;
        double rateRatio = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao von ban dau: ");
        rootMoney = sc.nextDouble();
        System.out.println("Nhap vao so thang gui: ");
        month = sc.nextInt();
        System.out.println("Nhap vao ti so lai suat(%/nam): ");
        rateRatio = sc.nextDouble();

        double result = 0;
        for (int i = 0; i < month; i++){
            result = rootMoney*(rateRatio/100)/12*month;
        }
        System.out.println("So tien lai la: "+result);
    }
}
