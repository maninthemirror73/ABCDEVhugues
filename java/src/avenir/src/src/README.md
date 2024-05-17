VARIABLES
heures ENTIER
minutes ENTIER
minutesajoutees ENTIER

AFFICHER Entrer un nombre entier
LIRE Affecter le nombre utilisateur à la variable heures

SI heures > 23
ALORS AFFICHER Les données saisies sont invalides
SORTIR du programme

AFFICHER Entrer un second nombre entier
LIRE Affecter le nombre utilisateur à la variable minutes

SI minutes > 56
AFFICHER Les données saisies sont invalides
SORTIR du programme

LIRE minutesajoutees = 3


AFFICHER "Dans 3 minutes, il sera",heures,"h",(minutes + minutesajoutees)

