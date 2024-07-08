package interfaz;

public class AlquilerLocalComercial extends Alquiler{
    private int mesesAlquiler;
    private int metraje;

    public AlquilerLocalComercial(int codigoCliente, String nombreCliente, int diasAlquiler, int mesesAlquiler, int metraje){
        super(codigoCliente, nombreCliente, diasAlquiler);
        this.mesesAlquiler = mesesAlquiler;
        this.metraje = metraje;
    }

    public int getMesesAlquiler(){
        return mesesAlquiler;
    }

    public void setMesesAlquiler(int mesesAlquiler){
        this.mesesAlquiler = mesesAlquiler;
    }

    public int getMetraje(){
        return metraje;
    }

    public void setMetraje(int metraje){
        this.metraje = metraje;
    }

    @Override
    public double costoAlquiler(){
        double costoMensual;
        if (metraje == 100){
            costoMensual = 5000;
        } else if (metraje == 150){
            costoMensual = 8000;
        } else if (metraje == 200){
            costoMensual = 12000;
        } else{
            costoMensual = 0;
        }
        return mesesAlquiler * costoMensual;
    }

    @Override
    public String caracterizar(){
        return getCodigoCliente()+" - "+getNombreCliente()+" - "+getDiasAlquiler()+" - "+costoAlquiler();
    }
}
