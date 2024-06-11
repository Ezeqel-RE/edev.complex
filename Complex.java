package edev.complex;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a complex number, which is a number that can be written
 * as a + bi, where a and b are real numbers, and i is the imaginary unit, which
 * is defined as i = sqrt(-1). Complex numbers are often used in electrical
 * engineering, physics, and other fields.
 * 
 * @author Ezeqèl
 */
public class Complex {

    private static interface ExceptionHandler {

        static final ExceptionHandler DIVISION_BY_ZERO = (condition, message) -> {
            if (condition) {
                throw new ArithmeticException(message);
            }
        };

        void handle(boolean condition, String message);
    }

    private static class Util {

        private static DecimalFormat df = new DecimalFormat(".##########");
        static {
            df.setGroupingSize(3);
            df.setGroupingUsed(true);
            DecimalFormatSymbols decimalFormatSymbols = df.getDecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator(' ');
            decimalFormatSymbols.setDecimalSeparator('.');
            df.setDecimalFormatSymbols(decimalFormatSymbols);
        }

        private static double format(double value) {
            return Double.parseDouble(df.format(value));
        }
    }

    /**
     * The imaginary unit, which is defined as i = sqrt(-1).
     */
    public static final Complex I = new Complex(0, 1);

    /**
     * The complex number one
     */
    public static final Complex ONE = new Complex(1, 0);

    /**
     * The complex number zero
     */
    public static final Complex ZERO = new Complex(0, 0);

    /**
     * This static method adds two complex numbers together. The parameters number1
     * and number2 are the two complex numbers to be added. The method returns a new
     * Complex object that is the sum of number1 and number2.
     * 
     * @param number1 the complex number.
     * @param number2 the complex number to be added.
     * @return the sum of number1 and number2.
     */
    public static Complex add(Complex number1, Complex number2) {
        return number1.add(number2);
    }

    /**
     * This static method adds a complex number and a real number together. The
     * parameters number is the complex number and value is the real number to be
     * added. The method returns a new Complex object that is the sum of number and
     * value.
     * 
     * @param number the complex number.
     * @param value  the real number to be added.
     * @return the sum of number and value.
     */
    public static Complex add(Complex number, double value) {
        return number.add(value);
    }

    /**
     * This static method divides two complex numbers. The parameters number1 and
     * number2 are the two complex numbers to be divided. The method returns a new
     * Complex object that is the quotient of number1 and number2. An
     * {@link ArithmeticException} is thrown if number2 is equal to the zero complex
     * number.
     * 
     * @param number1 the dividend.
     * @param number2 the divisor.
     * @return the quotient of number1 and number2.
     */
    public static Complex divide(Complex number1, Complex number2) {
        return number1.divide(number2);
    }

    /**
     * This static method divides a complex number by a real number. The parameters
     * number is the complex number and value is the real number to be divided by.
     * The method returns a new Complex object that is the quotient of number and
     * value. An {@link ArithmeticException} is thrown if value is zero.
     * 
     * @param number the dividend.
     * @param value  the divisor.
     * @return the quotient of number and value.
     */
    public static Complex divide(Complex number, double value) {
        return number.divide(value);
    }

    /**
     * This static method multiplies two complex numbers together. The parameters
     * number1 and number2 are the two complex numbers to be multiplied. The method
     * returns a new Complex object that is the product of number1 and number2.
     * 
     * @param number1 the complex number to be multiplied.
     * @param number2 the complex number to be multiplied.
     * @return the product of number1 and number2.
     */
    public static Complex multiply(Complex number1, Complex number2) {
        return number1.multiply(number2);
    }

    /**
     * This static method multiplies a complex number by a real number. The
     * parameters number is the complex number and value is the real number to be
     * multiplied by. The method returns a new Complex object that is the product of
     * number and value.
     * 
     * @param number the complex number to be multiplied by value.
     * @param value  the real number to be multiplied by.
     * @return the real number
     */
    public static Complex multiply(Complex number, double value) {
        return number.multiply(value);
    }

