#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    printf("Welcome to the Guessing Game!\n");

    int geheimzahl, tipp, versuche = 0;

    srand(time(NULL));
    geheimzahl = rand() % 100 + 1;

    printf("ich habe mir eine zahl zwischen 1 und 100 ausgedacht.\n");
    printf("versuch diese zahl jetzt zu raten");

    do{
        printf("gib deinen tipp eine :");
        scanf("%d", &tipp);
        versuche++;

        if(tipp < geheimzahl){
            printf("leider zu klein.\n");
        } else if (tipp > geheimzahl)
        {
            printf("leider zu groß.\n");
        }else{
            printf("Richtig. du hast die zahl in %d versuche geraten.\n", versuche);
        }
       
        
        
    } while (tipp != geheimzahl);

    return 0;
        

     
}