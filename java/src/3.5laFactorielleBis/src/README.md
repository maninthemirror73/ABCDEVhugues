#Exercice 3.5 : La factorielleBis

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

La factorielle de 8 est: 40320

NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8

VARIABLES

nombreDeDepart est un ENTIER
factorielle est un ENTIER <-- 1
i est un ENTIER

TRAITEMENT

AFFICHER "Entrer un nombre :"
LIRE nombreDeDepart

POUR i <-- 0 TANT QUE i <= nombreDeDepart INCREMENTER i
ALORS
factorielle <-- factorielle * i

AFFICHER factorielle
