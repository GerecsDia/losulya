package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
    InputPanel perimeterPanel;                               //ez lesz a ló kerülete
    InputPanel longPanel; 
    JButton calcButton;                                   //ez a ló hossza lesz
    InputPanel weightPanel;                                  
    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();
    }

    private void initComponent() {
        this.perimeterPanel = new InputPanel("Kerület");
        this.longPanel = new InputPanel("Hossz");
        this.calcButton = new JButton("Számít");
        this.weightPanel = new InputPanel("Súly");

    }

    private void addComponent() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.add(this.perimeterPanel);
        this.add(this.longPanel);
        this.add(this.calcButton);
        this.add(this.weightPanel);

    }

    private void setFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //jobb felső sarokra kattintásra zárjon be a program
        // this.setSize(400, 300);                     //beálltjuk, hogy mekkora legyen az ablak
        this.pack();
        this.setLocationRelativeTo(null);             //ettől középre dobja ki az ablakomat
        this.setVisible(true);                                //láthatóvá tesszük

    }

    public InputPanel getPerimeterPanel() {
        return perimeterPanel;
    }

    public InputPanel getLongPanel() {
        return longPanel;
    }

    public JButton getCalcButton() {
        return calcButton;
    }

    public InputPanel getWeightPanel() {
        return weightPanel;
    }
    
    

}
