Core Math Library Project

What is this?
This is my Java homework where I built a "Core Math Library." Instead of putting all the code in one big file, I used Object-Oriented Programming (OOP) to break it down into smaller, organized pieces.
Class Responsibilities (Who does what?)
Here is how I split up the work:

MathematicalOperation (The Parent)
This is the main base class. Its only job is to hold the numbers (inputs) that we want to calculate. It passes these numbers down to the other classes so I don't have to type them again and again.

ArithmeticOps (The Calculator)
This class handles the basic stuff: Add, Subtract, Multiply, and Divide. It checks if you try to divide by zero, too.

GeometryOps (The Shapes)
This class does the geometry math. It calculates Area and Perimeter for Rectangles and Area and Circumference for Circles.

NumberAnalysis (The Number Checker)
This class looks at just one number to see if it is Prime, calculates its Factorial, or checks if it is Even/Odd.

MathLibraryApp (The Main Menu)
This is the actual program you run. It shows the menu options (1-5) and lets the user type in their choice.

Inheritance Structure (The Family Tree)
I used inheritance so I didn't have to repeat code. The MathematicalOperation class is the Parent, and the specific math classes are the Children.
Because the Children inherit from the Parent, they automatically get access to the input variables (operand1 and operand2).

My Class Hierarchy:

Plaintext
MathematicalOperation (Parent)
  |
  +-- ArithmeticOps (Child)
  |
  +-- GeometryOps (Child)
  |
  +-- NumberAnalysis (Child)
How I Used Encapsulation (Security)
Encapsulation is like a security guard for my data.

Making things Private: I made the variables operand1 and operand2 private. This means other parts of the program can't just reach in and change the numbers messily.

Using Getters and Setters: If you want to change or read the numbers, you have to use the public methods (like setInputs or getOperand1). This makes sure the data is handled safely.

Example:

❌ Bad: math.operand1 = 5; (The code won't let you do this).

✅ Good: math.setOperand1(5); (This is the correct way).

SAMPLE RUN
=== Core Math Library (OOP Implementation) ===

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 1
Enter first number: 20
Enter second number: 5
Addition: 25.0
Subtraction: 15.0
Multiplication: 100.0
Division: 4.0

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 2
  A. Circle
  B. Rectangle
  Select shape: A
Enter Radius: 9
Circle Area: 254.46900494077323
Circumference: 56.548667764616276

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 3
Enter a number to analyze: 25
Is Prime? false
Factorial: 7034535277573963776
Type: Odd

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 4

[Design Hierarchy Visualization]
Base Class: MathematicalOperation
  +-- ArithmeticOps
  +-- GeometryOps
  +-- NumberAnalysis

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 5
Enter angle in degrees: 45
Sine: 0.7071
Cosine: 0.7071

Select a Problem/Module:
1. Problem 1: Arithmetic Operations
2. Problem 2: Geometry Computations
3. Problem 3: Number Analysis
4. Problem 4: Hierarchy Design Info
5. Problem 5: Extensibility Demo
0. Exit
Enter choice: 0
Exiting Library...
BUILD SUCCESSFUL (total time: 48 seconds)

