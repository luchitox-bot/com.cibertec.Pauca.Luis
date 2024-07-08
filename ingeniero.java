package clase;

public class ingeniero {
	    private String nombre;
	    private int edad;
	    private double tarifa;
	    private int horasTrabajadas;

	    public ingeniero(String nombre, int edad, double tarifa, int horasTrabajadas) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.tarifa = tarifa;
	        this.horasTrabajadas = horasTrabajadas;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public double getTarifa() {
	        return tarifa;
	    }

	    public int getHorasTrabajadas() {
	        return horasTrabajadas;
	    }
}
