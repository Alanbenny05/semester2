import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeAWT extends Frame implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;

    MaxOfThreeAWT() {
        setLayout(new FlowLayout());

        l1 = new Label("Enter first number:");
        t1 = new TextField(10);

        l2 = new Label("Enter second number:");
        t2 = new TextField(10);

        l3 = new Label("Enter third number:");
        t3 = new TextField(10);

        b = new Button("Find Maximum");

        result = new Label("Result will be shown here");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b);
        add(result);

        b.addActionListener(this);

        setSize(300, 200);
        setTitle("Maximum of Three Numbers");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = Integer.parseInt(t3.getText());

            int max = n1;

            if (n2 > max) max = n2;
            if (n3 > max) max = n3;

            result.setText("Maximum = " + max);

        } catch (Exception ex) {
            result.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new MaxOfThreeAWT();
    }
}