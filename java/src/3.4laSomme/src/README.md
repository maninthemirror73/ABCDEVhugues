#Exercice 3.4 : La somme

Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

La somme des nombres jusque 5 est: 15

VARIABLES

i est un ENTIER
nombreDeDepart est un ENTIER <-- 0
sommeDesEntiers est un ENTIER

TRAITEMENT

AFFICHER "Entrer un nombre entier :"
LIRE nombreDeDepart

POUR i = 0 TANT QUE i <= nombreDeDepart INCREMENTATION i
ALORS 
sommeDesEntiers + sommeDesEntiers + i

AFFICHER sommeDesEntiers 


