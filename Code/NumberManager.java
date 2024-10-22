import javax.swing.JTextArea;
/**
 * The purpose of this class is to manage what's going to be inside the button action listeners of the
 * WindowCalc class with functions for standard buttons, zeroes, decimals and PI.
 * 
 * @author Jeremy D. W.
 * @version 7/4/2024
 */
public class NumberManager {
	
	/**
	 * This is the logic for when a user presses a button. It checks if any of the operations have been
	 * applied and then if the JTextArea has been cleared, if not it clears the text and then sets the
	 * variable to true if so, it just appends the string. If none of the operator variables are true, the
	 * display is appended to and the cleared variable is set to false.
	 * 
	 * @param i the string to be appended, for this purpose, it should only be the numbers 1-9 but can obviously be used in any way.
	 * @param operations an instance of the OperationsManager class, it's purposes is to check if the JTextArea has been cleared and if any of the operator buttons have been pressed.
	 * @param display the JTextArea to have the text from the i variable appended to.
	 */
	public void addButton(String i, OperationsManager operations, JTextArea display) {
		if (operations.getAddition() || operations.getDivision() || operations.getSubtraction() || operations.getMultiplication() || operations.getPower() || operations.getRoot()) {
			if(!operations.getCleared()) {
				display.setText("");
				operations.setCleared(true);
			}
			display.append(i);
		}
		else {
			display.append(i);
			operations.setCleared(false);
		}
	}
	
	/**
	 * Similar in concept to the addButton method, this has an added bit of logic to check if the JTextArea
	 * is empty before adding a 0 since most calculators do not allow for a leading 0. Division by 0 is not
	 * check since Java does not break when that happens.
	 * 
	 * @param operations an instance of the OperationsManager class, it's purposes is to check if the JTextArea has been cleared and if any of the operator buttons have been pressed.
	 * @param display the JTextArea to have the text from the i variable appended to.
	 */
	public void addZero(OperationsManager operations, JTextArea display) {
		if (display.getText().equals("")) {
			
		}
		else {
			if (operations.getAddition() || operations.getDivision() || operations.getSubtraction() || operations.getMultiplication() || operations.getPower() || operations.getRoot()) {
				if(!operations.getCleared()) {
					display.setText("");
					operations.setCleared(true);
				}
				display.append("0");
			}
			else {
				display.append("0");
				operations.setCleared(false);
			}
		}
	}
	
	/**
	 * Similar in concept to the addZero method, this checks if there is already a decimal (period) in the
	 * JTextArea, not adding one if there is.
	 * 
	 * @param operations an instance of the OperationsManager class, it's purposes is to check if the JTextArea has been cleared and if any of the operator buttons have been pressed.
	 * @param display the JTextArea to have the text from the i variable appended to.
	 */
	public void addDecimal(OperationsManager operations, JTextArea display) {
		if (display.getText().contains(".")) {
			
		}
		else {
			if (operations.getAddition() || operations.getDivision() || operations.getSubtraction() || operations.getMultiplication() || operations.getPower() || operations.getRoot()) {
				if(!operations.getCleared()) {
					display.setText("");
					operations.setCleared(true);
				}
				display.append(".");
			}
			else {
				display.append(".");
				operations.setCleared(false);
			}
		}
	}
	
	/**
	 * Similar in concept to the addDecimal method, this has added logic to either add proper PI or a
	 * decimal lacking equivalent depending on if there's already a decimal (period) in the JTextArea.
	 * 
	 * @param operations an instance of the OperationsManager class, it's purposes is to check if the JTextArea has been cleared and if any of the operator buttons have been pressed.
	 * @param display the JTextArea to have the text from the i variable appended to.
	 */
	public void addPi(OperationsManager operations, JTextArea display) {
		if (display.getText().contains(".")) {
			if (operations.getAddition() || operations.getDivision() || operations.getSubtraction() || operations.getMultiplication() || operations.getPower() || operations.getRoot()) {
				if(!operations.getCleared()) {
					display.setText("");
					operations.setCleared(true);
				}
				display.append("3141592653589793");
			}
			else {
				display.append("3141592653589793");
				operations.setCleared(false);
			}
		}
		else {
			if (operations.getAddition() || operations.getDivision() || operations.getSubtraction() || operations.getMultiplication() || operations.getPower() || operations.getRoot()) {
				if(!operations.getCleared()) {
					display.setText("");
					operations.setCleared(true);
				}
				display.append("" + Math.PI);
			}
			else {
				display.append("" + Math.PI);
				operations.setCleared(false);
			}
		}
	}
}
