#Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

VARIABLES

nombreSaisi est un ENTIER
nombreChoisi est un ENTIER = 15

TRAITEMENT

FAIRE AFFICHER "Entrer un nombre entre 10 et 20"
LIRE nombreSaisi

	SI nombreSaisi < 10 
	ALORS AFFICHER "Trop petit !"
	SINON SI nombreSaisi > 20
	ALORS AFFICHER "Trop petit !"

TANT QUE nombreSaisi != nombreChoisi 

AFFICHER "Yes, you did it !";