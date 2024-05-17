#Exercice 2.3 : Ma catégorie au Football

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
    AFFICHER "Entrer un âge"
    LIRE age
    
    SI age < 5
    ALORS AFFICHER "Trop jeune"
    SINON SI age <-- 5 OU age <-- 6
    ALORS AFFICHER "Débutant"
    SINON SI age <-- 7 OU age <-- 8
    ALORS AFFICHER "Poussin"
    SINON SI age <-- 9 OU age <-- 10
    ALORS AFFICHER "Benjamin"
    SINON SI age <-- 11 OU age <-- 12
    ALORS AFFICHER "Puoille"
    SINON SI age <-- 13 OU age <-- 14
    ALORS AFFICHER "Minime"
    SINON SI age <-- 15 OU age <-- 16
    ALORS AFFICHER "Cadet"
    SINON SI age <-- 17 OU age <-- 18
    ALORS AFFICHER "Junior"
    SINON SI age <-- 19 ET age <= 34
    ALORS AFFICHER "Sénior"
    SINON AFFICHER "Vétéran"
    
    FIN SI 
    FIN DU PROGRAMME
