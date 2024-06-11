# Class: Complex
This class represents a complex number, which is a number that can be written as a + bi, where a and b are real numbers, and i is the imaginary unit, which is defined as i = sqrt(-1). Complex numbers are often used in electrical engineering, physics, and other fields.  
** Methods: **
- `static Complex add(Complex number1, Complex number2)`: This static method adds two complex numbers together. The parameters number1 and number2 are the two complex numbers to be added. The method returns a new Complex object that is the sum of number1 and number2.
- `static Complex add(Complex number, double value)`: This static method adds a complex number and a real number together. The parameters number is the complex number and value is the real number to be added. The method returns a new Complex object that is the sum of number and value.
- `static Complex divide(Complex number1, Complex number2)`: This static method divides two complex numbers. The parameters number1 and number2 are the two complex numbers to be divided. The method returns a new Complex object that is the quotient of number1 and number2. An ArithmeticException is thrown if number2 is equal to the zero complex number.
- `static Complex divide(Complex number, double value)`: This static method divides a complex number by a real number. The parameters number is the complex number and value is the real number to be divided by. The method returns a new Complex object that is the quotient of number and value. An ArithmeticException is thrown if value is zero.
- ` static Complex multiply(Complex number1, Complex number2)`: This static method multiplies two complex numbers together. The parameters number1 and number2 are the two complex numbers to be multiplied. The method returns a new Complex object that is the product of number1 and number2.
- `static Complex multiply(Complex number, double value)`: This static method multiplies a complex number by a real number. The parameters number is the complex number and value is the real number to be multiplied by. The method returns a new Complex object that is the product of number and value.
- `static Complex power(Complex number, int exponent)`: This static method raises a complex number to a power. The parameters number is the complex number to be raised to a power and exponent is the integer power to raise the number to. The method returns a new Complex object that is number raised to the power of exponent.  
- `static List<Complex> squareRoot()`: This method returns the square roots of this complex number. The method returns a list of two Complex objects, which are the two square roots of this number. If this number is the zero complex number, then the method returns an empty list.
- `static List<Complex> nthRoots(int n)`: This method returns the nth roots of this complex number. The parameter n is the positive integer order of the roots to find. The method returns a list of n Complex objects, which are the nth roots of this number. If n is zero, then an ArithmeticException is thrown. If this number is the zero complex number, then the method returns an empty list.
- `static Complex subtract(Complex number1, Complex number2)`: This static method subtracts one complex number from another. The parameters number1 and number2 are the two complex numbers. The method returns a new Complex object that is the difference of number1 and number2.
- `static Complex subtract(Complex number, double value)`: This static method subtracts a real number from a complex number. The parameters number is the complex number and value is the real number to be subtracted. The method returns a new Complex object that is the difference of number and value.
Complex add(Complex number): This method adds this complex number to another complex number. The parameter number is the complex number to be added. The method returns a new Complex object that is the sum of this number and number.
- `Complex add(double value)`: This method adds this complex number to a real number. The parameter value is the real number to be added. The method returns a new Complex object that is the sum of this number and value.
- `Complex conjugate()`: This method returns the conjugate of this complex number. The conjugate of a complex number a + bi is a - bi. The method returns a new Complex object that is the conjugate of this number.
- `Complex divide(Complex number)`: This method divides this complex number by another complex number. The parameter number is the complex number to divide by. The method returns a new Complex object that is the quotient of this number and number. An ArithmeticException is thrown if number is equal to the zero complex number.
- `Complex divide(double value)`: This method divides this complex number by a real number. The parameter value is the real number to divide by. The method returns a new Complex object that is the quotient of this number and value. An ArithmeticException is thrown if value is zero.
- `boolean equals(Object object)`: This method checks if this complex number is equal to another object. The parameter object is the object to compare this number to. The method returns true if this number is equal to the object, and false otherwise.
- `double getArgument()`: This method returns the argument (angle) of this complex number. The method returns the angle in radians. If this number is the zero complex number, then the method returns 0. If the real part of this number is zero, then the method returns Math.PI / 2 if the imaginary part is positive, and -Math.PI / 2 if the imaginary part is negative. Otherwise, the method calculates the angle using the Math.atan2() function.
- `double getImaginaryPart()`: This method returns the imaginary part of this complex number. The method returns the imaginary part, which is the b part of the complex number a + bi.
- `double getMagnitude()`: This method returns the magnitude (absolute value) of this complex number. The magnitude of a complex number a + bi is sqrt(a^2 + b^2). The method returns the magnitude of this number.
- `double getRealPart()`: This method returns the real part of this complex number. The method returns the real part, which is the a part of the complex number a + bi.
- `Complex inverse()`: This method returns the inverse of this complex number. The inverse of a complex number a + bi is (a - bi) / (a^2 + b^2). The method returns a new Complex object that is the inverse of this number.
- `Complex multiply(Complex number)`: This method multiplies this complex number by another complex number. The parameter number is the complex number to multiply by. The method returns a new Complex object that is the product of this number and number.
- `Complex multiply(double value)`: This method multiplies this complex number by a real number. The parameter value is the real number to multiply by. The method returns a new Complex object that is the product of this number and value.
- `Complex power(int exponent)`: This method raises this complex number to a power. The parameter exponent is the integer power to raise the number to. The method returns a new Complex object that is this number raised to the power of exponent. If exponent is negative, then the method raises the inverse of this number to the absolute value of exponent. If exponent is zero, then the method returns the complex number 1 + 0i. If exponent is one, then the method returns this number. If exponent is two, then the method returns the product of this number and itself. Otherwise, the method recursively calls the power() method to calculate the result.
- `void setImaginaryPart(double value)`: This method sets the imaginary part of this complex number. The parameter value is the new imaginary part. The method updates the imaginary part of this number to value.
void setImaginaryPart(double value): This method sets the imaginary part of this complex number. The parameter value is the new imaginary part. The method updates the imaginary part of this number to value.
- `void setRealPart(double value)`: This method sets the real part of this complex number. The parameter value is the new real part. The method updates the real part of this number to value.
- `List<Complex> squareRoot()`: This method returns the square roots of this complex number. The method returns a list of two Complex objects, which are the two square roots of this number. If this number is the zero complex number, then the method returns an empty list.
- `List<Complex> nthRoots(int n)`: This method returns the nth roots of this complex number. The parameter n is the positive integer order of the roots to find. The method returns a list of n Complex objects, which are the nth roots of this number. If n is zero, then an ArithmeticException is thrown. If this number is the zero complex number, then the method returns an empty list.
- `Complex subtract(Complex number)`: This method subtracts one complex number from this complex number. The parameter number is the complex number to be subtracted. The method returns a new Complex object that is the difference of this number and number.
- `Complex subtract(double value)`: This method subtracts a real number from this complex number. The parameter value is the real number to be subtracted. The method returns a new Complex object that is the difference of this number and value. 
 
