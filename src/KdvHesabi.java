import java.util.Scanner;
public class KdvHesabi {

    public static void main(String[] args) {
        //Değişkenleri olustur
        //Kdv'siz Fiyatı Kullanıcıdan alınıcak
        double fiyat, kdvliFiyat, kdvTutarı, kdvOran=0.18;


        //Scanner sınıfı tanımla

        Scanner inp = new Scanner(System.in);

        System.out.println("Ürün Fiyatını Giriniz: ");
        fiyat=inp.nextDouble();



        System.out.println("Fiyatı: "+fiyat);

        double cokTutar=(fiyat>1000) ? 0.08:kdvOran;

        //KDV'li fiyatı ve Kdv Tutarını hesaplat

        System.out.println("KDV Oranı: "+cokTutar);

        kdvTutarı=fiyat*cokTutar;
        System.out.println("KDV Tutarı: = "+kdvTutarı);

        kdvliFiyat=fiyat + kdvTutarı;
        System.out.println("KDV'li Fiyatı= "+kdvliFiyat);


        System.out.println();


    }

}
