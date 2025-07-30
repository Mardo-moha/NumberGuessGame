#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    char nochmalSpielen ;
    do
    {
        int min, max;
       
    
    printf("Welcome to the Guessing Game!\n");

    int geheimzahl, tipp, versuche = 0;

    printf("bitte geben sie den startwert des zahlenbereiches ein (z.b 1) : \n");
    scanf("%d", &min);
    printf("geben sie jetzt bitte den endwert des zahlenbereiches ein(muss größer als den startwert ) :\n");
    scanf("%d", &max);
    

    srand(time(NULL));
    geheimzahl = rand() %(max - min + 1) + min;

  
    printf("versuch diese zahl jetzt zu raten\n");
    printf("sie haben 6 versuchen, um die nummer zu raten\n");

    do{
        printf("gib deinen tipp eine :");
        scanf("%d", &tipp);
        versuche++;

        if(tipp < geheimzahl){
            printf("leider zu klein.\n");
            printf("sie haben noch %d versuchen\n" ,6 - versuche);
        } else if (tipp > geheimzahl){
            printf("leider zu groß.\n");
            printf("sie haben noch %d versuchen\n", 6 - versuche);
        }else{
            printf("Richtig. du hast die zahl in %d versuche geraten.\n", versuche);
        
        }
       
        
        
    } while (tipp != geheimzahl && versuche < 6 );
    if (tipp != geheimzahl)
    {
        printf("sie haben leider verloren\n");
      


    }
      printf("möchten sie noch mal spielen \n");
        printf("Antworten sie bitte mit Y für ja und mit N für nein (y/N)\n");
        scanf(" %c" , &nochmalSpielen );
        
} while (nochmalSpielen == 'y' || nochmalSpielen == 'Y');
if (nochmalSpielen == 'n' || nochmalSpielen == 'N')
{
    printf("das spiel wird jetzt beendet\n");
}





    

    return 0;
        

     
}