# Usage of the Class
The Complex class can be used to represent and perform operations on complex numbers. Here are some examples of how to use the class:

## Create a complex number:
```Java
Complex number1 = new Complex(2.0, 3.0);
```
## Access the real and imaginary parts of a complex number:
```Java
double realPart = number1.getRealPart();
double imaginaryPart = number1.getImaginaryPart();
```
## Perform arithmetic operations on complex numbers:
```Java
Complex sum = number1.add(number2);
Complex difference = number1.subtract(number2);
Complex product = number1.multiply(number2);
Complex quotient = number1.divide(number2);
```
## Calculate the square root or nth roots of a complex number:
```Java
List<Complex> squareRoots = number1.squareRoot();
List<Complex> nthRoots = number1.nthRoots(3);
```
## Get the argument (angle) of a complex number:
```Java
double argument = number1.getArgument();
```
## Get the magnitude (absolute value) of a complex number:
```Java
double magnitude = number1.getMagnitude();
```
## Invert a complex number:
```Java
Complex inverse = number1.inverse();
```
## Raise a complex number to a power:

```Java
Complex power = number1.power(4);
```
** Examples **  
Here is an example of how to use the Complex class to calculate the square roots of the complex number -3 + 4i:

```Java
Complex number = new Complex(-3.0, 4.0);
List<Complex> squareRoots = number.squareRoot();

for (Complex root : squareRoots) {
  System.out.println(root);
}
```
This code will print the following output:  
1+2i  
-1-2i  
This is because the square roots of -3 + 4i are 1 + 2i and -1 - 2i.
