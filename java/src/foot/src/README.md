Exercice 2.3 : Ma catégorie au Football

Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

    Trop jeune : Moins de 5 ans
    Débutant : De 5 à 6 ans
    Poussin : De 7 à 8 ans
    Benjamin : De 9 à 10 ans
    Pupille : De 11 à 12 ans
    Minime : De 13 à 14 ans
    Cadet : De 15 à 16 ans
    Junior : De 17 à 18 ans
    Sénior : De 19 à 34 ans
    Vétéran : 35 ans et +
    
VARIABLES
age est un ENTIER

TRAITEMENT
AFFICHER "Entre l'âge du joueur"
LIRE age

SI age < 5
AFFICHER "Trop jeune"

SI age >= 5 OU age <= 6
AFFICHER "Débutant"

SI age >= 7 OU age <= 8
AFFICHER "Poussin"

SI age >= 9 OU age <= 10
AFFICHER "Benjamin"

SI age >= 11 OU age <= 12
AFFICHER "Pupille"

SI age >= 13 OU age <= 14
AFFICHER "Minime"

SI age >= 15 OU age <= 16
AFFICHER "cadet"

SI age >= 17 OU age <= 18
AFFICHER "Junior"

SI age >= 19 ET age <= 34
AFFICHER "Sénior"

SINON
AFFICHER "Vétéran"

FIN SI

FIN DU PROGRAMME

