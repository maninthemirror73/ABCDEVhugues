Exercice 4.4 : Somme des valeurs d’un tableau

Écrire un algorithme calculant la somme des valeurs d’un tableau (on suppose que le tableau a été préalablement saisi avec 10 nombres réels (float)).

VARIABLES

i est un ENTIER
tableau est un NOMBRE REEL (FLOAT)
somme est un NOMBRE REEL (FLOAT)

TRAITEMENT

INITIALISATION DE tableau

POUR i <-- 0 
TANT QUE i < LONGUEUR DE tableau
INCREMENTER i
ALORS somme = somme + i
FIN POUR

AFFICHER "La somme des valeurs du tableau est :", somme