package interfaz;

public abstract class Alquiler implements Caracterizable {
	
	private int codigoCliente;
    private String nombreCliente;
    private int diasAlquiler;

    public Alquiler(int codigoCliente, String nombreCliente, int diasAlquiler) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.diasAlquiler = diasAlquiler;
    }
    public int getCodigoCliente() {
        return codigoCliente;
    }
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    public abstract double costoAlquiler();
    
	public String caracterizar() {
		// TODO Auto-generated method stub
		return getCodigoCliente()+" - "+getNombreCliente()+" - "+getDiasAlquiler();
	}

}
