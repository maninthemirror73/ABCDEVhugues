#Exercice 3.3 : Les nombres suivants
Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres
suivants.
Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :
Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27
Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version
avec une boucle pour.

VARIABLES
nombreDeDepart est un ENTIER
i est un ENTIER <-- 1

TRAITEMENT
ECRIRE "Entrer un nombre entier"
LIRE nombreDeDepart
TANT QUE i <= 10
ALORS
ECRIRE nombreDeDepart + i
ET i += 1
/////////////////////////////
POUR i = 1 ; i <= 10 ; i += 1
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///