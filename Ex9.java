// Que se passera-t-il si l’on exécute le programme suivant ?

public class Ex9
{
    public static void main(String args[])
    {
        int t1[] = {1,2,3};
        int t2[] = new int[4];

        for(int i = 0; i < 4; i++)
        {
            t2[i] = 2*i;
        }

        t2 = t1; // on echange les pointeurs de tab donc mtn t2 = &t1 or t1 est de taille 3

        for (int i = 0; i < 4; i++) 
        {
            System.out.println(t2[i]); // Erreur on affiche a &t1[0] + 4 IMP on lit un espace mémoire non alloué
        }
    }
}



// javac ExX.java --> Compilation 
// java ExX.java  --> Exécution