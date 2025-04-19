/**
1	3	5	7
2	4	6	8
9	11	13	15

Ecrire un programme qui initialise une matrice sous la forme d'un tableau bidimensionnel, comme indiqué ci-dessus. Ensuite, le programme lit la matrice des éléments à l'aide de deux boucles for imbriquées et affiche ses éléments au terminal, sous le format décrit ci-dessous.N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main. */

public class Ex8
{
    public static void main(String args[])
    {
        int[][] listInt = {{1,3,5,7},{2,4,6,8},{9,11,13,15}};

        for(int i = 0; i < listInt.length ;i++) // la taille de la ligne (combien y'a t-il de lignes)
            {
                for(int j = 0; j < listInt[i].length ;j++) // la taille du sous tableau de tab[i] donc la taille de la colonne (combien y'a t-il de colonnes)
                {
                    System.out.print(" " + listInt[i][j] + " ");
                }
                System.out.printf("\n");
            }
    }
}

// Deuxième méthode 

class Main
{
    public static void main(String args[])
    {
        
    int Matrice [][] = {{1,2,3},{4,5,6},{7,8,9}};
    
    for(int temp[] : Matrice)
    {
        for(int ligne : temp)
        {
            System.out.print(ligne + " ");
        }
        System.out.println();
    }
        
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution
