# Programming Building Blocks

There are a lot of programming languages out there. They differ in syntax, how to execute the written code, how to ship/deploy your app,what platforms you can ship to, is it a compiled language or a scripting (interpreted) language, open source or not, what libraries are available, are they free to use, object orientation vs functional vs procedural etc.

## Values and Variables

Most languages allow you to:

- create variables
- instantiate variables (create the variables and assign it to a value)
- handle different types of data:
  - string (text)
  - integers (whole number)
  - boolean (true/false)
  - lists and arrays of data
  - maps of data (key -> value) pairs

## Operators

With all these values and variables you would want to do something with it:

- Arithmetic Operators: add, subtract, multiply, divide, modulus division, exponent
- Comparison (Relational) Operators: equal, bigger than, smaller than, not equal
- Assignment Operators: plus and assign, subtract and assign, multiply and assign, divide and assign
- Logical Operators: AND, OR, NOT, XOR
- Bitwise Operators: for binary operations
- Membership Operators: for checking if a element is in a bigger object

Each language also has a specific operator precedence, which is comparable to [math's order of operations](https://en.wikipedia.org/wiki/Order_of_operations)

## Branch Operations - Control the flow

Most programming languages executes from top-down, from the first line you wrote then the next line until it reaches the end of the program. We say that the code is executed sequentially.

Sometimes you want to skip over or do specific commands if a certain condition is met. Or you want to jump to another part of your code to execute the code there, and then return to where the initial code branched off.

Branch operations changes the flow of your program.

### Decision making operators

Most languages provide the following:

- if statements: these are used to do something if a condition is met
- if..else statements
- nested if statements
- these statements use comparison operators: e.g. if (x > 32)
- these statements can be combined with logical operators: e.g. if (x == 1) AND (y == 2)

### Looping operators

Looping is the concept of doing the same thing over and over, until a condition are met. Another name for loop is iterate.

All languages provide some or all of the following loop operators:

- for (condition) loop
- for each element loop
- while (condition) do of repeat until loop
- do while (condition) or do until loop

### Functions, methods and subroutines

Most languages provide a way to define functions/methods to give a certain sequance of commands a name, which can be called when required

- functions can have parameters which is passed into the function
- functions can return their results

## Reusability and Importing other code

Most languages allows you to import code from other parts of your project, or other libraries which might be available freely, into your current source code's scope

- once you import that code into the current code, you can reference/use it
- you can also make your code available to be imported by your other code so that you don't need to rewrite it

## Basic functionality

Most languages already has libraries that allows you to do some basic things:

- read and write files from your hard drive
- print output to the console
- time/date library, to handle time and dates
- conversion between types
- advanced math operations
- handling exceptions
- regular expressions
- code comments
- event/interrupt handling

Most languages includes:

- an easy way to find and download libraries
- debugging tools
- performance monitoring tools

## Data modeling and structures

Most languages allows you to model your data:

- class or structures
- abstract classes
- implementations/trait
- multi-dimensional arrays
