package Giris;
        import java.util.Scanner;

public class Entrance {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int mat,fizik,kimya,tarih,turkce,muzık;
        //Scanner oluşturma
        Scanner inp = new Scanner(System.in);
        //Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzık = inp.nextInt();

        double  sonuc = (mat+fizik+kimya+tarih+turkce+muzık)/6;
        System.out.println("Ortalamanız : "+ sonuc);
    }
}
