#Exercie 2.6 : Élections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

    Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
    En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.

Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).

VARIABLES

scoreCandidat1 ets un NOMBRE REEL
scoreCandidat2 ets un NOMBRE REEL
scoreCandidat3 ets un NOMBRE REEL
scoreCandidat4 ets un NOMBRE REEL

nombreDeVoix  est un ENTIER = 100

AFFICHER "1er tour !"

AFFICHER "Entrer le score du candidat 1 :"
LIRE scoreCandidat1

AFFICHER "Entrer le score du candidat 2 :"
LIRE scoreCandidat2

AFFICHER "Entrer le score du candidat 3 :"
LIRE scoreCandidat3

AFFICHER "Entrer le score du candidat 4 :"
LIRE scoreCandidat4

//////////////////////////////////////////////

SI scoreCandidat1 > (50 * nombreDeVoix /100)
ALORS AFFICHER "Elu au 1er tour ! "

SINON SI scoreCandidat1 > (12.5 *              nombreDeVoix /100)
ALORS AFFICHER "2e tour !"
	SI 
SINON AFFICHER "Candidat 1 battu !"