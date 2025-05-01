Here’s a clear and developer-friendly `README.md` that explains each Maven phase and command based on your provided `pom.xml`:

---

# 🧪 Training Project - Maven Build Guide

This project is managed with **Apache Maven**, and includes compilation, unit testing, integration testing, running the app, and creating a standalone JAR.

## 🛠 Prerequisites

- Java 23 (as defined in `pom.xml`)
- Maven 3.6+ installed
- JAVA_HOME set appropriately

---

## 🔁 Common Maven Lifecycle Commands

### 1. Clean
```bash
mvn clean
```
Removes the `target/` directory to ensure a fresh build.

---

### 2. Compile
```bash
mvn compile
```
Compiles the main source code (`src/main/java`).

---

### 3. Compile & Run
```bash
mvn clean compile exec:java
```
- Cleans and compiles the project.
- Executes the `mainClass` defined in the POM (`org.training.Launch`) using the `exec-maven-plugin`.

---

### 4. Compile & Package Fat JAR
```bash
mvn clean compile assembly:single
```
- Compiles and creates a **fat JAR** (with dependencies) via `maven-assembly-plugin`.
- Output: `target/Training-1.alpha0001-jar-with-dependencies.jar`

---

## ✅ Testing

### 5. Run Unit Tests
```bash
mvn test
```
- Runs tests matching `*Test*` pattern using **Surefire**.
- Example: `UserServiceTest.java`

---

### 6. Run Integration Tests
```bash
mvn verify
```
- Executes **Failsafe** integration tests matching `*IT*` (e.g., `DatabaseIT.java`).
- Runs **after** compilation and unit tests.

---

## 📦 JAR Execution (after packaging)

After running `mvn clean compile assembly:single`, you can run the app like this:

```bash
java -jar target/Training-1.alpha0001-jar-with-dependencies.jar
```

---

## 🧩 Plugin Summary

| Plugin | Purpose |
|--------|---------|
| `maven-compiler-plugin` | Sets Java version (23) |
| `exec-maven-plugin`     | Runs `mainClass` directly |
| `maven-assembly-plugin` | Creates executable fat JAR |
| `maven-surefire-plugin` | Runs unit tests (`*Test*`) |
| `maven-failsafe-plugin` | Runs integration tests (`*IT*`) |

---

## 📁 Project Structure

```
src/
├── main/java/org/training/        # Application code
│   └── Launch.java                # Main class
├── test/java/org/training/        # Unit tests (*Test.java)
├── integration-test/java/org/training/ # Integration tests (*IT.java)
```

---

Let me know if you'd like this saved as a downloadable `README.md` file.