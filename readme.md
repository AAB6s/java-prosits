# Java Prosit 5 – Zoo Management

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

## Files

- `tn/esprit/gestionzoo/entities/Animal.java`
- `tn/esprit/gestionzoo/entities/Aquatic.java`
- `tn/esprit/gestionzoo/entities/Dauphin.java`
- `tn/esprit/gestionzoo/entities/Penguin.java`
- `tn/esprit/gestionzoo/entities/Terrestrial.java`
- `tn/esprit/gestionzoo/entities/Zoo.java`
- `tn/esprit/gestionzoo/main/Main.java`

## Run

### ZooManagement

```bash
cd src
javac tn/esprit/gestionzoo/entities/*.java tn/esprit/gestionzoo/main/*.java
java tn.esprit.gestionzoo.main.Main
```

## Output

![Program Output](media/capture.png)