import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int mat,fizik,kimya,turkce,muzik,sayac=0,toplam=0; double ort;

        System.out.print("Matematik notunu giriniz:");
        mat = in.nextInt();
        if(mat>=0 && mat<=100){
            sayac++;
            toplam+=mat;
        }
        System.out.print("Fizik notunu giriniz:");
        fizik = in.nextInt();
        if(fizik>=0 && fizik<=100){
            sayac++;
            toplam+=fizik;
        }
        System.out.print("Kimya notunu giriniz:");
        kimya = in.nextInt();
        if(kimya>=0 && kimya<=100){
            sayac++;
            toplam+=fizik;
        }
        System.out.print("Turkce notunu giriniz:");
        turkce = in.nextInt();
        if(turkce>=0 && turkce<=100){
            sayac++;
            toplam+=turkce ;
        }
        System.out.print("Muzik notunu giriniz:");
        muzik = in.nextInt();
        if(muzik>=0 && muzik<=100){
            sayac++;
            toplam+=muzik;
        }
        ort=(double)toplam/sayac;
        System.out.println("Ortalamaniz :"+ ort);
        String sonuc=(ort<55) ? "Sinifta kaldiniz" :"Sinifi gectiniz";
        System.out.println(sonuc);

    }
}
