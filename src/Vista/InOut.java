package Vista;

import javax.swing.JOptionPane;

public class InOut {
//Este metodo captura datos de tipo entero

    public int solicitarEntero(String m) {
        int numero = 0;
        String entrada;
        do {
            entrada = pedirString(m);
            if (entrada == null) {
                break;
            }
            try {
                numero = Integer.parseInt(entrada);

                if (numero <= 0) {
                    mostrarResultado("El numero no puede ser menor o igual a 0");
                }
            } catch (NumberFormatException e) {
                mostrarResultado("Dato invalido");
                numero = 0;
            }
        } while (numero == 0 || numero <= 0);
        return numero;

    }

    public  String solicitarNombre(String m) {
        String nombre;
        do {
            nombre = JOptionPane.showInputDialog(m);
            if (nombre == null) {
                break;
            }
            if (!validarCadenaSinNumeros(nombre)) {
                mostrarResultado("El nombre no puede contener números.");
            }
        } while (!validarCadenaSinNumeros(nombre));
        return nombre;
    }

    public  boolean validarCadenaSinNumeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                return false; // La cadena contiene al menos un número
            }
        }
        return true; // La cadena no contiene números
    }

    //Este metodo captura datos de tipo float
    public float solicitardecimal(String m) {
        return Float.parseFloat(JOptionPane.showInputDialog(m));
    }
    //Este metodo muestra un resultado en pantalla

    public void mostrarResultado(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

    public String pedirString(String m) {

        return JOptionPane.showInputDialog(null, m);
    }
}
