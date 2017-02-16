package TypesOfFiles.ResourcesOfAdvancedPage.ThisCode;

import TypesOfFiles.AdvancedPage;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ThisWindows implements ChangeListener {

    JFrame ventana;
    JButton boton, boton2;
    JLabel label;
    JRadioButton radio, radio2;
    JCheckBox box;
    ButtonGroup grupo;

    public void crearboton() {
        boton = new JButton("hola");
        boton.setBackground(Color.red);
        //boton.setLayout(new BoxLayout(boton, BoxLayout.X_AXIS));
        boton.setBounds(200, 30, 100, 20);

        boton2 = new JButton("Master Madi");
        boton2.setBackground(Color.orange);
        //boton2.setLayout(new BoxLayout(boton2, BoxLayout.X_AXIS));
    }

    public void crearlabel() {
        label = new JLabel();
        label.setText("hola2");
        //label.setLayout(new BoxLayout(label, BoxLayout.X_AXIS));
    }

    public void crearradiobuton() {
        radio = new JRadioButton();
        //radio.setLayout(new BoxLayout(radio, BoxLayout.X_AXIS));
        radio.addChangeListener(this);

        radio2 = new JRadioButton("ole");
        //radio2.setLayout(new BoxLayout(radio2, BoxLayout.X_AXIS));

        grupo = new ButtonGroup();
        grupo.add(radio);
        grupo.add(radio2);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio.isSelected()) {
            System.out.println("hola");
        }
        if (radio2.isSelected()) {
            System.out.println("MASTER MADI");
        }
    }

    public void crearcheckbox() {
        box = new JCheckBox();
        box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));
    }

    public void crearventana() {
        ventana = new JFrame();
        ventana.setTitle("MASTER MADI");
        ventana.setSize(400, 300);
        //ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.setLayout(null);
        ventana.add(boton);
        ventana.add(boton2);
        ventana.add(label);
        ventana.add(radio);
        ventana.add(radio2);
        ventana.add(box);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        //complements
        try {
            ventana.setIconImage(new ImageIcon(getClass().getResource("/Complements/icon.jpg")).getImage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventana, "icon file not found");
        }

    }

    public ThisWindows() {
        crearboton();
        crearcheckbox();
        crearlabel();
        crearradiobuton();
        crearventana();
    }

    public static void main(String[] arg) {
        ThisWindows ventana = new ThisWindows();
    }

}
