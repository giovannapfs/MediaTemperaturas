package exerciciotemperatura;

import javax.swing.JOptionPane;

public class ExercicioTemperatura {
    public static void main(String[] args) {
        double[] temperaturas = new double [7]; 

        double maiorTemperatura = 0;
        double menorTemperatura = 0;
        double somaTemperaturas = 0;

        
        for (int i = 0; i < 7; i++) {
            temperaturas[i] = Double.parseDouble (JOptionPane.showInputDialog("Digite a temperatura do " + (i + 1) + "° dia"));
            somaTemperaturas = somaTemperaturas + temperaturas[i];
        }

        double mediaTemperaturas = somaTemperaturas / 7;
        int diasTempMenor = 0;

        for (int i = 0; i < 7; i++) {

            if (temperaturas[i] > mediaTemperaturas) {
                maiorTemperatura = maiorTemperatura + 1;
            }
            if (temperaturas[i] < mediaTemperaturas) {
                menorTemperatura = menorTemperatura + 1;
            }
            if (temperaturas[i] < mediaTemperaturas) {
                diasTempMenor++;
            }
        }
        Math.round(mediaTemperaturas);
        System.out.println("A quantidade de dias com a temperatura acima da média foi: "+ maiorTemperatura + " dias ");
        System.out.println("A quantidade de dias com a temperatura acima da média foi: "+ menorTemperatura + " dias ");
        System.out.println("A média das temperaturas foi: " + mediaTemperaturas + "°C");
        
    }
}