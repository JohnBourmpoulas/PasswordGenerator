# Password Generator

A simple password generator written in Java that creates multiple
randomized passwords with a configurable length.

## Features

-   Generate multiple passwords at once
-   Configurable password length
-   Minimum password length of 4 characters
-   Each generated password contains at least:
    -   One lowercase letter
    -   One uppercase letter
    -   One digit
    -   One special character
-   Randomized character order

## Character Set

Passwords are generated using:

-   Lowercase letters: `a-z`
-   Uppercase letters: `A-Z`
-   Digits: `0-9`
-   Special characters: `!#$@%`

## Usage

Create a `Generator` by specifying the password length and the number of
passwords to generate:

``` java
Generator generator = new Generator(8, 20);
generator.display();
```

In this example:

-   `8` is the length of each password.
-   `20` is the number of passwords to generate.

The generated passwords are then displayed in the console.

## Example

``` java
public class Main {
    public static void main(String[] args) throws Exception {
        Generator generator = new Generator(8, 20);
        generator.display();
    }
}
```

## Requirements

-   Java Development Kit (JDK)

## How It Works

For every generated password, the generator first selects one character
from each required character group: lowercase letters, uppercase
letters, digits, and special characters.

The remaining positions are filled with random characters from the
complete character set. The resulting characters are then shuffled
before the password is stored.

## Project Structure

``` text
Generator/
└── src/
    ├── Generator.java
    └── Main.java
```

## Author

**John Bourmpoulas**

GitHub: [@JohnBourmpoulas](https://github.com/JohnBourmpoulas)
