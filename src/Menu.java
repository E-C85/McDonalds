import java.util.Scanner;

public class Menu {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        //*******************Mc Donald's Projesi************************8
        //Mc Donald's ekran ciktisi ve Menu gosterimi
        //hangi menuyu sectigi sorulur
        //icecek tercihi sorulur

        //icecek boyutu sorulur
        //chips tercihi sorulur
        // chips boyutu sorulur
           menuekranciktisi();


           menusecimi();
           String menusecim=menusecimi();
           icecekTercihi();




    }

    private static void icecekTercihi() {
        System.out.println("Hangi icecegi tercih ediyorsunuz?");
        System.out.println("\n1. Cocacola"+"\n2. Fanta"+"\n3. Sprite"+"\n4. Nescafe"+"\n5. Cay");
        int tercihi=sc.nextInt();
        switch (tercihi) {
            case 1:
                System.out.println("Cocacola tercih ettiniz..");
                boyutSecimi();
                break;
            case 2:
                System.out.println("Fanta tercih ettiniz..");
                boyutSecimi();
                break;
            case 3:
                System.out.println("Sprite tercih ettiniz..");
                boyutSecimi();
                break;
            case 4:
                System.out.println("Nescafe tercih ettiniz..");
                boyutSecimi();
                break;
            case 5:
                System.out.println("Cay tercih ettiniz..");
                break;
            default:
                System.out.println("Yanlis bir tercih yaptiniz.Lutfen sayi giriniz..");
                icecekTercihi();
        }
    }

    private static void boyutSecimi() {
        System.out.println("Lutfen boyut secimi yapiniz  :");
        System.out.println("\nBuyuk \nOrta  \nKucuk ");
        String secimBoyut=sc.next();
        if(secimBoyut.equals("buyuk")){
            System.out.println("Iceceginiz "+ secimBoyut +" boy olarak hazirlaniyor");
        }else if(secimBoyut.equals("orta")){
            System.out.println("Iceceginiz "+ secimBoyut +" boy olarak hazirlaniyor");
        }else if(secimBoyut.equals("kucuk")){
            System.out.println("Iceceginiz "+ secimBoyut +" boy olarak hazirlaniyor");
        }else{
            System.out.println("Yanlis bir tercih yaptiniz.Lutfen tekrar giriniz..");
            boyutSecimi();
        }

    }

    public  static String  menusecimi() {
        while (true){
            System.out.println("lutfen menu secimini giriniz");String secim=sc.nextLine();
            if (secim.equalsIgnoreCase("Hamburger") || secim.equalsIgnoreCase("Cheeseburger")||
                    secim.equalsIgnoreCase("Double Cheese Burger")){
                return secim;


            }else {
                System.out.println("Dogru secim yapiniz");
                menuekranciktisi();
            }
        }


    }

    private static void menuekranciktisi() {
        System.out.println("***********************8 Mc Donald's Hosgeldiniz**********************");
        System.out.println("Lutfen Menu Seciniz");
        System.out.println("Hamburger");
        System.out.println("Cheeseburger");
        System.out.println("Double Cheese burger");

    }
}
