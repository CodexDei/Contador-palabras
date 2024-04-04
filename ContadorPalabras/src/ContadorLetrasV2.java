import javax.swing.*;

public class ContadorLetrasV2 {

    public static void main(String[] args) {
        // Solicitar la frase al usuario
        String frase = JOptionPane.showInputDialog(null,
        "Ingrese una frase:", "Contar letras", JOptionPane.QUESTION_MESSAGE);

        // Convertir la frase a minúsculas
        frase = frase.toLowerCase();

        // Contar las letras de la frase
        int[] letras = new int[26];
        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                letras[letra - 'a']++;
            }
        }

        // Mostrar las letras que están en la frase
        String resultado = "";
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] > 0) {
                char letra = (char) (i + 'a');
                resultado += letra + ": " + letras[i] + "\n";
            }
        }

        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null,
            "En la frase '" + frase + "' hay el siguiente numero de letras:\n"+ resultado, "Contar letras", JOptionPane.INFORMATION_MESSAGE);
    }
}
