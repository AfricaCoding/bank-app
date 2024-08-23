### **41. Système de Gestion de Parcours Santé**

- **Description :** Développez un système pour gérer des parcours santé avec suivi des activités physiques, gestion des nutritionnistes, et création de plans personnalisés pour les utilisateurs.
- **Classes :**
    - **Utilisateur :** Représente un utilisateur du système qui souhaite suivre un parcours de santé.
        - `enregistrerActivité(Activité activité)`: Permet à l'utilisateur d'enregistrer une activité physique (ex: marche, course, natation).
        - `afficherProgression()`: Affiche la progression de l'utilisateur dans son parcours de santé (ex: calories brûlées, objectifs atteints).
        - `choisirNutritionniste(Nutritionniste nutritionniste)`: Permet à l'utilisateur de choisir un nutritionniste pour un suivi personnalisé.
    - **Activité :** Représente une activité physique effectuée par l'utilisateur.
        - `getDetails()`: Affiche les détails de l'activité comme le type, la durée, et les calories brûlées.
        - `calculerCaloriesBrûlées()`: Calcule le nombre de calories brûlées en fonction de la durée et du type d'activité.
    - **Nutritionniste :** Représente un nutritionniste qui aide les utilisateurs à élaborer un plan nutritionnel.
        - `créerPlanNutritionnel(Utilisateur utilisateur)`: Crée un plan nutritionnel personnalisé pour un utilisateur en fonction de ses objectifs.
        - `suivreProgression(Utilisateur utilisateur)`: Suit la progression d'un utilisateur et ajuste le plan nutritionnel si nécessaire.
    - **PlanSanté :** Représente un plan de santé personnalisé pour l'utilisateur.
        - `ajouterActivité(Activité activité)`: Ajoute une activité au plan de santé de l'utilisateur.
        - `afficherPlan()`: Affiche le plan de santé complet avec les activités physiques et les recommandations nutritionnelles.
        - `mettreÀJourObjectifs(String nouveauxObjectifs)`: Met à jour les objectifs de santé de l'utilisateur (ex: perte de poids, renforcement musculaire).
    - **SystèmeSanté :** Représente le système de gestion des parcours santé.
        - `ajouterUtilisateur(Utilisateur utilisateur)`: Inscrit un utilisateur au système de gestion des parcours santé.
        - `gérerPlansSanté()`: Gère les plans de santé personnalisés pour les utilisateurs.
        - `générerRapportSanté()`: Génère un rapport sur la santé des utilisateurs, y compris les activités effectuées et les progrès réalisés.

- **Logique :**
    - La classe `Utilisateur` gère l'enregistrement des activités physiques, le suivi de la progression, et la sélection d'un nutritionniste.
    - La classe `Activité` gère les détails des activités physiques et le calcul des calories brûlées.
    - La classe `Nutritionniste` crée et ajuste des plans nutritionnels personnalisés pour les utilisateurs.
    - La classe `PlanSanté` gère l'ajout d'activités, l'affichage du plan de santé, et la mise à jour des objectifs de l'utilisateur.
    - La classe `SystèmeSanté` gère l'inscription des utilisateurs, la gestion des plans de santé, et la génération de rapports sur la santé des utilisateurs.

---

