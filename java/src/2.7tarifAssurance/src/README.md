Exercice 2.7 : Tarif Assurance

Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

    Tarifs bleu, vert, orange et rouge.

Le tarif dépend de la situation du conducteur :

    Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge, si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.

    Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

    Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

VARIABLES
ageDuConducteur est un ENTIER
ancienneteDuPermis est un ENTIER
nombreDaccidents est un ENTIER

AFFICHER "Age du conducteur"
LIRE ageDuConducteur


AFFICHER "Ancienneté du permis"
LIRE ancienneteDuPermis

AFFICHER "Nombre d'accidents"
LIRE nombreDaccidents

SI ageDuConducteur < 25 ET ancienneteDuPermis < 2 
 
SI nombreDaccidents = 0
ALORS AFFICHER "Tarif rouge"
SINON AFFICHER "Contrat refusé"

SI (ageDuConducteur < 25 ET ancienneteDuPermis > 2) OU (ageDuConducteur > 25 ET ancienneteDuPermis < 2)
SI nombreDaccidents = 0
AFFICHER "Tarif orange"
SINON SI nombreDaccidents = 1
AFFICHER "Tarif rouge"
SINON AFFICHER "Contrat refusé"