/**
 * Ecrire un programme qui lit le premier argument donné à la méthode "main" (négatif ou positif), le convertit en type primitif long en utilisant la classe wrapper Long et l’affiche au terminal.
 */

public class Ex12
{
    public static void main(String args[])
    {
        if(args[0] == null | args.length == 0)
        {
            System.out.println("Empty args");
            System.exit(0);
        }

        long valueLong = Long.parseLong(args[0]);

        System.out.println("value is: " + Long.toString(valueLong));
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution