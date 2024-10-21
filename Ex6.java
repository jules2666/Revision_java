/** Ecrire un programme qui affiche le résultat ci-dessous au terminal en utilisant la boucle for avec indice allant de 1 à 5 inclus et l’instruction continue.
N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main. */

public class Ex6
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5;i++)
        {
            if(i != 3)
            {
                System.out.println("Hello World " + i);
                continue;
            }
            System.out.println("i = 3");

        }
    }
}


// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution