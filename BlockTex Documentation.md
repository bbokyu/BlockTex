# BlockTex 2.0 DSL Documentation

### Preface

Read this guide to learn about LaTeX 2.0. With this DSL, you will be able to write mathematical equations in clean and intuitive way. 

### Target Users

New or existing LaTeX users with minimal familiarity with programming.

## Quick Start Guide

---

### Creating Equation Objects

Equation objects are the building blocks of our DSL. 

User can create a fraction object like this:

```
Create Fraction myFraction
```

**Create** is the keyword for starting new objects.

**Fraction** keyword determines what kind of object to create.

“**myFraction**” is the name of the object user assigns.

Each object has properties user can set. With a fraction object, you can set the numerator and the denominator like this:

```
Create Fraction myFraction
Set myFraction.numerator <- 1
Set myFraction.denominator <- 2
```

In the GUI, the myFraction object will be rendered as something like this:

$$
\frac{1}{2}
$$

To see the full list of objects and syntax details, go [here](https://www.notion.so/LaTeX-2-0-DSL-Documentation-9abacbd40e0c422db0ef27fb2e32a9d7?pvs=21).

### Combining Objects

Multiple objects can be combined to create more complex objects

```
Create Latex myLatex = "x_i"

Create Summation mySummation
Set mySummation.start <- 1
Set mySummation.end <- n
Set mySummation.equation = myLatex

Create Fraction myFraction
Set myFraction.numerator <- 4
Set myFraction.denominator <- mySummation
```

Here, **Latex object**, **Summation object**, and a **Fraction object** is being combined to render something like this:

$$
\frac{7}{\sum_{i=1}^nx_i} 
$$

**Latex object** is a special object that let’s you write standard latex into the language. 

### Performing Basic Arithmetic

```
Create Latex myLatex <- "x_i"
Create Latex endSummation <- "n"

Create Summation mySummation
Set mySummation.start <- 1 + 5
Set mySummation.end <- endSummation
Set mySummation.equation <- myLatex

Create Fraction myFraction
Set myFraction.numerator <- 3
Set myFraction.denominator <- mySummation
```

User can perform basic arithmetic in-line and the output will be automatically considered in the render.

$$
\frac{6}{\sum_{i=3}^nx_i} 
$$

### Creating and Updating Matrix

Matrix is a special object in BlockTex. User can create a matrix, then specify the shape using the shape property

```
Create Matrix myMatrix
Set myMatrix.shape <- (5, 5)
```

### Loops with Matrix

Loop operation can be used with matrices to traverse it

```
Create Matrix myMatrix
Set myMatrix.shape <- (5, 5)

Loop myMatrix {
	This <- Row * Col
}
End
```
**Row** and **Col** are the keywords that specify the current row number and column number in 0-based indexing for each iteration starting in top-right corner. It iterates through columns then rows. **This** is the element in current matrix which you can update. 

### Updating Individual Elements of Matrix (from Annie's user study)

User can update individual entries of the matrix using the element property followed by the (row, col) of element to update.
```
Create Latex myLatex = "\frac{1}{2}"
Set myMatrix.element <- (5, 5) <- myLatex
```

### Conditionals

Conditionals can be used inside loops to perform more complex operations

```
Create Matrix myMatrix
Set myMatrix.shape <- (5, 5)

Create Fraction myFraction
Set myFraction.numerator <- 1
Set myFraction.denominator <- 8

Loop myMatrix {
	if (Row == Col) {
		This = myFraction * 3
	} else {
		This = 0
  }
End
```

### Render Function
User can specifiy which functions to render. Write Render followed by object name.
```
Create Latex targetVar <- "x"

Create Fraction myFraction
Set myFraction.numerator <- 1
Set myFractionenominator <- 8

Render myFraction
```

## Equation Object and Properties

### Fraction

Required

- numerator
- denominator

```markdown
Create Fraction myFraction
Set myFraction.numerator <- 5
Set myFraction.denominator <- 4

Render myFraction
```
$$ \frac{5}{4} $$

Fraction functionality can be extended to create a derivative equation.
```
Create Fraction myDerivativeFraction
Set myDerivativeFraction.numerator <- numerator
Set myDerivativeFraction.denominator <- denominator

Render myDerivativeFraction
```
$$\frac{dy}{dx}$$



### Summation

Required

- start
    - If no value provided, assume from negative infinity
- end
    - If no int value provided, assume to infinity
- equation with variable
  - Equation must be a LaTeX variable in order to be rendered correctly

Default

- indexVariable ← i
- if end value is null, defaults to infty

```markdown

Create Latex summationEquation <- "2^{-n}"

Create Summation mySummation
Set mySummation.start <- 1
Set mySummation.end <- 1000
Set mySummation.equation <- summationEquation
```

$$\sum_{1}^{1000}2^{-n}$$



### Integrals

Required

- Integrand (function to integrate)
  - Integrand must be made in a LaTeX object to be rendered correctly
- Limits of integration
  - if any of the end values are null, defaults

```markdown
Create Latex myStart <- "a"
Create Latex myEnd <- "b"
Create Latex myEquation <- "x^2"

Create Integral myIntegral
Set myIntegral.start <- myStart
Set myIntegral.end <- myEnd
Set myIntegral.equation <- myEquation

Render myIntegral
```

$$\int_{a}{b} x^2 dx$$