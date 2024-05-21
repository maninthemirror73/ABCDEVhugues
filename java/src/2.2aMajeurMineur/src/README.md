#Exercice 2a.2 : Es-tu majeur ?

    Lire un nombre A correspondant à un âge (en années).
    Afficher “Vous êtes majeur” ou “Vous êtes mineur” selon le cas.
        Pour un nombre négatif le message doit être “Vous n’êtes pas encore né”.

La majorité est fixée à 18 ans.

VARIABLES

A est  un ENTIER

TRAITEMENT 

SI A > 18 
ALORS AFFICHER "Vous êtes majeur."
SINON SI A < 18 ET A < 0
ALORS AFFICHER "Vous êtes mineur."
SINON SI A < 1
ALORS AFFICHER "Vous n'êtes pas né."

