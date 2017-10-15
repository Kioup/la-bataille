# la-bataille
Jeu de carte "la bataille" dans le cadre du cours Java/UPMC

Le fichier se décompose en 4 classes

#### Une classe Carte
classe qui contient les propriétés de la carte (couleur, valeur)

#### Une classe Joueur
classe qui contient les nom et scores du ou des joueur (max 2).
Elles contient aussi les méthodes lié au paquet de carte des deux joueurs

#### Une classe Paquet
classe qui contient le paquet de carte - un tableau d'objet (ArrayList) composé d'objets Carte.
Ce qui concerne le déroulement du jeu se situe dans la classe main et fait appel à toutes les classes énoncés ci dessus.

### Initialisation - Choix du mode de jeu ###
(1) Jouer contre l'ordinateur 
Dans ce cas le joueur 2 s'appelera Ordinateur et aura comme seule et unique option de tirer la carte suivante
(2) Jouer contre un partenaire
Dans ce cas le joueur 2 aura son propre nom (entré au clavier) et disposera des mêmes option que le joueur 1

### Chaque tour - 3 options
(1) piocher une Carte  
(2) Voir le Score  
(3) Quitter la partie  

### Chaque Manche - carte J1 contre carte J2
le gagnant est celui dont la valeur de la carte est la plus elevée  
+1 point pour le joueur dont la carte bat l'autre  
+1 point pour les deux joueurs en cas d'égalité.    
Méthode Compare

### Fin de partie (après 26 Manches) - Score J1 contre Score J2
La gagnant est celui dont le Score est le plus elevée  
Puiqu'il y a 52 cartes, la somme des scores des deux joueurs doit être égales 26.    
Méthode Gagnant
