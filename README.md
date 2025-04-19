# Kotlin StdLib Suggester

A simple Kotlin command-line tool that suggests classes from the Kotlin Standard Library based on a given prefix.

## How to Start the Program

1. Clone the repository:
   ```sh
   git clone https://github.com/azimsh3r/kotlin-stdlib-suggester.git
   cd kotlin-stdlib-suggester
   ```

2. Build the project:
   ```sh
   ./gradlew build
   ```

3. Run the program with a prefix argument:
   ```sh
   ./gradlew run --args="YourPrefix"
   ```

   **Example:**
   ```sh
   ./gradlew run --args="Abstract"
   ```

   This will output all Kotlin Standard Library classes whose names contain `"Function"` in their class name.

### Notes
- This CLI tool uses [Clikt](https://ajalt.github.io/clikt/) for parsing command-line arguments.
- Make sure the Kotlin standard library is on your classpath during execution (automatically handled if using Gradle).

## Complementary Project: [Kotlin-AutoImport-Server](https://github.com/azimsh3r/kotlin-autoimport-server)

In addition to the Kotlin StdLib Suggester tool, I have also developed a **Kotlin-AutoImport-Server** solution. This project aims to provide **auto-import** functionality for Kotlin code. This project provides an auto-import API similar to the one used in the Kotlin Compiler Server. It automatically suggests unimported references in real time, which can help Kotlin developers write cleaner and more efficient code.

You can explore it here: [Kotlin-AutoImport-Server GitHub](https://github.com/azimsh3r/kotlin-autoimport-server)

This project implements a server-side auto-import mechanism that can be integrated into development environments to enhance productivity and reduce the need for manual imports.
