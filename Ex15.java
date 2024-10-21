/**
 *  Ecrivez un programme qui calcule le quotient et le reste de deux nombre entiers (de type int) et qui affiche le résultat au terminal.
 */

public class Ex15
{
    public static void main(String args[])
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.printf("Quotient is %d \nRemainder is %d",a/b,a%b);
    }
}
// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution