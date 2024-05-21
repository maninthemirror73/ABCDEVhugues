#Exercice 2.8 : Validité d’une date

Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

    Un numéro de jour
    Un numéro de mois
    Un numéro d’année

L’algorithme indique ensuite s’il s’agit ou non d’une date valide.
Il n’est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours, sauf si l’année est bissextile, auquel cas il en compte 29.

L’année est bissextile si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. 

VARIABLES
numeroDeJour est un ENTIER
numeroDeMois est un ENTIER
numeroDAnnee est un ENTIER

TRAITEMENT
AFFICHER "Entrer le numero du jour"
LIRE numeroDeJour

AFFICHER "Entrer le numero du mois"
LIRE numeroDeMois

AFFICHER "Entrer le numero d'année"
LIRE numeroDAnnee

//////////////////////////////////
SI numeroDAnnee / 4 = 0 
ALORS AFFICHER "Année bisextile"
SINON SI numeroDeMois >

