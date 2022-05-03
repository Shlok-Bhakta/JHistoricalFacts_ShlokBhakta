import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistFrame extends JFrame implements ActionListener {
    int factnum = 0;
    FlowLayout layout = new FlowLayout();
    String[] factArray = {"1976 marked the end of 1975", "Hitler was rejected from art school", "Japan bombed Pearl Harbor", "100 Imposters claimed to be Marie Antoinette's dead son", "The Titanic was sunk by an iceburg"};
    JLabel facts = new JLabel(factArray[0]);
    JButton button = new JButton("Next Fact");

    public JHistFrame() {
        super();

        /* frame stuff */ {
            this.setTitle("History Facts 😀");
            this.setLayout(layout);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setSize(500, 300);
            this.setResizable(false);
            this.add(facts);
            this.add(button);

        }
         /* button stuff */{
            button.addActionListener(this);

         }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(factnum < factArray.length-1){
            factnum++;
            facts.setText(factArray[factnum]);
        }
        
    }

}
