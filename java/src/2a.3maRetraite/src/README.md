Exercice 2a.3 : Ma retraite

    Lire un nombre A correspondant à un âge (en années).
    Selon l’âge fourni, le programme doit afficher l’un des messages suivants :
        Vous êtes à la retraite depuis X années
        Il vous reste X années avant la retraite.
        C’est le moment de prendre sa retraite.
        La valeur fournie n’est pas un âge valide.

VARIABLES

ageDeLaRetraite est un ENTIER <-- 60
A est un ENTIER

TRAITEMENT
SI A < 1 OU > 100
ALORS AFFICHER "Données non valides."

SI A > 60 
ALORS
AFFICHER "Vous êtes à la retraite depuis, (A - ageDeLaRetraite) ,années" 

SINON SI A < 60
AFFICHER "Il vous reste, (ageDeLaRetraite - A),années avant la retraite."

SINON
AFFICHER "C’est le moment de prendre sa retraite."        