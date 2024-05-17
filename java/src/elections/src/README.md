#Exercie 2.6 : Élections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

    Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
    En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.

Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).

VARIABLES
scoreCandidat1 est un nombre REEL
scoreCandidat2 est un nombre REEL
scoreCandidat3 est un nombre REEL
scoreCandidat4 est un nombre REEL

AFFICHER "Entrer le score du candidat 1"
LIRE scoreCandidat1

AFFICHER "Entrer le score du candidat 2"
LIRE scoreCandidat2

AFFICHER "Entrer le score du candidat 3"
LIRE scoreCandidat3

AFFICHER "Entrer le score du candidat 4"
LIRE scoreCandidat4

SI scoreCandidat1 > 50
ALORS AFFICHER "CANDIDAT 1 est élu"

SINON SI scoreCandidat1 < 12.5
ALORS AFFICHER "CANDIDAT 1 est battu"

SINON SI scoreCandidat1 > scoreCandidat2 ET > scoreCandidat3 ET > scoreCandidat4
ALORS AFFICHER "Ballotage favorable"

SINON AFFICHER "Ballotage défavorable"

FIN SI

FIN DU PROGRAMME

