package AccessWindow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class OptionalCodeWindow implements ActionListener{
    JFrame ventana;
    JButton boton;
    
    public void crearboton(){
        boton=new JButton("Entrar");
        boton.setLayout(new BoxLayout(boton, BoxLayout.X_AXIS));
        boton.setBackground(Color.red);
    }
    public void crearventana(){
        ventana=new JFrame("MASTER MADI");
        ventana.setSize(400, 400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(boton);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public OptionalCodeWindow(){
        crearboton();
        crearventana();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if(boton.)
    }
    
    public static void main(String[] arg){
        OptionalCodeWindow ventana=new OptionalCodeWindow();
    }
}