    /**
     * This method returns the nth roots of this complex number. The parameter n is
     * the integer order of the roots to find. The method returns a list of n
     * Complex objects, which are the nth roots of this number. If n is zero, then
     * an {@link ArithmeticException} is thrown. If this number is the zero complex
     * number, then the method returns an empty list.
     * 
     * @param number this complex number.
     * @param n      the integer order of the roots to find.
     * @return a list of n Complex objects, which are the nth roots of this number.
     */
    public static List<Complex> nthRoots(Complex number, int n) {
        return number.nthRoots(n);
    }

    /**
     * This static method raises a complex number to a power. The parameters number
     * is the complex number to be raised to a power and exponent is the integer
     * power to raise the number to. The method returns a new Complex object that is
     * number raised to the power of exponent.
     * 
     * @param number   the complex number to be raised to a power.
     * @param exponent the integer power to raise the number to.
     * @return a new Complex object that is number raised to the power of exponent.
     */
    public static Complex power(Complex number, int exponent) {
        return number.power(exponent);
    }

    /**
     * This method returns the square roots of this complex number. The method
     * returns a list of two Complex objects, which are the two square roots of this
     * number. If this number is the zero complex number, then the method returns an
     * empty list.
     * 
     * @param number the complex number.
     * @return a list of two Complex objects, which are the two square roots of this
     *         number.
     */
    public static List<Complex> squareRoot(Complex number) {
        return number.squareRoot();
    }

    /**
     * This static method subtracts one complex number from another. The parameters
     * number1 and number2 are the two complex numbers. The method returns a new
     * Complex object that is the difference of number1 and number2.
     * 
     * @param number1 the complex number.
     * @param number2 the complex number.
     * @return the difference of number1 and number2.
     */
    public static Complex subtract(Complex number1, Complex number2) {
        return number1.subtract(number2);
    }

    /**
     * This static method subtracts a real number from a complex number. The
     * parameters number is the complex number and value is the real number to be
     * subtracted. The method returns a new Complex object that is the difference of
     * number and value.
     * 
     * @param number the complex number.
     * @param value  the real number to be subtracted.
     * @return a new Complex object that is the difference of number and value.
     */
    public static Complex subtract(Complex number, double value) {
        return number.subtract(value);
    }

    private double imaginaryPart;

    private double realPart;

    public Complex(double real, double imaginary) {
        this.setRealPart(real);
        this.setImaginaryPart(imaginary);
    }

    /**
     * This method adds this complex number to another complex number. The parameter
     * number is the complex number to be added. The method returns a new Complex
     * object that is the sum of this number and number.
     * 
     * @param number the complex number to be added.
     * @return the sum of this number and number.
     */
    public Complex add(Complex number) {
        return new Complex(realPart + number.realPart, imaginaryPart + number.imaginaryPart);
    }

    /**
     * This method adds this complex number to a real number. The parameter value is
     * the real number to be added. The method returns a new Complex object that is
     * the sum of this number and value.
     * 
     * @param value the real number to be added.
     * @return the sum of this number and value.
     */
    public Complex add(double value) {
        return new Complex(realPart + value, imaginaryPart);
    }

    /**
     * This method divides this complex number by another complex number. The
     * parameter number is the complex number to divide by. The method returns a new
     * Complex object that is the quotient of this number and number. An
     * {@link ArithmeticException} is thrown if number is equal to the zero complex
     * number.
     * 
     * @param number the complex number to divide by.
     * @return the quotient of this number and number.
     */
    public Complex divide(Complex number) {
        ExceptionHandler.DIVISION_BY_ZERO.handle(number.equals(ZERO), "Division by zero");
        Complex conjugate = number.getConjugate();
        Complex dividend = this.multiply(conjugate);
        double divisor = number.multiply(conjugate)
                               .getRealPart();
        double real = dividend.getRealPart() / divisor;
        double imaginary = dividend.getImaginaryPart() / divisor;
        return new Complex(real, imaginary);
    }

    /**
     * This method divides this complex number by a real number. The parameter value
     * is the real number to divide by. The method returns a new Complex object that
     * is the quotient of this number and value. An {@link ArithmeticException} is
     * thrown if value is zero.
     * 
     * @param value the real number to divide by.
     * @return the quotient of this number and value.
     */
    public Complex divide(double value) {
        return this.divide(new Complex(value, 0));
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Complex) {
            Complex other = (Complex) object;
            return realPart == other.realPart && imaginaryPart == other.imaginaryPart;
        }
        return false;
    }

    /**
     * This method returns the argument (angle) of this complex number. The method
     * returns the angle in radians. If this number is the zero complex number, then
     * the method returns 0. If the real part of this number is zero, then the
     * method returns Math.PI/2 if the imaginary part is positive, and -Math.PI/2 if
     * the imaginary part is negative. Otherwise, the method calculates the angle
     * using the Math.atan() function.
     * 
     * @return the angle in radians.
     */
    public double getArgument() {
        final double PI = Math.PI;
        if (this.equals(ZERO)) {
            return 0;
        } else if (realPart == 0) {
            return imaginaryPart > 0 ? PI / 2 : -PI / 2;
        } else if (imaginaryPart == 0) {
            return realPart > 0 ? 0 : PI;
        } else {
            double x = Math.abs(realPart);
            double y = Math.abs(imaginaryPart);
            double angle = Math.atan(y / x);
            if (realPart > 0 && imaginaryPart > 0) {
                return angle;
            } else if (realPart < 0 && imaginaryPart > 0) {
                return PI - angle;
            } else if (realPart < 0 && imaginaryPart < 0) {
                return PI + angle;
            } else {
                return -angle;
            }
        }
    }

    /**
     * This method returns the conjugate of this complex number.<br/>
     * The conjugate of a complex number {@code a + bi} is a - bi. The method
     * returns a new Complex object that is the conjugate of this number.
     * 
     * @return the conjugate of this number.
     */
    public Complex getConjugate() {
        return new Complex(realPart, -imaginaryPart);
    }

    /**
     * This method returns the imaginary part of this complex number. The method
     * returns the imaginary part, which is the b part of the complex number a + bi.
     * 
     * @return the imaginary part.
     */
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    /**
     * This method returns the magnitude (absolute value) of this complex number.
     * The magnitude of a complex number a + bi is sqrt(a^2 + b^2). The method
     * returns the magnitude of this number.
     * 
     * @return the magnitude of this number.
     */
    public double getMagnitude() {
        return Math.sqrt((realPart * realPart) + (imaginaryPart * imaginaryPart));
    }

    /**
     * This method returns the real part of this complex number. The method returns
     * the real part, which is the a part of the complex number a + bi.
     * 
     * @return the real part
     */
    public double getRealPart() {
        return realPart;
    }

    /**
     * This method returns the inverse of this complex number. The inverse of a
     * complex number a + bi is (a - bi)/(a^2 + b^2). The method returns a new
     * Complex object that is the inverse of this number.
     * 
     * @return the inverse of this number.
     */
    public Complex inverse() {
        Complex conjugate = this.getConjugate();
        return conjugate.divide(this.multiply(conjugate));
    }

    /**
     * This method multiplies this complex number by another complex number. The
     * parameter number is the complex number to multiply by. The method returns a
     * new Complex object that is the product of this number and number.
     * 
     * @param number the complex number to multiply by.
     * @return the product of this number and number.
     */
    public Complex multiply(Complex number) {
        return new Complex((realPart * number.realPart) - (imaginaryPart * number.imaginaryPart),
                           (realPart * number.imaginaryPart) + (imaginaryPart * number.realPart));
    }

    /**
     * This method multiplies this complex number by a real number. The parameter
     * value is the real number to multiply by. The method returns a new Complex
     * object that is the product of this number and value.
     * 
     * @param value the real number to multiply by.
     * @return the product of this number and value.
     */
    public Complex multiply(double value) {
        return new Complex(realPart * value, imaginaryPart * value);
    }

    /**
     * This method returns the nth roots of this complex number. The parameter n is
     * the integer order of the roots to find. The method returns a list of n
     * Complex objects, which are the nth roots of this number. If n is zero, then
     * an {@link ArithmeticException} is thrown. If this number is the zero complex
     * number, then the method returns an empty list.
     * 
     * @param n the integer order of the roots to find.
     * @return a list of n Complex objects, which are the nth roots of this number.
     */
    public List<Complex> nthRoots(int n) {
        ExceptionHandler.DIVISION_BY_ZERO.handle(n == 0, "Division by zero");
        if (n > 0) {
            List<Complex> roots = new ArrayList<>();
            double modulus = Math.pow(this.getMagnitude(), 1.0 / n);
            double argument = getArgument() / n;
            for (int i = 0; i < n; i++) {
                double real = modulus * Math.cos(argument + ((2.0 * i * Math.PI) / n));
                double imaginary = modulus * Math.sin(argument + ((2.0 * i * Math.PI) / n));
                roots.add(new Complex(real, imaginary));
            }
            return Collections.unmodifiableList(roots);
        } else {
            return inverse().nthRoots(Math.abs(n));
        }
    }

    /**
     * This method raises this complex number to a power. The parameter exponent is
     * the integer power to raise the number to. The method returns a new Complex
     * object that is this number raised to the power of exponent. If exponent is
     * negative, then the method raises the inverse of this number to the absolute
     * value of exponent. If exponent is zero, then the method returns the complex
     * number 1 + 0i. If exponent is one, then the method returns this number. If
     * exponent is two, then the method returns the product of this number and
     * itself. Otherwise, the method recursively calls the power() method to
     * calculate the result.
     * 
     * @param exponent the integer power to raise the number to.
     * @return a new Complex object that is this number raised to the power of
     *         exponent.
     */
    public Complex power(int exponent) {
        if (exponent < 0) {
            return this.inverse()
                       .power(Math.abs(exponent));
        } else if (exponent == 0) {
            return ONE;
        } else if (exponent == 1) {
            return this;
        } else if (exponent == 2) {
            return this.multiply(this);
        } else {
            return this.multiply(this.power(exponent - 1));
        }
    }

    /**
     * This method sets the imaginary part of this complex number. The parameter
     * value is the new imaginary part. The method updates the imaginary part of
     * this number to value.
     * 
     * @param value the new imaginary part.
     */
    public void setImaginaryPart(double value) {
        this.imaginaryPart = Util.format(value);
    }

    /**
     * This method sets the real part of this complex number. The parameter value is
     * the new real part. The method updates the real part of this number to value.
     * 
     * @param value the new real part.
     */
    public void setRealPart(double value) {
        this.realPart = Util.format(value);
    }

    /**
     * This method returns the square roots of this complex number. The method
     * returns a list of two Complex objects, which are the two square roots of this
     * number. If this number is the zero complex number, then the method returns an
     * empty list.
     * 
     * @return a list of two Complex objects, which are the two square roots of this
     *         number.
     */
    public List<Complex> squareRoot() {
        return nthRoots(2);
    }

    /**
     * This method subtracts one complex number from this complex number. The
     * parameter number is the complex number to be subtracted. The method returns a
     * new Complex object that is the difference of this number and number.
     * 
     * @param number the complex number to be subtracted.
     * @return the difference of this number and number.
     */
    public Complex subtract(Complex number) {
        return new Complex(realPart - number.realPart, imaginaryPart - number.imaginaryPart);
    }

    /**
     * This method subtracts a real number from this complex number. The parameter
     * value is the real number to be subtracted. The method returns a new Complex
     * object that is the difference of this number and value.
     * 
     * @param value the real number to be subtracted.
     * @return the difference of this number and value.
     */
    public Complex subtract(double value) {
        return new Complex(realPart - value, imaginaryPart);
    }

    @Override
    public String toString() {
        if (this.equals(ZERO)) {
            return "0";
        }
        String externalForm = realPart == 0 ? "" : realPart + "";
        if (imaginaryPart > 0) {
            externalForm += imaginaryPart == 1 ? "+i" : "+" + imaginaryPart + "i";
        } else if (imaginaryPart < 0) {
            externalForm += imaginaryPart == -1 ? "-i" : imaginaryPart + "i";
        }
        return realPart != 0 ? externalForm : externalForm.contains("+") ? externalForm.replace("+", "") : externalForm;
    }

}
