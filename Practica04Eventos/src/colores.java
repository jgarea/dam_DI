import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;



public class colores extends interfaz_colores implements AdjustmentListener,ActionListener{
				
		colores(){
			super();
			sb_r.addAdjustmentListener(this);
            sb_g.addAdjustmentListener(this);
            sb_b.addAdjustmentListener(this);
            for (int i=0; i<13; i++) {
            	//Poner el boton a la escucha
               
            	lb[i].addActionListener(this);
               	
            }
		}
				

		public void adjustmentValueChanged(AdjustmentEvent e) {
			/*Para crear un objeto de la clase Color, 
			se pasan tres números a su constructor que indican la cantidad de rojo, verde y azul.
			Color colorRosa=new Color(255, 175, 175);*/
			
			if (e.getSource() instanceof JScrollBar) {
				int r=255-sb_r.getValue();
				int g=255-sb_g.getValue();
				int b=255-sb_b.getValue();
				tf_r.setText(Integer.toString(r));
				tf_g.setText(Integer.toString(g));
				tf_b.setText(Integer.toString(b));
				c.setBackground(new Color(r,g,b));
				
			}
		}

		

	    public static void main(String[] args) {
	        // TODO code application logic here
	        colores micolor = new colores();
	       
	        micolor.setTitle("Colores");
	        micolor.setSize(new Dimension(700, 620));
	        micolor.setMinimumSize(new Dimension(320, 200));
	        micolor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        micolor.setVisible(true);
	    }

	    
	    //Metodo que convierte un color de tipo String en un objeto de tipo Color
	    public Color devolverColor(String colortexto) {
			
			for (int j=0;j<listaColores.length;j++)
				if (colortexto.equals(textoColor[j]))
					return listaColores[j];
			return Color.BLACK;
		}
	    
	    //Metodo que implementa la funcionalidad de los botones de color
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			Color color;
			color=devolverColor(arg0.getActionCommand());
			
			sb_r.setValue(255-color.getRed());
			sb_g.setValue(255-color.getGreen());
			sb_b.setValue(255-color.getBlue());
			tf_r.setText(Integer.toString(color.getRed()));
			tf_g.setText(Integer.toString(color.getGreen()));
			tf_b.setText(Integer.toString(color.getBlue()));
			
			c.setBackground(color);
			
		}

	}