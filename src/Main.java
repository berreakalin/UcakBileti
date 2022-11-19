import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, tl, reduction, total;
        int age, type;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km= inp.nextDouble();

        tl= (km*0.10);

        System.out.print("Yaşınızı giriniz: ");
        age= inp.nextInt();
        if (km<0 && age<0) {
            System.out.println("Hatalı Veri Girdiniz!"); //Yaş ve mesafenin pozitif değer alması için
        }

        System.out.print("Yolculuk tipini giriniz (1-TekYön,2-GidişDönüş): ");
        type= inp.nextInt();

        switch (type) {
            case 1:
                if (age<12) {
                    reduction= (tl*0.5);
                    total = tl-reduction;
                }
                else if (12<age && age<24) {
                    reduction= (tl*0.1);
                    total = tl-reduction;
                }
                else if (65<age) {
                    reduction= (tl*0.3);
                    total = tl-reduction;
                }
                else {
                    total = tl;
                }
                System.out.print("Toplam Tutar: "+ total + " TL");
                break;

            case 2:
                if (age<12) {
                    reduction= (tl*0.5);
                    total = tl-reduction;
                }
                else if (12<age && age<24) {
                    reduction= (tl*0.1);
                    total = tl-reduction;
                }
                else if (65<age) {
                    reduction= (tl*0.3);
                    total = tl-reduction;
                }
                else {
                    total = tl;
                }
                System.out.println("Toplam Tutar: "+ 2*(total-(total*0.2)) +" TL");
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz!");
                break;



        }


    }









}