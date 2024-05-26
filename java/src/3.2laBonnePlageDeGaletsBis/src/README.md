#Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

VARIABLES

nombreChoisi est un ENTIER <-- 12
nombreSaisi est un ENTIER

TRAITEMENT

AFFICHER "Entrer un nombre entre 10 et 20"
LIRE nombreSaisi

SI nombreSaisi < 10
ALORS
AFFICHER "Plus grand !"

SINON SI nombreSaisi > 20
ALORS
AFFICHER "Plus petit !"

SINON SI nombreSaisi != nombreChoisi
ALORS 
AFFICHER "Recommencez !"

SINON 
AFFICHER nombreSaisi, “Yes, you did it !”


