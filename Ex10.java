/**Ecrire un programme dont la méthode "main" prend en argument des nombres entiers et affiche la valeur du premier en base 2. Le programme doit vérifier que l’utilisateur a rentré un argument. Si aucun argument n’a été rentré, le programme affiche un message :

Usage: java GetBinaryValue

Si plusieurs arguments sont rentrés, on affiche la valeur du premier argument:

Received x arguments. The arguments are: xa xb xc... */

public class Ex10
{
    public static void main(String args[])
    {
        if(args[0] == null | args.length == 0)
        {
            System.out.println("GetBinaryValue");
            System.exit(0);
        }

        System.out.printf("Received %d arguments. \nThe arguments are:", args.length);

        for(String temp : args)
        {
            System.out.println(temp);
        }

        int firstValue = Integer.parseInt(args[0]);

        System.out.printf("The binary representation of %d is %s \n",firstValue,Integer.toBinaryString(firstValue) );
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution