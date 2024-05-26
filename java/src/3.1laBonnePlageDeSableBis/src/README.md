#Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

VARIABLES
nombreSaisi est un ENTIER
nombreChoisi est un ENTIER <--2

TRAITEMENT

AFFICHER "Entrer un nombre entre 1 et 3"
LIRE nombreSaisi 

TANT QUE nombreSaisi != nombreChoisi
ALORS
AFFICHER "Entrer à nouveau un nombre entre 1 et 3"
LIRE nombreSaisi

AFFICHER "Bravo vous avez réussi !"