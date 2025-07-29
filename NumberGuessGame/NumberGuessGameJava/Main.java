import java.util.Random;
import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int geheimzahl = random.nextInt(100) + 1;
            int versuche = 0;
            int eingabe;
            System.out.println("willkommen bei dem spiel Guess the number");
            System.out.println("raten sie bitte eine nummer zwischen 1 und 100");
            System.out.println("sie haben nur 6 versuchen");
            do {
              
                eingabe = scanner.nextInt();
                 versuche++;
              
                if(eingabe < geheimzahl){
                    System.out.println("leider klein");
                    
                }else if(eingabe > geheimzahl){
                    System.out.println("leider zu gross");
                    
                }else{
                    System.out.println("richtig geraten! du hast die nummer in " + versuche + " versuchen geraten.");
                    
                }
                
                
            } while (eingabe != geheimzahl && versuche < 6);

             if( eingabe != geheimzahl){
                    System.out.println("Sie haben leider verloren, die Richtig zahl war : "+ geheimzahl);
                    
                }
            
        
        
        }
        


    }
}

