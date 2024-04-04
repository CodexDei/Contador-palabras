import javax.swing.*;

public class ContarPalabras {

    public static String frase;
    public static String palabraBuscar;
    public static int cantidadPalabra;
    public static boolean estadoPrograma =  false;

    public static void main(String[] args) {

        frase = JOptionPane.showInputDialog("Ingrese una frase");
        palabraBuscar = JOptionPane.showInputDialog("Ingrese la palabra que desea buscar en la frase anterior");

        String[] palabras = frase.split(" ");

        for (int i = 0; i < palabras.length; i++){

            if (palabras[i].contains(palabraBuscar)){

                cantidadPalabra++;
            }

        }
        JOptionPane.showMessageDialog(null,
        "En la frase: " + frase + "\nLa palabra '"+ palabraBuscar + "' esta: " + cantidadPalabra + " veces" );

    }
}


