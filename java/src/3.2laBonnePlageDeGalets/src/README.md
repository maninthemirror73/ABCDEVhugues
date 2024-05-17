#Exercice 3.2 : La bonne plage de galets
Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse
convienne.
En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement,
« Plus grand ! » si le nombre est inférieur à 10.
Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

VARIABLES
nombreSaisi est un ENTIER
messagePlusPetit est un STRING <-- « Plus petit ! »
messagePlusGrand est un STRING <-- « Plus grand ! »
messageyesYouDid est un STRING <-- "Yes, you did it !"

TRAITEMENT
ECRIRE "Entrer un nombre entre 10 et 20"
LIRE nombreSaisi

TANT QUE nombreSaisi N'EST PAS EGAL A 15

SI nombreSaisi < 10
ALORS ECRIRE messagePlusGrand
SINON SI nombreSaisi > 20
ALORS ECRIRE messagePlusPetit
FIN SI

ALORS
ECRIRE "Entrer un nombre entre 10 et 20"
LIRE nombreSaisi
SI nombreSaisi <-- 15
ALORS ECRIRE messageyesYouDid
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////