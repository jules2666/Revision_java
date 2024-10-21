/*Ecrivez un programme qui affiche 10 fois "Hello World" au terminal en utilisant la boucle do ... while. 

N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main.*/

public class Ex3
{
    public static void main(String args[])
    {
        int compteur = 0;

        do
        {
        System.out.println("Hello World");
        compteur++;
        }
        while(compteur < 10);
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution