# 🎯 SuperQuizz - Android Quiz Application

<div align="center">

![Android](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![MVVM](https://img.shields.io/badge/Architecture-MVVM-blue?style=for-the-badge)
![API](https://img.shields.io/badge/API-24%2B-brightgreen?style=for-the-badge)

*Une application de quiz interactive développée lors de la formation OpenClassrooms "Développez votre première application Android"*

[📱 Voir la démo](#démonstration) • [🏗️ Architecture](#architecture) • [📚 Concepts appris](#concepts-appris) • [🚀 Installation](#installation)

</div>

## 📋 Description

SuperQuizz est une application Android native qui met en œuvre les meilleures pratiques de développement moderne. L'application propose une expérience de quiz avec une interface utilisateur intuitive et une architecture robuste basée sur le pattern MVVM.

### ✨ Fonctionnalités

- **Interface utilisateur moderne** avec Material Design
- **Navigation fluide** entre les écrans d'accueil et de quiz
- **Feedback visuel immédiat** lors des réponses
- **Système de scoring** en temps réel
- **Accessibilité** optimisée avec des annonces vocales
- **Gestion du cycle de vie** des composants Android

## 🏗️ Architecture

L'application suit une architecture **MVVM (Model-View-ViewModel)** rigoureuse :

```
┌─────────────────┐    ┌──────────────────┐    ┌─────────────────┐
│      View       │◄───┤    ViewModel     │◄───┤     Model       │
│                 │    │                  │    │                 │
│ • Fragments     │    │ • QuizViewModel  │    │ • Question      │
│ • Activities    │    │ • LiveData       │    │ • QuestionBank  │
│ • ViewBinding   │    │ • Business Logic │    │ • Repository    │
└─────────────────┘    └──────────────────┘    └─────────────────┘
        ▲                        ▲
        │                        │
        └───────┬────────────────┘
                │
        ┌──────────────────┐
        │ Dependency       │
        │ Injection        │
        │ • ViewModelFactory│
        └──────────────────┘
```

### 📁 Structure du projet

```
app/src/main/java/com/charly/
├── MainActivity.java              # Point d'entrée principal
├── data/                          # Couche Modèle
│   ├── Question.java              # Entité de données
│   ├── QuestionBank.java          # Source de données (Singleton)
│   └── QuestionRepository.java    # Repository Pattern
├── injection/                     # Injection de dépendances
│   └── ViewModelFactory.java      # Factory pour ViewModels
└── ui/                           # Couche Vue
    ├── welcome/
    │   └── WelcomeFragment.java   # Écran d'accueil
    └── quizz/
        ├── QuizFragment.java     # Écran de quiz
        └── QuizViewModel.java    # ViewModel du quiz
```

## 📚 Concepts appris

Ce projet démontre la maîtrise des concepts fondamentaux du développement Android :

### 🔄 Cycle de vie des composants
- **Activity** : Gestion du cycle de vie complet (`onCreate`, `onStart`, `onResume`, etc.)
- **Fragment** : Cycle de vie indépendant et communication avec l'Activity
- **ViewModel** : Survie aux changements de configuration (rotation)

### 🏛️ Architecture MVVM
- **Model** : `Question`, `QuestionBank`, `QuestionRepository`
- **View** : `MainActivity`, `QuizFragment`, `WelcomeFragment`
- **ViewModel** : `QuizViewModel` avec `LiveData` pour la réactivité

### 🎨 Design Patterns
- **Repository Pattern** : Centralisation de l'accès aux données
- **Factory Pattern** : `ViewModelFactory` pour la création des ViewModels
- **Singleton Pattern** : `QuestionBank` pour la gestion des questions
- **Observer Pattern** : `LiveData` pour la communication réactive

### 🔧 Technologies Android
- **ViewBinding** : Binding sécurisé des vues
- **Fragment Navigation** : Navigation entre écrans
- **LiveData** : Observables lifecycle-aware
- **Material Design** : UI moderne et responsive
- **Accessibility** : Support pour les lecteurs d'écran

## 🎮 Démonstration

### Écran d'accueil
L'utilisateur saisit son nom pour commencer le quiz avec validation en temps réel.

### Écran de quiz
- Question affichée avec 4 choix de réponse
- Feedback visuel immédiat (vert/rouge)
- Score mis à jour en temps réel
- Navigation entre questions

### Résultat final
Dialogue modal affichant le score final avec option de recommencer.

## 🚀 Installation

### Prérequis
- **Android Studio** Arctic Fox ou plus récent
- **SDK Android** API 24 (Android 7.0) ou plus récent
- **Java** 11 ou plus récent

### Étapes d'installation

1. **Cloner le repository**
   ```bash
   git clone https://github.com/charly-zoungrana/SuperQuizz.git
   cd SuperQuizz
   ```

2. **Importer dans Android Studio**
   - Ouvrir Android Studio
   - Choisir "Open an existing project"
   - Sélectionner le dossier du projet

3. **Compiler et exécuter**
   - Synchroniser le projet (Gradle sync)
   - Choisir un émulateur ou un appareil physique
   - Cliquer sur "Run" ▶️

### Configuration du projet

```gradle
android {
    compileSdk 36
    defaultConfig {
        applicationId "com.charly"
        minSdk 24
        targetSdk 36
        versionCode 1
        versionName "1.0"
    }
}
```

## 🔍 Points techniques remarquables

### 🎯 Architecture robuste
- Séparation claire des responsabilités
- Injection de dépendances avec `ViewModelFactory`
- Gestion efficace du cycle de vie

### 💡 Bonnes pratiques
- **ViewBinding** pour éviter `findViewById`
- **LiveData** pour les données observables
- **Repository Pattern** pour l'accès aux données
- **Singleton** thread-safe avec double-check locking

### 🎨 UX/UI optimisé
- Material Design cohérent
- Feedback utilisateur immédiat
- Accessibilité avec `announceForAccessibility`
- Gestion d'état des boutons



## 🛠️ Outils et technologies

| Composant | Technologie | Usage |
|-----------|-------------|-------|
| **Langage** | Java  | Logique métier |
| **Build** | Gradle with Kotlin DSL | Gestion de projet |
| **UI** | XML + ViewBinding | Interface utilisateur |
| **Architecture** | MVVM + Repository | Structure applicative |
| **Async** | LiveData | Programmation réactive |
| **Navigation** | Fragment Transactions | Navigation entre écrans |

## 🤝 Contribution

Ce projet étant réalisé dans le cadre d'une formation pédagogique, il sert de référence pour les concepts fondamentaux du développement Android moderne.

---

<div align="center">

**Développé  dans le cadre de la formation OpenClassrooms**

*"Développez votre première application Android"*

[📱 OpenClassrooms](https://openclassrooms.com) • [🔗 LinkedIn](https://www.linkedin.com/in/charly-zoungrana-7b4003264/)


</div>
