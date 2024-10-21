/*Ecrivez un programme qui affiche "Hello World" suivi d'un compteur, au terminal, en utilisant une boucle for. 

N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main.*/

public class Ex4
{
    public static void main(String args[])
    {
        for(int i = 1; i < 7;i++)
        {
            System.out.println("Hello World" + i);
        }
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution