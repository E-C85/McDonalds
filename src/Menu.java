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
           icecekTercihi();
           chipstercih();

           decorations("Bizi tercih ettiginiz icin tesekur eder iyi gunler dileriz..");


    }

    public static void decorations(String text) {
        System.out.println("************************  ****  *************************");
        System.out.println(text);
        System.out.println("************************  ****  *************************");
    }

    public static void cipsboyut(){

            decorations("Cipsi Hangi Boyda Tercih Edersiniz:\ncips kucuk boy  ->1\nCips orta boy  ->2\nCips buyuk boy ->3");

            int boyutsecim=sc.nextInt();
        if (boyutsecim==1){
            System.out.println("Kucuk Boy Cips Hazirlaniyor");
        } else if (boyutsecim==2) {
            System.out.println("Orta Boy Cips hazirlaniyor");

        }else if (boyutsecim==3){
            System.out.println("Buyuk Boy Cips hazirlaniyor");
        }else {
            System.out.println("yanlis girdniz,yeniden boyut seciniz");
            cipsboyut();
        }

    }

    private static void chipstercih() {
        decorations("\ncips istermisiniz?\n");
        System.out.println("Evet veya Hayir seciniz\n");
        String cipssecimi=sc.next();
        if(cipssecimi.equalsIgnoreCase("Evet")){

            cipsboyut();
        }else if (cipssecimi.equalsIgnoreCase("Hayir")){
            System.out.println("Cips durduruldu");
        }else {
            System.out.println("yanlis giris yaptiniz");
            chipstercih();
        }

    }


    private static void icecekTercihi() {

        decorations("Hangi icecegi tercih ediyorsunuz?(Lutfen sayi giriniz)\n1.Cocacola \n2.Fanta \n3.Sprite \n4.Nescafe \n5.Cay");

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
        decorations("Lutfen boyut secimi yapiniz  :\nBuyuk \nOrta  \nKucuk");

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

            decorations("lutfen menu secimini giriniz");

            String secim=sc.nextLine();
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
        decorations("***************** Mc Donald's Hosgeldiniz****************" +
                "\nLutfen Menu Seciniz\nHamburger\nCheeseburger\nDouble Cheese burger\n");


    }

}
