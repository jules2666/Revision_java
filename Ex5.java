/*Ecrivez un programme qui initialise un tableau de chaines de caractères (des objets de type String), comme indiqué ci-dessous, puis les affiche une après l’autre au terminal en utilisant la boucle for…each. 

N.B. : Vous devez nommer votre classe Main, et écrire votre programme dans la méthode main. */

public class Ex5
{
    public static void main(String args[])
    {
        String[] list = {"one","two","three",null,"four","five"};

        for(String temp : list)
        {
            System.out.println(temp);
        }
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution