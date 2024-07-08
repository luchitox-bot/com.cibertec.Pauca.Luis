package arreglo;

import clase.ingeniero;
import java.util.ArrayList;

public class ArregloIngenieros {
    private ArrayList<ingeniero> ingenieros;

    public ArregloIngenieros() {
        this.ingenieros = new ArrayList<>();
    }

    public void agregarIngeniero(ingeniero ingeniero) {
        this.ingenieros.add(ingeniero);
    }
    
    public double tarifaPromedio() {
        double sumaTarifas = 0;
        int contador = 0;
        for (ingeniero ingeniero : ingenieros) {
            if (ingeniero.getEdad() > 40) {
                sumaTarifas += ingeniero.getTarifa();
                contador++;
            }
        }
        return contador > 0 ? sumaTarifas / contador : 0;
    }
    public String nombrePrimerIngenieroMenorQue100() {
        for (ingeniero ingeniero : ingenieros) {
            if (ingeniero.getHorasTrabajadas() < 100) {
                return ingeniero.getNombre();
            }
        }
        return null;
    }
}
