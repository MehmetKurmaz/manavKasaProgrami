import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKilosu,elmaKilosu,domatesKilosu,muzKilosu,patlicanKilosu,toplam;
        int armut,elma,domates,muz,patlican;
        armutKilosu=2.14;
        elmaKilosu=3.67;
        domatesKilosu=1.11;
        muzKilosu=0.95;
        patlicanKilosu=5.00;
        System.out.print("Armut Kac Kilo :");
        Scanner input=new Scanner(System.in);
        armut=input.nextInt();
        System.out.print("Elma Kac Kilo :");
        elma=input.nextInt();
        System.out.print("Domates Kac Kilo :");
        domates=input.nextInt();
        System.out.print("Muz Kac Kilo :");
        muz=input.nextInt();
        System.out.print("Patlican Kac Kilo :");
        patlican=input.nextInt();
        toplam=(armut*armutKilosu)+(elma*elmaKilosu)+(domates*domatesKilosu)+(muz*muzKilosu)+(patlican*patlicanKilosu);
        System.out.println("Toplam Ucret :"+toplam);
    }
}