import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A java.swing based calculator, this class includes methods other than the main method but they are to
 * instantiate basic elements of this class so, to me, it didn't make sense to have them be in their own
 * separate class/classes. There is no logic in this class, it just creates buttons, their action listeners
 * and a JTextArea and places them on a JFrame. All of the logic is handled in the OperationsManager and
 * NumberManager classes.
 * 
 * @author Jeremy D. W.
 * @version 7/4/2024
 */
public class WindowCalc {
	
	// The JFrame for this class which is instantiated in the initialize method.
	private JFrame frame;

	/**
	 * Runs the program by creating a WindowCalc instance named window, making it visible and putting it
	 * in a try/catch statement just to be safe.
	 * 
	 * @param args the default argument for a main method in Java.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowCalc window = new WindowCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Simply creates WindowCalc class by running the initialize method.
	 */
	public WindowCalc() {
		initialize();
	}

	/**
	 * This initializes everything that is going to be inside the JFrame, adds their action listeners (where
	 * applicable) and calls the functions for their logic from either the operations variable or the numbers
	 * variable.
	 */
	private void initialize() {
		OperationsManager operations = new OperationsManager();
		NumberManager numbers = new NumberManager();
		frame = new JFrame("The Calculator Of All Time");
		frame.setBounds(100, 100, 431, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		JTextArea display = new JTextArea();
		display.setLineWrap(true);
		display.setEditable(false);
		display.setBounds(16, 27, 387, 22);
		frame.getContentPane().add(display);

		JButton seven = new JButton("7");
		seven.setBounds(16, 100, 80, 20);
		frame.getContentPane().add(seven);

		JButton eight = new JButton("8");
		eight.setBounds(106, 100, 80, 20);
		frame.getContentPane().add(eight);

		JButton nine = new JButton("9");
		nine.setBounds(196, 100, 80, 20);
		frame.getContentPane().add(nine);

		JButton four = new JButton("4");
		four.setBounds(16, 150, 80, 20);
		frame.getContentPane().add(four);

		JButton five = new JButton("5");
		five.setBounds(106, 150, 80, 20);
		frame.getContentPane().add(five);

		JButton six = new JButton("6");
		six.setBounds(196, 150, 80, 20);
		frame.getContentPane().add(six);

		JButton one = new JButton("1");
		one.setBounds(16, 200, 80, 20);
		frame.getContentPane().add(one);

		JButton two = new JButton("2");
		two.setBounds(106, 200, 80, 20);
		frame.getContentPane().add(two);

		JButton three = new JButton("3");
		three.setBounds(196, 200, 80, 20);
		frame.getContentPane().add(three);

		JButton zero = new JButton("0");
		zero.setBounds(16, 250, 80, 20);
		frame.getContentPane().add(zero);

		JButton decimal = new JButton(".");
		decimal.setBounds(106, 250, 80, 20);
		frame.getContentPane().add(decimal);

		JButton equals = new JButton("=");
		equals.setBounds(196, 250, 80, 20);
		frame.getContentPane().add(equals);

		JButton divide = new JButton("\u00F7");
		divide.setBounds(323, 100, 80, 20);
		frame.getContentPane().add(divide);

		JButton multiply = new JButton("x");
		multiply.setBounds(323, 150, 80, 20);
		frame.getContentPane().add(multiply);

		JButton subtract = new JButton("-");
		subtract.setBounds(323, 200, 80, 20);
		frame.getContentPane().add(subtract);

		JButton add = new JButton("+");
		add.setBounds(323, 250, 80, 20);
		frame.getContentPane().add(add);

		JButton clear = new JButton("C");
		clear.setBounds(323, 50, 80, 20);
		frame.getContentPane().add(clear);

		JButton power = new JButton("x^y");
		power.setBounds(106, 50, 80, 20);
		frame.getContentPane().add(power);

		JButton pi = new JButton("\u03C0");
		pi.setBounds(323, 350, 80, 20);
		frame.getContentPane().add(pi);

		JButton percent = new JButton("%");
		percent.setBounds(196, 350, 80, 20);
		frame.getContentPane().add(percent);

		JButton root = new JButton("x^\u221Ay");
		root.setBounds(16, 50, 80, 20);
		frame.getContentPane().add(root);

		JButton plusMinus = new JButton("+/-");
		plusMinus.setBounds(323, 300, 80, 20);
		frame.getContentPane().add(plusMinus);

		JButton sin = new JButton("Sin");
		sin.setBounds(16, 300, 80, 20);
		frame.getContentPane().add(sin);

		JButton cos = new JButton("Cos");
		cos.setBounds(106, 300, 80, 20);
		frame.getContentPane().add(cos);

		JButton tan = new JButton("Tan");
		tan.setBounds(196, 300, 80, 20);
		frame.getContentPane().add(tan);

		JButton absolute = new JButton("abs");
		absolute.setBounds(106, 350, 80, 20);
		frame.getContentPane().add(absolute);

		JButton x1 = new JButton("1/x");
		x1.setBounds(196, 50, 80, 20);
		frame.getContentPane().add(x1);

		JButton log = new JButton("Log");
		log.setBounds(16, 350, 80, 20);
		frame.getContentPane().add(log);

		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("7", operations, display);
			}
		});

		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("8", operations, display);
			}
		});

		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("9", operations, display);
			}
		});

		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("4", operations, display);
			}
		});

		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("5", operations, display);
			}
		});

		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("6", operations, display);
			}
		});

		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("1", operations, display);
			}
		});

		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("2", operations, display);
			}
		});

		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addButton("3", operations, display);
			}
		});

		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addZero(operations, display);
			}
		});

		decimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addDecimal(operations, display);
			}
		});

		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numbers.addPi(operations, display);
			}
		});

		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.divide(display);
			}
		});

		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.add(display);
			}
		});

		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.multipy(display);
			}
		});

		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.subtract(display);
			}
		});

		power.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.power(display);
			}
		});

		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.root(display);
			}
		});

		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.percent(display);
			}
		});

		plusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.plusMinus(display);
			}
		});

		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.sin(display);
			}
		});

		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.cos(display);
			}
		});

		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.tan(display);
			}
		});

		absolute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.absolute(display);
			}
		});

		x1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.x1(display);
			}
		});

		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.log(display);
			}
		});

		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.equal(display);
			}
		});

		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations.clear(display);
			}
		});

	}
}
