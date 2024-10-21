# Création et gestion de fichiers Java avec Git

## Création des fichiers Java automatiquement

Pour créer plusieurs fichiers `ExX.java` (où X est un nombre variant de 1 à 5 par exemple), tu peux utiliser la commande suivante :

```bash
for i in $(seq 1 5); do touch "Ex$i.java"; done

Compilation et exécution des fichiers Java
Pour compiler et exécuter les fichiers Java, utilise les commandes suivantes pour chaque fichier :

Compilation :
Pour compiler un fichier Java, utilise javac comme suit :

bash :
Copier le code :
javac ExX.java  # Remplacer X par le numéro de l'exercice
Exécution :
Pour exécuter le fichier compilé, utilise java comme suit :

bash
Copier le code
java ExX  # Remplacer X par le numéro de l'exercice

Clonage du dépôt Git (connexion SSH)
Pour cloner le dépôt Git via SSH, utilise la commande suivante :

bash
Copier le code
git clone git@github.com:jules2666/Revision_java.git
