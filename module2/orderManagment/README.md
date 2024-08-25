### Énoncé du Projet : Système de Gestion de Commandes en Ligne

#### Contexte :
Vous êtes chargé de développer un système de gestion de commandes pour un site e-commerce. Ce système devra permettre aux utilisateurs de parcourir des produits, de les ajouter à un panier, de passer une commande, et de choisir un moyen de paiement. En tant que développeur, vous devez mettre en œuvre des concepts de programmation orientée objet tels que l'abstraction, l'interface, le polymorphisme, l'encapsulation, l'héritage, la composition, l'utilisation des streams, ainsi que des méthodes spécifiques comme `final`, `default`, et `static`.

#### Objectifs du Projet :
1. **Gérer les Produits** :
    - Créer une classe `Produit` qui contient des attributs tels que `id`, `nom`, `prix`, et `quantité`.
    - Implémenter une méthode `calculerPrix()` qui retourne le prix total d'un produit. Cette méthode doit être marquée comme `final` pour empêcher toute modification dans une sous-classe.

2. **Gérer les Utilisateurs** :
    - Créer une classe `Utilisateur` avec des attributs `id`, `nom`, et `email`.
    - Créer deux sous-classes `Client` et `Admin` qui hériteront de `Utilisateur` et auront des fonctionnalités spécifiques.

3. **Gérer les Commandes** :
    - Créer une classe `Commande` qui contient une liste de produits et un utilisateur.
    - Permettre à un utilisateur d'ajouter des produits à une commande.
    - Implémenter une méthode `calculerTotal()` utilisant des streams pour calculer le montant total de la commande.

4. **Gérer le Panier** :
    - Créer une classe `Panier` qui permet à un utilisateur d'ajouter ou de retirer des produits avant de passer commande.

5. **Gérer les Moyens de Paiement** :
    - Créer une interface `Payable` avec une méthode `payer()` que toutes les classes de moyens de paiement doivent implémenter.
    - Créer une classe abstraite `MoyenPaiement` qui implémente l'interface `Payable`.
    - Créer des sous-classes de `MoyenPaiement` pour gérer différents types de paiement comme `CarteCredit` et `Paypal`.
    - Ajouter des méthodes `default` et `static` dans l'interface pour offrir des fonctionnalités communes.

6. **Gérer l'Expédition des Commandes** :
    - Créer une interface `Expediable` avec une méthode `expedier()` pour gérer l'expédition des commandes.

7. **Composition et Encapsulation** :
    - Utiliser la composition pour lier les classes `Commande`, `Produit`, et `Utilisateur`.
    - Assurer que les attributs des classes sont encapsulés et accessibles uniquement via des getters et setters.

8. **Utilisation des Collections** :
    - Utiliser des `ArrayList` pour gérer les collections de produits, d'utilisateurs, et de commandes.
    - Utiliser des streams pour effectuer des opérations comme le filtrage, le tri et le calcul sur ces collections.

#### Livrables :
1. Un code source Java bien structuré respectant les principes de la programmation orientée objet.
2. Des commentaires dans le code expliquant les choix de conception.
3. Un fichier README décrivant le fonctionnement de l'application et les étapes pour l'exécuter.

#### Critères d'Évaluation :
- Bonne application des concepts d'abstraction, d'interface, de polymorphisme, d'encapsulation, d'héritage, de composition.
- Utilisation correcte des collections et des streams.
- Utilisation appropriée des méthodes `final`, `default`, et `static`.
- Qualité du code (lisibilité, organisation, commentaires).
- Fonctionnalité et robustesse du système.

Ce projet vous permettra de consolider vos compétences en programmation orientée objet en Java tout en créant une application simple mais complète de gestion de commandes en ligne.