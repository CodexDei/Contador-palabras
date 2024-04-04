import javax.swing.*;

public class ContarLetra {

    public static String frase;
    public static String letra;
    public static int cantidadLetra;
    public static boolean estadoPrograma =  false;

    public static void main(String[] args) {

        frase = JOptionPane.showInputDialog("Ingrese una frase");
        letra = JOptionPane.showInputDialog("Ingrese la letra que desea buscar en la frase anterior");

        char[] caracteres = frase.toCharArray();
        char letraChar = letra.charAt(0);

        for (char caracter: caracteres){

            if (caracter != letraChar){

                continue;
            }
            cantidadLetra++;

        }
        JOptionPane.showMessageDialog(null,
        "En la frase: " + frase + "\nLa letra '"+ letra + "' esta: " + cantidadLetra + " veces" );

    }
}
