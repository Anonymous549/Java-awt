//AWT TUTORIAL
import java.awt.*;
import java.awt.event.*;
public class AwtGui {
    public static void main(String[]args){
        Frame frame = new Frame();
        frame.setSize(420,420);
        frame.setTitle("HELLO WORLD!");
        // Setting the exit behavior
        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowOpened(WindowEvent e) {
        // Your code when the window is opened
        }
        @Override
        public void windowClosing(WindowEvent e) {
                                            
        // Define actions to perform when the window is closing
                                                            
        System.exit(0); // Exiting the application
        }

        @Override
        public void windowClosed(WindowEvent e) {
        // Your code when the window is closed
        }

        @Override
        public void windowIconified(WindowEvent e) {
        // Your code when the window is minimized
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        // Your code when the window is restored from minimized
        }

        @Override
        public void windowActivated(WindowEvent e) {
        // Your code when the window is activated
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        // Your code when the window is deactivated
        }
        //You can override any or all of the WindowListener methods inside the WindowAdapter to handle various window events as needed.
        });
                                                                                        
        // Other frame setup code to
        Button button = new Button("HELLO WOLRD!"); //Created Button object for button
        button.setBounds(190, 220, 120, 30); //Setting Button axis and size
        Label label = new Label("HELLO WOLRD!");
        label.setBounds(190, 180, 150, 30);
        TextArea textarea = new TextArea("");
        textarea.setBounds(170, 250, 160, 40);

        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button Clicked Successfully");
        }
        });
        
        Checkbox checkbox = new Checkbox("Java");
        Checkbox checkbox1 = new Checkbox("Python");
        checkbox.setBounds(40, 180, 120, 20);
        checkbox1.setBounds(40, 200, 120, 20);
        
        /*
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("YOU SELECTED JAVA");
                checkbox.setState(false);
            }
        });
        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("YOU SELECTED PYTHON");
                checkbox1.setState(false);
            }
        });
        */ //Commented because of new code implementation
        
        checkbox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
        if (checkbox.getState()) {
            checkbox1.setState(false);
            label.setText("YOU SELECTED JAVA");
        } else {
            if (!checkbox1.getState()) {
                label.setText(""); // Clear label if both checkboxes are deselected
            }
        }
    }
});

       checkbox1.addItemListener(new ItemListener() {
       @Override
       public void itemStateChanged(ItemEvent e) {
        if (checkbox1.getState()) {
            checkbox.setState(false);
            label.setText("YOU SELECTED PYTHON");
        } else {
            if (!checkbox.getState()) {
                label.setText(""); // Clear label if both checkboxes are deselected
            }
        }
    }
});


        

        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(textarea);
        frame.add(label);
        frame.add(button);                                                 
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
