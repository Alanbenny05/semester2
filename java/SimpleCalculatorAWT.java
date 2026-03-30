import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorAWT extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    SimpleCalculatorAWT() {

        setLayout(new FlowLayout());

        add(new Label("Enter First Number:"));
        t1 = new TextField(10);
        add(t1);

        add(new Label("Enter Second Number:"));
        t2 = new TextField(10);
        add(t2);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new Label("Result:"));
        result = new TextField(15);
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300, 200);
        setTitle("Simple Calculator");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = num1 + num2;
            } else if (e.getSource() == sub) {
                res = num1 - num2;
            } else if (e.getSource() == mul) {
                res = num1 * num2;
            } else if (e.getSource() == div) {
                if (num2 == 0) {
                    result.setText("Cannot divide by zero");
                    return;
                }
                res = num1 / num2;
            }

            result.setText(String.valueOf(res));

        } catch (Exception ex) {
            result.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculatorAWT();
    }
}