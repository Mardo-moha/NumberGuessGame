import java.util.Random;
import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int geheimzahl = random.nextInt(100) + 1;
        int versuche = 0;
        int eingabe;
        System.out.println("willkommen bei dem spiel Guess the number");
        do { 
        System.out.println("raten sie bitte eine nummer zwischen 1 und 100");
        eingabe = scanner.nextInt();
        versuche++;
        if(eingabe < geheimzahl){
            System.out.println("leider klein");

        }else if(eingabe > geheimzahl){
            System.out.println("leider zu gross");

        }else{
            System.out.println("richtig geraten! du hast die nummer in " + versuche + "versuche");
            
        }
            
            
        } while (eingabe != geheimzahl);
        scanner.close();


    }
}

