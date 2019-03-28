package GUI;


/**
 * 
 * @author Lokuest-Pecons
 * @version 0.1
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public abstract class ModelFrame extends JFrame {
    
    private JMenuBar menuBar;
    
    /**
     * Constructor for objects of class ModelFrame
     */
    public ModelFrame()
    {
        this.setTitle("F.A.T");
        this.setSize(800,600);
        
        //Generar menú.
        generateMenu();
        this.setJMenuBar(menuBar);        
        
        
        
        añadirComponentes();        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        
    }

    //Métodos:
    public abstract void añadirComponentes();
    
    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");        
        JMenu help = new JMenu("Help");

        
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                 dispose();
                 System.exit(0); //calling the method is a must
            }
        });
        JMenuItem about = new JMenuItem("About   ");
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PanelBox.mostrarMensaje("Proyecto de Ingenieria de Software 2 \n Relalizado por :\n\t -Douglas Ramirez\n\t -Henry Peña", "Acerca de:");
            }
        });

        
        file.add(save);
        file.addSeparator();
        file.add(exit);
        
        help.add(about);

        menuBar.add(file);        
        menuBar.add(help);
    }



    
    
}
