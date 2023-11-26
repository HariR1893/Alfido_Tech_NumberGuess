# CODSOFT-JAVA-DEVELOPMENT-TASK 1
Repository showcasing my completed projects and tasks during my Java Development internship at ALFIDO TECH. 

## Task 1
### Number Guessing Game
1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number. You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

## Approach overview
The Number Guessing Game is a simple interactive game where the player attempts to guess a randomly generated number within a given range. The main goal of this game is to provide an engaging experience for the player by challenging their ability to predict the correct number within a limited number of attempts. The game incorporates features such as limiting the number of attempts, allowing multiple rounds, and calculating the player's score. Here's an overview of the key aspects of the game:

1. Generating a Random Number:
At the start of each round, a random target number is generated within a specified range. The target number is the number that the player needs to guess correctly.

2. User Interaction:
The game prompts the player to enter their guess for the generated number. The player is encouraged to make an educated guess to determine the correct number.

3. Providing Feedback:
After each guess, the player receives feedback on whether their guess is too high, too low, or correct compared to the generated target number. This feedback helps the player adjust their subsequent guesses.

4. Guessing Loop:
The game utilizes a loop that allows the player to keep guessing until they either guess the correct number or exhaust their allotted attempts.

5. Limited Attempts:
The game enforces a maximum number of attempts that the player can make to guess the correct number. This adds a challenging element and encourages the player to strategize their guesses.

6. Multiple Rounds:
Upon completing a round, the player has the option to play again for another round. This feature keeps the game engaging and allows the player to improve their guessing skills.

7. Scoring System:
The game tracks the player's score, which can be based on the number of attempts taken or rounds won. A higher score indicates better performance, adding an element of competition and achievement.

## Getting Started

Follow these steps to get your Java project up and running on your local machine.

### Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) [Download](https://www.oracle.com/java/technologies/javase-downloads.html)
- Git (for cloning the repository) [Download](https://git-scm.com/downloads)

#### After installation
-Clone or download this repository to your local machine.
-Open the `NumberGame.java` file in any Java IDE to run the code.

## Usage

Follow these steps to play the Number Guessing Game in Java.

1. **Clone the repository:**
   ```sh
   git clone https://github.com/HariR1893/Alfido_Tech_NumberGuess.git
   cd Alfido_Tech_NumberGuess
   ```
### After Cloning the source code
1. Compile the java program
   ` javac NumberGame.java `
2. Run the program
   `java NumberGame`
3. Follow the Instructions
   -The program will generate a random number between the specified range (default is 1 to 100).
   -You have a maximum of 10 attempts to guess the correct number.
   -After each attempt, the program will provide feedback on whether your guess is too high, too low, or correct.
   -If you guess the correct number within the attempts, your score will be calculated based on the remaining attempts.
   -After each round, you can choose to play again or exit.
4. Play again
   -The program will ask if you want to play again after each round. Respond with "yes" to play again and "no" to exit.
5. Final Result
   -After you decide to exit the game, the program will display your total rounds played and the cumulative score you've earned.

Feel free to modify the code and customize the ranges, maximum attempts, and other settings to tailor the game to your preferences.

Note: Make sure you have the Java Development Kit (JDK) installed on your system before running the program.
