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
        public void windowClosing(WindowEvent e) {
                                            
        // Define actions to perform when the window is closing
                                                            
        System.exit(0); // Exiting the application
        }
        });
                                                                                        
        // Other frame setup code to
        Button button = new Button("HELLO WOLRD!"); //Created Button object for button
        button.setBounds(210,210,120,30); //Setting Button axis and size
        Label label = new Label("HELLO WOLRD!");
        label.setBounds(210,180,120,30);
        
        
        frame.add(label);
        frame.add(button);                                                 
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
