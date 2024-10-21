/**
Ecrire un programme qui lit le premier argument donné à la méthode "main" ( réel négatif ou positif), le convertit en type primitif double et affiche son contenu au terminal.

Astuce: utilisez Double.parseDouble().
 */

public class Ex14
{
    public static void main(String args[])
    {
         if(args[0] == null | args.length == 0)
        {
            System.out.println("Empty args");
            System.exit(0);
        }

        double valueDouble = Double.parseDouble(args[0]);

        System.out.println("value is: " + Double.toString(valueDouble));
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution