# Morpion

Ce projet est une implémentation simple du jeu de Morpion (Tic-Tac-Toe) en Java. Le programme permet de vérifier si le joueur "X" a gagné en diagonale dans une grille 3x3.

## Description
Le programme déclare une grille 3x3 pré-remplie avec les valeurs suivantes :

```
X O O
O X X
O O X
```

Il vérifie ensuite si "X" a gagné :
- En diagonale
- (Une tentative pour vérifier une victoire horizontale est présente, mais elle contient des erreurs logiques)

## Fonctionnalités
- Affichage des valeurs de la diagonale principale.
- Vérification de la victoire pour "X" en diagonale principale.
- Messages affichés pour indiquer si "X" gagne ou non.

## Exécution
### Prérequis
- Java Development Kit (JDK) installé.

### Instructions
1. Clonez le dépôt :
   ```
   git clone <URL_DU_DEPOT>
   ```
2. Compilez le programme :
   ```
   javac Morpion.java
   ```
3. Exécutez le programme :
   ```
   java Morpion
   ```

## Exemple de sortie
Lors de l'exécution du programme, la sortie sera :

```
X
Les valeurs de la diagonale sont : XOX
Le X gagne en diagonale
```


