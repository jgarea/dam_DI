
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author jgntr
 */
class TextoMayusculas extends JFrame {

    Font letra;

    JLabel JLtexto;

    JCheckBox JChBmayuscula;

    JTextField JTFtexto;

    Container conpane;

    GridBagConstraints restricciones;

    Boolean pulsada = false;

    //Constructor
    public TextoMayusculas() {

        conpane = getContentPane();

        conpane.setLayout(new GridBagLayout());

        restricciones = new GridBagConstraints();

        //Creamos un objeto de tipo Font. Esta clase la veremos a lo largo del módulo
        letra = new Font("SansSerif", Font.BOLD, 18);

        restricciones.fill = GridBagConstraints.HORIZONTAL;

        restricciones.insets = new Insets(10, 10, 10, 10);

        restricciones.weightx = 1.0;

        restricciones.weighty = 1.0;

        JLtexto = new JLabel("Introduce un texto cualquiera");

        JLtexto.setHorizontalAlignment(JLabel.CENTER);

        JLtexto.setFont(letra);

        annadeGrid(JLtexto, 0, 0);

        JTFtexto = new JTextField(40);

        JTFtexto.setText("hola que tal");

        restricciones.fill = GridBagConstraints.HORIZONTAL;

        restricciones.insets = new Insets(10, 10, 10, 10);

        restricciones.weightx = 1.0;

        restricciones.weighty = 1.0;

        annadeGrid(JTFtexto, 0, 1);

        JChBmayuscula = new JCheckBox("Convertir el texto a mayusculas");

        JChBmayuscula.setFont(letra);

        try {

            JChBmayuscula.setDisplayedMnemonicIndex(0);

        } catch (IllegalArgumentException e) {

            System.err.print(e.getMessage());

        }

        restricciones.fill = GridBagConstraints.HORIZONTAL;

        restricciones.insets = new Insets(10, 10, 10, 10);

        restricciones.weightx = 1.0;

        restricciones.weighty = 1.0;

        annadeGrid(JChBmayuscula, 0, 2);

    }
    // MÉtodo privado que crea las restricciones de cada componente y añade el componente. 

    private void annadeGrid(Component c, int x, int y) {

        restricciones.gridx = x;

        restricciones.gridy = y;

        add(c, restricciones);

    }
}
