#Exercice 1.4 : Calcul de l’aire et du volume d’une sphère

Lire le rayon R d’une sphère puis calculer et afficher :

    Son aire = 4 π R²
    Son volume = (4 π R³)/3
    
VARIABLES

R est un NOMBRE REEL
aire est  un NOMBRE REEL
volume est un NOMBRE REEL

TRAITEMENT 

AFFICHER "Entrer le rayon :"
LIRE R

aire = 4 * Math.PI * (R * R)
volume = 4 * Math.PI * (R * R * R)/3

AFFICHER "Aire = ", aire
AFFICHER "volume = ", volume
