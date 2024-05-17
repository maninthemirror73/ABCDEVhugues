#Exercice 2.2 : Positif ou négatif (bis) ?

Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

VARIABLES
nombre1 ENTIER
nombre2 ENTIER
produit ENTIER

LIRE
produit <-- nombre1 * nombre2

AFFICHER Entrez le nombre 1;
LIRE affecter le résultat à nombre1
AFFICHER Entrez le nombre 2;
LIRE affecter le résultat à nombre2
LIRE
SI produit < 0
ALORS produit est négatif
AFFICHER "Le produit est négatif"
SINON produit est positif
AFFICHER "Le produit est positif"