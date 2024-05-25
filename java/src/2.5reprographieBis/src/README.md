#Exercice 2.5 : Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

CONSTANTES
prix1 est un nombre REEL <-- 0.1
prix2 est un nombre REEL <-- 0.09
prix3 est un nombre REEL <-- 0.08

VARIABLES

nombreDeCopies est un ENTIER
montantDeLaFacture est un nombre REEL

TRAITEMENT

AFFICHER "Entrer le nombre de copies"
LIRE nombreDeCopies

SI  nombreDeCopies <= 10
ALORS
montantDeLaFacture <-- nombreDeCopies * prix1

SINON SI nombreDeCopies <= 30
ALORS
montantDeLaFacture <-- 10 * prix1 + (nombreDeCopies - 20) * prix2 

SINON 
montantDeLaFacture <-- 10 * prix1 + 20 * prix2 + (nombreDeCopies - 30) * prix3

AFFICHER "Prix à payer =  ", montantDeLaFacture 