/**Ecrire un programme qui affiche le résultat ci-dessous au terminal en utilisant la boucle for avec indice allant de 1 à 5 inclus et l’instruction break.
N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main. */

public class Ex7
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5 ;i++)
        {
            if(i > 2)
            {
                System.out.println("Stop ! ");
                break;
            }

            System.out.println("Hello World " + i);
        }
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution