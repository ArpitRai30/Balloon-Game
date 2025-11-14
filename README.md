# Balloon-Game 🎈

A fun, two-player turn-based game where players pop balloons on a 4x4 grid to earn points. Each balloon has a hidden value, and the player with the highest total score after 8 rounds wins!

## 📋 Game Overview

Balloon-Game is a simple console-based Java game where:
- Two players take turns selecting coordinates on a 4x4 grid
- Each coordinate contains a balloon with a hidden point value (0-15)
- Players reveal and collect points by "popping" balloons at their chosen coordinates
- The game runs for 8 rounds (16 total balloon pops)
- The player with the highest score at the end wins

## 🎮 How to Play

### Compilation
```bash
javac Main.java balloon/*.java
```

### Running the Game
```bash
java Main
```

### Game Rules
1. The game board is a 4x4 grid (coordinates range from 0-3 for both x and y)
2. Each position contains a unique value from 0 to 15
3. Players alternate turns:
   - Player 1 enters coordinates (row column)
   - Player 2 enters coordinates (row column)
4. Valid coordinates are integers from 0 to 3
5. Each coordinate can only be used once
6. If a player enters invalid or already-used coordinates, they must try again
7. After 8 successful rounds, the game ends and the winner is announced
8. Type "exit" at any time to quit the game

### Example Gameplay
```
X  X  X  X 
X  X  X  X 
X  X  X  X 
X  X  X  X 

Enter coordinates for player 1: 0 0
Enter coordinates for player 2: 1 1
P1:5
P2:12

5  X  X  X 
X  12 X  X 
X  X  X  X 
X  X  X  X 
```

## 📁 Project Structure

```
Balloon-Game/
├── Main.java           # Main game entry point
└── balloon/            # Game logic package
    ├── Board.java      # Board creation and display functions
    ├── Players.java    # Player input handling
    └── Pop.java        # Balloon popping logic
```

## 🔧 Code Functions and Classes

### Main.java
The entry point of the game that orchestrates the game flow:
- Initializes the game board, tracking arrays, and player scores
- Manages the game loop for 8 rounds
- Handles coordinate validation and score updates
- Determines and announces the winner

### balloon/Board.java
Manages board creation and display:
- **`createBoard()`**: Creates a 4x4 board with random unique values (0-15)
- **`showBoard(String[][] arr)`**: Displays the current game board state
- **`dummyBoard()`**: Creates a display board initialized with "X" markers
- **`boolBoard()`**: Creates a boolean tracking board to mark used coordinates

### balloon/Players.java
Handles player input:
- **`play()`**: Prompts both players for coordinates
  - Accepts coordinates in format: `row column` (e.g., "0 0")
  - Returns an array of 4 integers: [x1, y1, x2, y2]
  - Supports "exit" command to quit the game
  - Validates input format and handles errors

### balloon/Pop.java
Manages balloon popping logic:
- **`pop(int[][] arr, boolean[][] check, int x, int y)`**: 
  - Validates coordinates are within bounds (0-3)
  - Checks if the coordinate has already been used
  - Returns the point value if valid, or -1 if invalid/used
  - Marks the coordinate as used in the tracking array

## 🎯 Game Features

- ✅ Random board generation with unique values
- ✅ Two-player turn-based gameplay
- ✅ Input validation and error handling
- ✅ Visual board display showing popped balloons
- ✅ Score tracking for both players
- ✅ Win/loss/draw determination
- ✅ Exit command for early game termination

## 🏆 Winning Strategy

- Try to remember or track which areas of the board have higher values
- Block your opponent from high-value positions
- Balance between taking safe points and gambling on unrevealed positions

## 🤝 Contributing

Feel free to fork this project and submit pull requests with improvements!

## 📄 License

This project is open source and available for educational purposes.