package Vista;

import javax.swing.JOptionPane;

public class InOut {
//Este metodo captura datos de tipo entero

    public int solicitarEntero(String m) {
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }

    public String solicitarNombre(String m) {
        return JOptionPane.showInputDialog(m);
    }

    //Este metodo captura datos de tipo float
    public float solicitardecimal(String m) {
        return Float.parseFloat(JOptionPane.showInputDialog(m));
    }
    //Este metodo muestra un resultado en pantalla

    public void mostrarResultado(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

}
