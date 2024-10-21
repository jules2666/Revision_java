 # Création des fichiers Java

Pour créer les fichiers Java, utilisez la commande suivante :

```bash
for i in \$(seq 1 5); do touch "Ex\$i.java"; done
Compilation et exécution des fichiers Java
Pour compiler et exécuter les fichiers Java, utilisez les commandes suivantes pour chaque fichier :

Compilation
Pour compiler un fichier Java, utilisez javac comme suit :


javac ExX.java  # Remplacer X par le numéro de l'exercice
Exécution
Pour exécuter le fichier compilé, utilisez java comme suit :


java ExX  # Remplacer X par le numéro de l'exercice
Clonage du dépôt Git (connexion SSH)
Pour cloner le dépôt Git via SSH, utilisez la commande suivante :


git clone git@github.com:jules2666/Revision_java.git
