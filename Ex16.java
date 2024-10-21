/*import java.text.NumberFormat;
import java.util.Locale;
Ecrivez un programme qui prend un nombre réel (double) en argument et qui l’affiche au terminal en utilisant la localisation française, en format: nombre, devise (currency), nombre entier. La sortie du programme doit être la suivante :*/

import java.text.NumberFormat;
import java.util.Locale;

public class Ex16
{
    public static void main(String args[])
    {
         if(args[0] == null | args.length == 0)
        {
            System.out.println("Empty args");
            System.exit(0);
        }
        
        double nombre = Double.parseDouble(args[0]);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String currencyS = nf.format(nombre);

        NumberFormat nf1 = NumberFormat.getIntegerInstance(Locale.FRANCE);
        String currencyS1 = nf1.format(nombre);

        NumberFormat nf2 = NumberFormat.getNumberInstance(Locale.FRANCE);
        String currencyS2 = nf2.format(nombre);



        System.out.printf("Currency : %s \nNumber : %s \nInteger : %s \n ",currencyS,currencyS1,currencyS2  );

    }    
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution