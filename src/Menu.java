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
