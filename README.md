# Lab 14

## Heat Map

This program contains the class 'Heatmap', which represents values of temperature values across a given value, these values are stored in a 2D array. Two additional class were made to access the data and display a visual to represent the data.

- `Main`: Contains the main method and tester code for your `Heatmap` class.
- `HeatmapViewer`: Contains code  to visually display a given `Heatmap`.

The class 'Heatmap' contains one constructor and the following methods. 

| Method                           | Description                                                                  |
| -------------------------------- | ---------------------------------------------------------------------------- |
| public void printHeatmap()       | Prints the `Heatmap` in row-major order                                      |
| public double sumHeatmap()       | Sums the contents of the `Heatmap` and returns the sum                       |
| public double avgHeatmap()       | Averages the contents of the `Heatmap` and returns the average temperature   |
| public double sumColumn(int col) | Sums the contents of the `Heatmap` from the given column and returns the sum |
| public double sumRow(int row)    | Sums the contents of the `Heatmap` from the given row and returns the sum    |
| public int areCold ()            | Counts and returns the number of data points under 10 degrees                |

## Battleship Game Board Validator

The program validates a battleship board. The game board is a 10 by 10 array of Strings(or chars). 

Here is a sample input file containing a board: 

```
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,R,0,0
0,0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0,0
B,B,B,B,0,0,0,0,0,0
0,0,0,0,0,0,0,D,0,0
S,S,S,0,0,0,0,D,0,0
0,0,0,0,0,0,0,0,0,0
```

- C is a Carrier(5 squares)
- B is a Battleship(4 squares)
- R is a Cruiser(3 squares)
- S is a Submarine(3 squares)
- D is a Destroyer (2 squares)

This is a **valid** battleship board. It is 10 by 10, has all 5 ships(which have each been represented by the correct number of squares) placed horizontally or vertically on the board.

```
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0,0
B,B,B,B,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0,0
S,S,S,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0,0
```

This is an **invalid** battleship board. It is 10 by 10, but is missing the Destroyer. 

A `ValidateRunner` and `Validate` class were created. The `ValidateRunner` prompts the user for a file name and create a 2D array to represent their input. Then, the `Validate` class with the static method `boardValidator(String[][] board)`. This returns `True` or `False` based on if the inputted board was valid. Then in your `VaildateRunner`, use the `validateBoard` method to test if the inputted board is valid and print the information to the user.  


### Step 2

A satic method in `Validate` called `balanced(String[][] board)` was created. This will return `True` if each row and column contain only 0-2 ships.

For example:
```
0,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0
B,B,B,B,0,0,0,D,0
0,0,0,0,0,0,0,D,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,0,0,0,0
S,S,S,0,0,0,0,0,0
```

This is **unbalanced** because column 1 contains 4 different ships. 

```
0,0,S,S,S,0,0,0,0
0,0,0,0,0,0,0,0,0
C,C,C,C,C,0,0,0,0
0,0,0,0,0,0,0,D,0
0,0,0,0,0,0,0,D,0
R,0,0,0,0,0,0,0,0
R,0,0,0,0,B,B,B,B
R,0,0,0,0,0,0,0,0
0,0,0,0,0,0,0,0,0
```

This is **balanced** because each row and column contains 2 or fewer ships.
