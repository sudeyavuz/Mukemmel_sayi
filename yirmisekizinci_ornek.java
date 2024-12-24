package JAVA101;
import java.util.Scanner;
public class yirmisekizinci_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz: ");
        int sayi= input.nextInt();

        int deneme=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                deneme+=i;
            }
        }
        if (sayi==deneme){
            System.out.println(sayi+" : bir mükemmel sayıdır");
        }else {
            System.out.println(sayi+" : bir mükemmel sayı değildir");
        }
    }
}
