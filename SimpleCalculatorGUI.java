package simpleCalculatorGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculatorGUI implements ActionListener {

    private double firstNumber = 0.00, resultOfCalculation = 0.00;
    private String numberOfCalculation = "";

    private JTextField userInputCalculatorField, resultOfCalculationField;
    private JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero, buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonComma, buttonCorrect, buttonClearAll, buttonCopyResult;

    void buildCalculatorGUI() {
        Font font = new Font("SansSerif", Font.BOLD, 20);

        JFrame calculatorGUI = new JFrame("Primordial Simple Calculator");

        userInputCalculatorField = new JTextField();
        userInputCalculatorField.setBounds(150, 380, 110, 50);
        userInputCalculatorField.setHorizontalAlignment(SwingConstants.CENTER);
        userInputCalculatorField.setFont(font);
        calculatorGUI.add(userInputCalculatorField);
        userInputCalculatorField.setEditable(false);

        resultOfCalculationField = new JTextField();
        resultOfCalculationField.setBounds(30, 30, 230, 40);
        resultOfCalculationField.setHorizontalAlignment(SwingConstants.CENTER);
        resultOfCalculationField.setFont(font);
        calculatorGUI.add(resultOfCalculationField);
        resultOfCalculationField.setEditable(false);

        buttonCorrect = new JButton("Correct");
        buttonCorrect.setBounds(30, 80, 80, 50);
        buttonCorrect.addActionListener(this);
        buttonCorrect.setFocusPainted(false);
        calculatorGUI.add(buttonCorrect);

        buttonClearAll = new JButton("Clear all");
        buttonClearAll.setBounds(120, 80, 80, 50);
        buttonClearAll.addActionListener(this);
        buttonClearAll.setFocusPainted(false);
        calculatorGUI.add(buttonClearAll);

        buttonDivide = new JButton("/");
        buttonDivide.setBounds(210, 80, 50, 50);
        buttonDivide.addActionListener(this);
        buttonDivide.setFocusPainted(false);
        calculatorGUI.add(buttonDivide);

        buttonOne = new JButton("1");
        buttonOne.setBounds(30, 140, 50, 50);
        buttonOne.addActionListener(this);
        buttonOne.setFocusPainted(false);
        calculatorGUI.add(buttonOne);

        buttonTwo = new JButton("2");
        buttonTwo.setBounds(90, 140, 50, 50);
        buttonTwo.addActionListener(this);
        buttonTwo.setFocusPainted(false);
        calculatorGUI.add(buttonTwo);

        buttonThree = new JButton("3");
        buttonThree.setBounds(150, 140, 50, 50);
        buttonThree.addActionListener(this);
        buttonThree.setFocusPainted(false);
        calculatorGUI.add(buttonThree);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(210, 140, 50, 50);
        buttonAdd.addActionListener(this);
        buttonAdd.setFocusPainted(false);
        calculatorGUI.add(buttonAdd);

        buttonFour = new JButton("4");
        buttonFour.setBounds(30, 200, 50, 50);
        buttonFour.addActionListener(this);
        buttonFour.setFocusPainted(false);
        calculatorGUI.add(buttonFour);

        buttonFive = new JButton("5");
        buttonFive.setBounds(90, 200, 50, 50);
        buttonFive.addActionListener(this);
        buttonFive.setFocusPainted(false);
        calculatorGUI.add(buttonFive);

        buttonSix = new JButton("6");
        buttonSix.setBounds(150, 200, 50, 50);
        buttonSix.addActionListener(this);
        buttonSix.setFocusPainted(false);
        calculatorGUI.add(buttonSix);

        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(210, 200, 50, 50);
        buttonSubtract.addActionListener(this);
        buttonSubtract.setFocusPainted(false);
        calculatorGUI.add(buttonSubtract);

        buttonSeven = new JButton("7");
        buttonSeven.setBounds(30, 260, 50, 50);
        buttonSeven.addActionListener(this);
        buttonSeven.setFocusPainted(false);
        calculatorGUI.add(buttonSeven);

        buttonEight = new JButton("8");
        buttonEight.setBounds(90, 260, 50, 50);
        buttonEight.addActionListener(this);
        buttonEight.setFocusPainted(false);
        calculatorGUI.add(buttonEight);

        buttonNine = new JButton("9");
        buttonNine.setBounds(150, 260, 50, 50);
        buttonNine.addActionListener(this);
        buttonNine.setFocusPainted(false);
        calculatorGUI.add(buttonNine);

        buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(210, 260, 50, 50);
        buttonMultiply.addActionListener(this);
        buttonMultiply.setFocusPainted(false);
        calculatorGUI.add(buttonMultiply);

        buttonComma = new JButton(",");
        buttonComma.setBounds(30, 320, 50, 50);
        buttonComma.addActionListener(this);
        buttonComma.setFocusPainted(false);
        calculatorGUI.add(buttonComma);

        buttonZero = new JButton("0");
        buttonZero.setBounds(90, 320, 50, 50);
        buttonZero.addActionListener(this);
        buttonZero.setFocusPainted(false);
        calculatorGUI.add(buttonZero);

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(150, 320, 110, 50);
        buttonEquals.addActionListener(this);
        buttonEquals.setFocusPainted(false);
        calculatorGUI.add(buttonEquals);

        buttonCopyResult = new JButton("Copy result");
        buttonCopyResult.setBounds(30, 380, 110, 50);
        buttonCopyResult.addActionListener(this);
        buttonCopyResult.setFocusPainted(false);
        calculatorGUI.add(buttonCopyResult);

        calculatorGUI.setSize(300, 490);
        calculatorGUI.setLayout(null);
        calculatorGUI.setVisible(true);
        calculatorGUI.setResizable(false);
        calculatorGUI.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent eventActionListener) {

        double secondNumber;

        if (eventActionListener.getSource() == buttonOne) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("1"));
        } else if (eventActionListener.getSource() == buttonTwo) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("2"));
        } else if (eventActionListener.getSource() == buttonThree) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("3"));
        } else if (eventActionListener.getSource() == buttonFour) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("4"));
        } else if (eventActionListener.getSource() == buttonFive) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("5"));
        } else if (eventActionListener.getSource() == buttonSix) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("6"));
        } else if (eventActionListener.getSource() == buttonSeven) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("7"));
        } else if (eventActionListener.getSource() == buttonEight) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("8"));
        } else if (eventActionListener.getSource() == buttonNine) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("9"));
        } else if (eventActionListener.getSource() == buttonZero) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("0"));
        } else if (eventActionListener.getSource() == buttonComma) {
            userInputCalculatorField.setText(userInputCalculatorField.getText().concat("."));
        } else if (eventActionListener.getSource() == buttonAdd) {
            resultOfCalculationField.setText(userInputCalculatorField.getText().concat(" +"));
        } else if (eventActionListener.getSource() == buttonSubtract) {
            resultOfCalculationField.setText(userInputCalculatorField.getText().concat(" -"));
        } else if (eventActionListener.getSource() == buttonMultiply) {
            resultOfCalculationField.setText(userInputCalculatorField.getText().concat(" *"));
        } else if (eventActionListener.getSource() == buttonDivide) {
            resultOfCalculationField.setText(userInputCalculatorField.getText().concat(" /"));
        }

        if (eventActionListener.getSource() == buttonAdd) {
            firstNumber = Double.parseDouble(userInputCalculatorField.getText());
            numberOfCalculation = "addNumbers";
            userInputCalculatorField.setText("");
        } else if (eventActionListener.getSource() == buttonSubtract) {
            firstNumber = Double.parseDouble(userInputCalculatorField.getText());
            numberOfCalculation = "subtractNumbers";
            userInputCalculatorField.setText("");
        } else if (eventActionListener.getSource() == buttonMultiply) {
            firstNumber = Double.parseDouble(userInputCalculatorField.getText());
            numberOfCalculation = "multiplyNumbers";
            userInputCalculatorField.setText("");
        } else if (eventActionListener.getSource() == buttonDivide) {
            firstNumber = Double.parseDouble(userInputCalculatorField.getText());
            numberOfCalculation = "divideNumbers";
            userInputCalculatorField.setText("");
        } else if (eventActionListener.getSource() == buttonCorrect) {
            userInputCalculatorField.setText("");
        }

        if (eventActionListener.getSource() == buttonEquals)
        {
            secondNumber = Double.parseDouble(userInputCalculatorField.getText());

            switch (numberOfCalculation)
            {
                case "addNumbers":
                    resultOfCalculation = firstNumber + secondNumber;
                    break;
                case "subtractNumbers":
                    resultOfCalculation = firstNumber - secondNumber;
                    break;
                case "multiplyNumbers":
                    resultOfCalculation = firstNumber * secondNumber;
                    break;
                case "divideNumbers":
                    resultOfCalculation = firstNumber / secondNumber;
                    break;
            }

            resultOfCalculationField.setText("" + decimalFormat.format(resultOfCalculation));
        }

        if (eventActionListener.getSource() == buttonCorrect) {
            userInputCalculatorField.setText("");
        }

        if (eventActionListener.getSource() == buttonClearAll)
        {
            userInputCalculatorField.setText("");
            resultOfCalculationField.setText("");
        }

        if (eventActionListener.getSource() == buttonCopyResult)
        {
            double result = resultOfCalculation;
            userInputCalculatorField.setText("" + result);
        }
    }
}
