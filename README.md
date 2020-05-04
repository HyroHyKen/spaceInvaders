# spaceInvaders

## Les **Fonctionnalités** :
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
