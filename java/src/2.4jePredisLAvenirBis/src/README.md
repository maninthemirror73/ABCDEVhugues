#exercice 2.4 : Je prédis l’avenir

Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”

VARIABLES

heures est un ENTIER
minutes est un ENTIER

TRAITEMENT

AFFICHER "Entrer les heures :"
LIRE heures

SI heures > 23
ALORS
AFFICHER “Les données saisies sont invalides”

AFFICHER "Entrer les MINUTES"
LIRE minutes

SI minutes > 56
ALORS
AFFICHER “Les données saisies sont invalides”

AFFICHER "Dans 3 minutes il sera ", heures, "heures et",minutes, "minutes

