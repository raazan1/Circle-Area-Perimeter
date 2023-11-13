import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Dairenin yarıçapını giriniz: ");
        double r = input.nextDouble();

        double pi = 3.14;
        System.out.printf("Dairenin açısını giriniz: ");
        int a = input.nextInt();

        Calc(r,pi,a);

    }
    public static void Calc(double r, double pi,int a){
        double Area = pi*r*r;
        double Environment = 2*pi*r;
        System.out.print("Alan: "+Area+"\nÇevre: "+Environment);

        double b = (pi*(r*r)*a)/360;
        System.out.printf("\nDaire Diliminin Alanı: "+b);
    }
}