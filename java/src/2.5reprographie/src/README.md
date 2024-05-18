VARIABLES

nombreDeCopies est un ENTIER
montantDeLaFacture est un nombre REEL
CONSTANTES

P1 est un REEL <-- 0.10
P2 est un REEL <-- 0.09
P3 est un REEL <-- 0.08

TRAITEMENT
ECRIRE "Saisissez le nombre de photocopies"
LIRE nombreDeCopies

SI nombreDeCopies <= 10
ALORS montantDeLaFacture <-- nombreDeCopies * P1

SINON SI nombreDeCopies <= 30
ALORS montantDeLaFacture <-- 10 * P1 (nombreDeCopies - 10) * P2

SINON montantDeLaFacture = 10 * P1 + 20 * P2 + (nombreDeCopies - 30) *P3

AFFICHER "Le montant de la facture est de : " +  montantDeLaFacture + " euros" 

FIN SI







