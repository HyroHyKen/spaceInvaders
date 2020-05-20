# spaceInvaders

**Fonctionnalité n°3 : Choisir la vitesse du vaisseau (fini)**

- Ajouter la vitesse au Vaisseau sans régression de comportement
 
 Le vaisseau a une vitesse donné lui permettant de se déplacer de plusierus pixels à gauche ou
 à droite
 
- Régler la vitesse du vaisseau

La vitesse du vaisseau est donné et peut changer.

- Faire en sorte que le déplacement se fasse correctement pour une vitesse quelconque

Le vaisseau peut se déplacer vers la gauche ou vers la droite quelque soit sa vitesse. Si sa vitesse est supérieur
à l'emplacement restant d'un côté ou de l'autre, le vaisseau prend l'espace restant et se cole au bord, sans sortir
de l'espace prévu.

**Fonctionnalité en cours d'implémentation :**

**Spike : Prise en main et intégration d'un moteur graphique**

- Récupérer l'API du moteur graphique dans un projet test (fini)

On créer un nouveau projet dans lequel on importe un dossier avec un projet déjà existant pour comprendre
le fonctionnement d'un moteur graphique.

- Intégrer le moteur graphique au jeu Space Invaders (en cours)

On intègre les classes du projet existant dans le projet SpaceInvaders

**Nuage de mots**
A rajouter

**Difficultés rencontrés**

Pas vraiment de difficultés rencontrées

**Remarques diverses**

Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire 
qui permet de représenter l’espace de jeu dans une chaîne ASCII.

## Glossaire :

- **Vaisseau** : véhicule commandé par le joueur, pouvant se déplacer à droite et à gauche et ayant la 
possibilité de lancer des missiles destinés à détruire le(s) envahisseurs.

- **Envahisseur** : ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un
 missile lancé depuis le vaisseau du joueur.

- **Missile** : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

===================================

**Fonctionnalité n°2 : Dimensionner le vaisseau (fini)**

- Positionner un nouveau vaisseau avec une dimension donnée par l'utilisateur

Un nouveau vaisseau est créé. Le vaisseau est positionné ux coordonnées transmises avec les dimensions données.
Contrainte : La dimension souhaitée est transmise par ses dimensions longueur et hauteur.

- Faire en sorte qu'il soit impossible de positionner un nouveau vaisseau qui déborde de 
l'espace de jeu

Si un vaisseau essaye d'être positionné en dehors des limite de l'espace de jeu par sa dimension trop grande,
alors une esception sera levée.

- Déplacer un vaisseau vers la droite en tenant compte de sa dimension

Le vaisseau se déplace d'un pas vers la droite. Les dimensions du vaisseau sont prises en compte,
c'est donc le vaisseau entier qui se déplace.  Si le vaisseau se trouve sur la bordure droite de l'espace 
de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste 
juste à sa position actuelle).

- Story n°4 : Déplacer un vaisseau vers la gauche en tenant compte de sa dimension

Le vaisseau se déplace d'un pas vers la gauche. Les dimensions du vaisseau sont prises en compte,
c'est donc le vaisseau entier qui se déplace.  Si le vaisseau se trouve sur la bordure gauche de l'espace 
de jeu, le vaisseau doit rester immobile (aucun déplacement, aucune exception levée : le vaisseau reste 
juste à sa position actuelle).

- Refactorer la classe de test SpaceInvadersTest
Ajout des classes Dimension et Position, afin que la classe SpaceInvadersTest soit plus simple à lire

- Refactorer la classe Vaisseau

Ajout des attributs position et dimension à la classe Vaisseau, pour lier la classe Vaisseau aux classes
Position et Dimension.


**Nuage de mots**
A rajouter

**Difficultés rencontrés**

Pas vraiment de difficultés rencontrées

**Remarques diverses**

Pour pouvoir, mettre en place les tests, il a été nécessaire d’ajouter une fonctionnalité supplémentaire 
qui permet de représenter l’espace de jeu dans une chaîne ASCII.

## Glossaire :

- **Vaisseau** : véhicule commandé par le joueur, pouvant se déplacer à droite et à gauche et ayant la possibilité
 de lancer des missiles destinés à détruire le(s) envahisseurs.

- **Envahisseur** : ennemi qui apparaît à l'écran, se déplace automatiquement et qui doit être détruit par un
 missile lancé depuis le vaisseau du joueur.

- **Missile** : projectile envoyé à la verticale par le vaisseau vers l'envahisseur dans le but de le détruire.

=====================================

## Fonctionnalité n°1 : Déplacer un vaisseau dans l'espace de jeu (fini)

Il a consisté à :
- Créer un espace de jeu
     Un espace de jeu est créé aux dimensions données (2D). Cet espace de jeu est vide.
     
- positionner un nouveau vaisseau dans l'espace de jeu
     Un nouveau vaisseau est créé. Le vaisseau est positionné aux coordonnées transmises. Si un nouveau vaisseau tente d'être positionné      en dehors des limites de l'espace de jeu, une exception devra être faite. Contraintes : La position souhaitée est transmise par ses      coordonnées x et y. Le coin supérieur gauche de l'espace de jeu (point en haut à gauche) a des coordonnées (0,0). La taille du          vaisseau est réduite à son minimum pour l'instant (1 point).


- déplacer le vaisseau vers la droite dans l'espace de jeu
     Le vaisseau se déplace d'un pas vers la droite. Si le vaisseau se trouve sur la bordure droite de l'espace de jeu, le vaisseau doit      rester immobile 

- déplacer le vaisseau vers la gauche dans l'espace de jeu
      Le vaisseau se déplace d'un pas vers la gauche. Si le vaisseau se trouve sur la bordure gauche de l'espace de jeu, le vaisseau           doit rester immobile 
  
**Les difficultés :**

Les principales difficultées étaient :
- La compréhension de certain test
- L'installation des plugins liés à la visualisation du programme en UML

**Nuage de mots**

![Nuage De Mots](images/nuagedemots.PNG?raw=true "Title")

## Glossaire :

- **Vaisseau** : véhicule commandé par le joueur, pouvant se déplacer à droite et à gauche et ayant la possibilité
 de lancer des missiles destinés à détruire les ennemis.

- **Envahisseur** : ennemi qui apparaît à l'écran, se déplace automatiquement.

- **Missile** : projectile envoyé à la verticale par le vaisseau.
