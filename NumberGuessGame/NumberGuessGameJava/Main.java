import java.util.Random;
import java.util.Scanner;

 class Main{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nochmal;
        do{
        
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
                   int ueberigeVersuche = 6 - versuche;
              
                if(eingabe < geheimzahl){
                    System.out.println("leider klein");
                    System.out.println(" sie haben noch " + ueberigeVersuche + " versuche");
                    
                }else if(eingabe > geheimzahl){
                    System.out.println("leider zu gross");
                      System.out.println(" sie haben noch " + ueberigeVersuche + " versuche");
                    
                }else{
                    System.out.println("richtig geraten! du hast die nummer in " + versuche + " versuchen geraten.");
                    
                }
                
                
            } while (eingabe != geheimzahl && versuche < 6);



             if( eingabe != geheimzahl){
                    System.out.println("Sie haben leider verloren, die Richtig zahl war : "+ geheimzahl);
                    
                }
                System.out.println("mächten sie noch mal spielen ? (j/n)");
                nochmal = scanner.next();
                }while (nochmal.equalsIgnoreCase("j")); 
                System.out.println("Danke fürs spielen , auf wiedersehen.");
            
        
        
        }
        


    }
}

