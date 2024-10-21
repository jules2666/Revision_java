/*Ecrivez un programme qui affiche 10 fois "Hello World" au terminal en utilisant la boucle while. 

N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main.
*/

public class Ex2
{
    public static void main(String args[])
    {
        int compteur = 0;

        while(compteur < 10 )
        {
            System.out.println("Hello World");
            compteur++;
        }
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution