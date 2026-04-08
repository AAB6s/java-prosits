# Java Prosit 7 – Exception Handling in Zoo Management

![Java](https://img.shields.io/badge/Java-JDK%2017-orange)

**Done by:** Ahmed Amine Boussetta — 3IA1

---

## Installation

Install Java JDK 17 using Winget:

```bash
winget install Microsoft.OpenJDK.17
```

Verify installation:

```bash
java -version
javac -version
```

## Setup

- Java JDK installed
- Commands executed from the project directory

## Features (Prosit 7)

### 1. Custom Exception Classes
- **ZooFullException**: Thrown when the zoo reaches maximum capacity
- **InvalidAgeException**: Thrown when an animal has a negative age

### 2. Modified addAnimal() Method
- Changed return type from `boolean` to `void`
- Now throws `ZooFullException` when zoo is at capacity
- Now throws `InvalidAgeException` when animal age < 0
- Removes internal validation checks (moved to exception handling)

### 3. Exception Handling in Main
- Proper try-catch blocks for all animal additions
- Program continues execution even when exceptions are thrown
- Displays informative error messages for invalid operations
- Tracks animal count before and after failed attempts

## Files

- `tn/esprit/gestionzoo/entities/Animal.java`
- `tn/esprit/gestionzoo/entities/Aquatic.java`
- `tn/esprit/gestionzoo/entities/Dauphin.java`
- `tn/esprit/gestionzoo/entities/Penguin.java`
- `tn/esprit/gestionzoo/entities/Terrestrial.java`
- `tn/esprit/gestionzoo/entities/Zoo.java`
- `tn/esprit/gestionzoo/entities/ZooFullException.java` ✨ NEW
- `tn/esprit/gestionzoo/entities/InvalidAgeException.java` ✨ NEW
- `tn/esprit/gestionzoo/main/Main.java`

## Run

### Compile

```bash
javac -d bin src/tn/esprit/gestionzoo/entities/*.java src/tn/esprit/gestionzoo/main/*.java
```

### Execute

```bash
java -cp bin tn.esprit.gestionzoo.main.Main
```

## Output

The program demonstrates three test scenarios:

1. **Valid Animals**: Successfully adds 3 animals (Lion, Tiger, Snake) and displays the count
2. **Negative Age Validation**: Catches `InvalidAgeException` when trying to add an animal with age < 0
3. **Zoo Capacity**: Catches `ZooFullException` when trying to exceed the 3-cage limit

```
=== Test 1: Adding valid animals ===
Lion added successfully. Animal count: 1
Tiger added successfully. Animal count: 2
Snake added successfully. Animal count: 3

=== Test 2: Adding animal with negative age ===
Error handling negative age: Âge d'animal invalide : l'âge ne peut pas être négatif.
Animal count after failed attempt: 3

=== Test 3: Exceeding zoo capacity ===
Error handling full zoo: Le zoo est plein, impossible d'ajouter un nouvel animal.
Animal count after failed attempt: 3
```