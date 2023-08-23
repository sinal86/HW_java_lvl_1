package lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListener implements ActionListener {

    private final JTextField inputField;

    private ArrayList<String> arrayList = new ArrayList<>();

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();
        arrayList.add(btn.getText());
        inputField.setText(inputField.getText() + " " + btn.getText());

        if (inputField.getText().contains("=")) {
            if(inputField.getText().contains("+")) {
            inputField.setText((Integer.parseInt(arrayList.get(0)) + Integer.parseInt(arrayList.get(2))) + "");
            }

            if(inputField.getText().contains("-")) {
                inputField.setText((Integer.parseInt(arrayList.get(0)) - Integer.parseInt(arrayList.get(2))) + "");
            }

            if(inputField.getText().contains("x")) {
                inputField.setText((Integer.parseInt(arrayList.get(0)) * Integer.parseInt(arrayList.get(2))) + "");
            }

            if(inputField.getText().contains("/")) {
                inputField.setText((Integer.parseInt(arrayList.get(0)) / Integer.parseInt(arrayList.get(2))) + "");
            }
        }
    }
}
