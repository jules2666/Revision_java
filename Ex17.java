/**Ecrivez un programme qui prend une chaine de caractères en argument qui représente une phrase. Le programme:

1. affiche la longueur de la phrase, en caractères

2. affiche l’index de la position dans la phrase d’un certain mot

3. affiche les mots qui composent la phrase, un mot par ligne

4. affiche les mots qui composent la phrase, tout en minuscules

5. affiche les mots qui composent la phrase, tout en majuscules

6. vérifie si la phrase contient un certain mot

7. vérifie si la phrase finit par un point, un point d’exclamation ou un point d’interrogation

8. remplace toutes les occurrences d’un certain mot par un autre mot */

public class Ex17
{
    public static void main(String args[])
    {
          if(args[0] == null | args.length == 0)
        {
            System.out.println("Empty args");
            System.exit(0);
        }

        
    }
}

// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution