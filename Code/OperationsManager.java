import javax.swing.JTextArea;
/**
 * This is a class that manages operations and what to do should an operation button be pressed using if 
 * statements. This includes the four basic operations as well as root, power, sin, cos, tan, 1/x, converting
 * to percent, switching between plus and minus, absolute value, log, clear and equals.
 * 
 * @author Jeremy D. W.
 * @version 7/4/2024
 */
public class OperationsManager {
	
	// Variables for each of the four main operations plus root and power since they all work similarly (enter a number, press the button, enter another number and then press the equals button or another operator)
	private boolean a, d, s, m, p, r;
	// A temporary variable so the number that isn't currently in the JTextArea is stored somewhere and the calculator can properly work. 
	private double temp;
	// A variable for checking if the JTextArea has been cleared or not.
	private boolean cleared;
	
	/**
	 * Constructs the OperationsManager class.
	 */
	public OperationsManager() {
		a = false;
		d = false;
		s = false;
		m = false;
		p = false;
		r = false;
		temp = 0;
		cleared = false;
	}
	
	/**
	 * This returns the value of the a variable.
	 * 
	 * @return the value of a; used to check if the addition button has been pressed.
	 */
	public boolean getAddition() {
		return a;
	}
	
	/**
	 * This returns the value of the d variable.
	 * 
	 * @return the value of d; used to check if the division button has been pressed.
	 */
	public boolean getDivision() {
		return d;
	}
	
	/**
	 * This returns the value of the s variable.
	 * 
	 * @return the value of s; used to check if the subtraction button has been pressed.
	 */
	public boolean getSubtraction() {
		return s;
	}
	
	/**
	 * This returns the value of the m variable.
	 * 
	 * @return the value of m; used to check if the multiplication button has been pressed.
	 */
	public boolean getMultiplication() {
		return m;
	}
	
	/**
	 * This returns the value of the p variable.
	 * 
	 * @return the value of p; used to check if the power button has been pressed.
	 */
	public boolean getPower() {
		return p;
	}
	
	/**
	 * This returns the value of the r variable.
	 * 
	 * @return the value of r; used to check if the root button has been pressed.
	 */
	public boolean getRoot() {
		return r;
	}
	
