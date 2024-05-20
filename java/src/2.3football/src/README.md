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
    
 VARIABLE
 ageDuJoueur est un entier
 
 TRAITEMENT
 
 AFFICHER "Entrer l'âge du joueur"
 LIRE ageDuJoueur
 
 SI ageDuJoueur < 5
 ALORS AFFICHER "Trop jeune"
 
 SINON SI ageDuJoueur < 7
 ALORS AFFICHER "Débutant"
 
 SINON SI ageDuJoueur < 9
 ALORS AFFICHER "Poussin" 
 
 SINON SI ageDuJoueur < 11
 ALORS AFFICHER "Benjamin"
 
 SINON SI ageDuJoueur < 13
 ALORS AFFICHER "Pupille"
 
 SINON SI ageDuJoueur < 15
 ALORS AFFICHER "Minime"
 
 SINON SI ageDuJoueur < 17
 ALORS AFFICHER "Cadet"
 
 SINON SI ageDuJoueur < 19
 ALORS AFFICHER "Junior"
 
SINON SI ageDuJoueur < 35
 ALORS AFFICHER "Sénior"
 
SINON AFFICHER "vétéran"