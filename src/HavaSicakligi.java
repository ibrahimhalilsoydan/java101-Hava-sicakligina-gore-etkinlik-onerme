import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık değeri giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("-Hava kayak yapmak için uygun.-");

        } else if (heat >=5 && heat <=15 ){

            System.out.print("-Hava Sinemaya gitmek için Uygun- ");
            if (heat >=15 && heat <= 25){
                System.out.print("\n-Hava piknige gitmek için uygun-");
            }

        }else {
            System.out.print("-Hava yüzmek için uygun-");
        }

    }
}