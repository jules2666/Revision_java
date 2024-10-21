/**
 * Ecrire un programme qui lit le premier argument donné à la méthode "main" (true ou false), le convertit en boolean en utilisant la classe wrapper Boolean et affiche son contenu au terminal.
 */
public class Ex11
{
    public static void main(String args[])
    {
        if(args[0] == null | args.length == 0)
        {
            System.out.println("Empty args");
            System.exit(0);
        }

        boolean condition = Boolean.parseBoolean(args[0]);

        System.out.println("value is: " + Boolean.toString(condition));
    }
}


// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution