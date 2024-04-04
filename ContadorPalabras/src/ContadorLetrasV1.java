import javax.swing.JOptionPane;

public class ContadorLetrasV1 {

    public static void main(String[] args) {
        // Solicitar una frase al usuario
        String frase = JOptionPane.showInputDialog(null, "Ingrese una frase:");

        // Crear un arreglo para contar las letras por cada caracter
        int[] contadorLetras = new int[256]; // Suponemos que los caracteres son ASCII

        // Contar las letras por cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)) {
                contadorLetras[caracter]++;
            }
        }

        // Mostrar el resultado utilizando JOptionPane
        StringBuilder resultado = new StringBuilder();
        resultado.append("Número de letras por cada caracter en la frase:\n");
        for (char c = 'A'; c <= 'z'; c++) {
            if (Character.isLetter(c) && contadorLetras[c] > 0) {
                resultado.append(c).append(": ").append(contadorLetras[c]).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
