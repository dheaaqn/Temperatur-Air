import java.util.Scanner;

public class TempAir {
    public static void main (String[] args){
        System.out.println("Contoh Penggunaan IF 3 Kasus : Mengetahui Wujud Air dari Temperaturnya");
        System.out.print("Input Temperatur Air : ");
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        if (T < 0){
            System.out.print("Wujud Air Beku : "+T);
        }else
            if ((0<=T) && (T<=100)){
                System.out.print("Wujud Air Cair : "+T);
            }else
                if (T>100){
                    System.out.print("Wujud Air Uap Gas : "+T);
                }
    }
}
