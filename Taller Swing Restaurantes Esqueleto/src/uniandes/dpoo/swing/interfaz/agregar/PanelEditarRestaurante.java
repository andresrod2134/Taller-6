package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
    	
    	JLabel lbNombre = new JLabel("Nombre: ");
    	JLabel lbCalificacion = new JLabel("Calificacion: ");
    	JLabel lbVisitado = new JLabel("Visitado: ");
    	txtNombre = new JTextField(30);
    	
    	String[] opciones = {"1","2","3","4","5"};
    	cbbCalificacion = new JComboBox(opciones);
    	
    	String[] siOno = {"si", "no"};
    	cbbVisitado = new JComboBox(siOno);
    	
    	this.setLayout(new GridLayout(3,2));
    	add(lbNombre);
    	add(txtNombre);
    	add(lbCalificacion);
    	add(cbbCalificacion);
    	add(lbVisitado);
    	add(cbbVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {

    	String opcion = (String) cbbVisitado.getSelectedItem();
    	if (opcion.equals("si")) {
    		return true;
    	}else {
    			return false;
    		}
    	}
    

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText();
       
    }
}