	/**
	 * This is the logic for the division button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the division button at the same time
	 * by running the methods to check the calculations.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void divide(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			d = true;
			a = false;
			m = false;
			s = false;
			p = false;
			r = false;
			cleared = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			d = true;
			a = false;
			m = false;
			s = false;
			p = false;
			r = false;
		}
	}
	
	/**
	 * This is the logic for the add button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the add button at the same time by
	 * running the methods to check the calculations.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void add(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			a = true;
			d = false;
			m = false;
			s = false;
			p = false;
			r = false;
			cleared = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			a = true;
			d = false;
			m = false;
			s = false;
			p = false;
			r = false;
		}
	}
	
	/**
	 * This is the logic for the multiply button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the multiply button at the same time by
	 * running the methods to check the calculations.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void multipy(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			m = true;
			a = false;
			s = false;
			d = false;
			p = false;
			r = false;
			cleared = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			m = true;
			a = false;
			s = false;
			d = false;
			p = false;
			r = false;
		}
	}
	
	/**
	 * This is the logic for the subtract button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the subtract button at the same time by
	 * running the methods to check the calculations.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void subtract(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			s = true;
			a = false;
			m = false;
			d = false;
			r = false;
			p = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			s = true;
			a = false;
			m = false;
			d = false;
			r = false;
			p = false;
		}
	}
	
	/**
	 * This is the logic for the power button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the power button at the same time by
	 * running themethods to check the calculations.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void power(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			p = true;
			a = false;
			m = false;
			s = false;
			d = false;
			r = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			p = true;
			a = false;
			m = false;
			s = false;
			d = false;
			r = false;
		}
	}
	
	/**
	 * This is the logic for the root button, aside from what booleans are triggered, it's the same as
	 * the other 5, two-input style operators. It uses the checkEmpty() method to make sure nothing is done
	 * should the display be empty or just a decimal (period) is in the display. Then, if there is a non-zero
	 * value in temp, it treats the button like the equals button and the root button at the same time by
	 * running the applyCalculations method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void root(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else if (temp != 0) {
			temp = Double.parseDouble(display.getText());
			applyAdd(display);
			applyDivide(display);
			applyMultiply(display);
			applySubtract(display);
			applyRoot(display);
			applyPower(display);
			r = true;
			a = false;
			m = false;
			s = false;
			d = false;
			p = false;
		}
		else {
			temp = Double.parseDouble(display.getText());
			r = true;
			a = false;
			m = false;
			s = false;
			d = false;
			p = false;
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was divided by 100.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void percent(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Double.parseDouble(display.getText()) / 100);
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was multiplied by -1.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void plusMinus(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Double.parseDouble(display.getText()) * -1);
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was under the Math.sin method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void sin(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Math.sin(Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was under the Math.cos method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void cos(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Math.cos(Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was under the Math.tan method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void tan(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Math.tan(Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was under the Math.abs method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void absolute(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Math.abs(Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was as the denominator to a numerator of 1.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void x1(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + (1 / Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if the display is empty or has just a decimal (period), if not, sets the text in the JTextArea
	 * to what it was under the Math.Log method.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void log(JTextArea display) {
		if (checkEmpty(display)) {

		}
		else {
			display.setText("" + Math.log(Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Checks if a JTextArea is completely empty or only has a decimal (period) using the getText and equals
	 * methods and returns a corresponding true or false value. 
	 * 
	 * @param display the JTextArea that has it's text checked.
	 * 
	 * @return a true or false value depending on if the JTextArea is empty/only contains a decimal (period) or contains something.
 	 */
	public boolean checkEmpty(JTextArea display) {
		if (display.getText().equals("") || display.getText().equals(".")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Runs the applyCalculations method and then sets every boolean in this class to false; it's exactly
	 * as you would expect from a standard calculator.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void equal(JTextArea display) {
		applyAdd(display);
		applyDivide(display);
		applyMultiply(display);
		applySubtract(display);
		applyRoot(display);
		applyPower(display);

		a = false;
		d = false;
		m = false;
		s = false;
		p = false;
		r = false;
		cleared = false;
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applyAdd(JTextArea display) {
		if (a == true) {
			display.setText("" + (temp + Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applyDivide(JTextArea display) {
		if (d == true) {
			display.setText("" + (temp / Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applyMultiply(JTextArea display) {
		if (m == true) {
			display.setText("" + (temp * Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applySubtract(JTextArea display) {
		if (s == true) {
			display.setText("" + (temp - Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applyPower(JTextArea display) {
		if (p == true) {
			display.setText("" + Math.pow(temp, Double.parseDouble(display.getText())));
		}
	}
	
	/**
	 * Applies the proper calculation to temp and what's currently in the JTextArea depending on what variable
	 * is true.
	 * 
	 * @param display the JTextArea that numbers are taken from and displayed to.
	 */
	public void applyRoot(JTextArea display) {
		if (r == true) {
			display.setText("" + Math.pow(Double.parseDouble(display.getText()), 1 / temp));
		}
	}
	
	/** 
	 * Sets every boolean to false, temp to zero and sets the text of the JTextArea to nothing; it's exactly
	 * as you would expect from a real calculator.
	 * 
	 * @param display the JTextArea that has its text set to nothing.
	 */
	public void clear(JTextArea display) {
		display.setText("");
		temp = 0;
		a = false;
		d = false;
		m = false;
		s = false;
		p = false;
		cleared = false;
	}
	
	/**
	 * Sets the cleared variable to that of the user's choosing.
	 * 
	 * @param c the value that cleared is to beset to.
	 */
	public void setCleared(boolean c) {
		cleared = c;
	}
	
	/** Returns the value of the cleared variable.
	 * 
	 * @return the cleared variable, used to check if the JTextArea has been cleared so that I user can enter
	 * more than one number after hitting an operator button.
	 */
	public boolean getCleared() {
		return cleared;
	}
}

