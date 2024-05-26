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
        button.setBounds(210,210,120,30); //Setting Button axis and size
        Label label = new Label("HELLO WOLRD!");
        label.setBounds(210,180,120,30);
        TextArea textarea = new TextArea("");
        textarea.setBounds(200,240,120,50);

        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button Clicked Successfully");
            label.setBounds(200,180,200,50);
        }
        });

        
        frame.add(textarea);
        frame.add(label);
        frame.add(button);                                                 
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
