#Exercice 2.5 : Réprographie

Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.

CONSTANTES
prix1 est un NOMBRE REEL
prix2 est un NOMBRE REEL
prix3 est un NOMBRE REEL

VARIABLES
nombreDeCopies est un ENTIER
montantDeLaFacture est un NOMBRE REEL

AFFICHER "Entrer le nombre de copies :"
LIRE nombreDeCopies

SI nombreDeCopies <= 10
ALORS montantDeLaFacture <--prix1 * nombreDeCopies

SINON SI nombreDeCopies <= 30
ALORS montantDeLaFacture <--prix1 * 10 + (nombreDeCopies - 10) * prix2

SINON montantDeLaFacture <--prix1 * 10 + prix2 * 20 + (nombreDeCopies - 30) * prix3

RESULTAT
AFFICHER "Le montant de la facture est de",montantDeLaFacture, "euros."

FIN PROGRAMME



