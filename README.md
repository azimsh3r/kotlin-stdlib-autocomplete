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
