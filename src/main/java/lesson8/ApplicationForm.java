package lesson8;

import lesson8.components.DigitJButton;
import lesson8.components.OperatorJButton;
import lesson8.listeners.ButtonListener;
import lesson8.listeners.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm(String title) {
        super(title);
        setBounds(3500, 100, 250, 370);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH);

        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createTopPanel() {

        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);
        top.add(inputField);
        top.setVisible(true);

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));
        inputField.setMargin(new Insets(8, 0, 8, 0));
        inputField.setBackground(new Color(142, 232, 78));

        return top;
    }

    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER);
        centerPanel.add(createOperatorsPanel(buttonListener), BorderLayout.EAST);

        return centerPanel;
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);
            JButton btn = new DigitJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }

        JButton calc = new OperatorJButton("=");
        calc.addActionListener(buttonListener);
        digitsPanel.add(calc);

        JButton clear = new OperatorJButton("C");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clear);

        return digitsPanel;
    }

    private JPanel createOperatorsPanel(ActionListener buttonListener) {
        JPanel operatorsPanel = new JPanel();
        operatorsPanel.setLayout(new GridLayout(4, 1));

        JButton minus = new OperatorJButton("-");
        minus.addActionListener(buttonListener);
        operatorsPanel.add(minus);

        JButton plus = new OperatorJButton("+");
        plus.addActionListener(buttonListener);
        operatorsPanel.add(plus);

        JButton multiply = new OperatorJButton("x");
        multiply.addActionListener(buttonListener);
        operatorsPanel.add(multiply);

        JButton divide = new OperatorJButton("/");
        divide.addActionListener(buttonListener);
        operatorsPanel.add(divide);

        return operatorsPanel;
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);

        JMenuItem exitInFile = new JMenuItem("Exit");
        exitInFile.addActionListener(e -> System.exit(0));
        menuFile.add(exitInFile);

        menuBar.add(menuFile);
        menuBar.add(new JMenuItem("Help"));
        menuBar.add(new JMenuItem("About"));

        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        menuBar.add(exit);

        return menuBar;
    }
}
