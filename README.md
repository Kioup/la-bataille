# la-bataille
Jeu de carte "la bataille" dans le cadre du cours Java/UPMC

Le fichier se décompose en 4 classes

#### Une classe Carte
classe qui contient les propriétés de la carte (couleur, valeur)
#### Une classe Joueur
classe qui contient les nom et score du ou des joueur (max 2)
#### Une classe Deck
classe qui contient le paquet de carte - fait appel à la class Carte
#### Une classe Game
class qui définit les divers options de jeu appel dans le main

### Chaque tour - 3 options (méthode Menu)
(1) piocher une Carte
(2) Voir le Score
(3) Quitter la partie

### Chaque Manche - carte J1 contre carte J2
le gagnant est celui dont la valeur de la carte est la plus elevée
Méthod Verif

### Fin de partie (après 24 Manche) - Score J1 contre Score J2
La gagnant est celui dont le Score est le plus elevée
Méthod Point
