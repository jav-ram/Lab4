
public class Soldado extends Militar {
	
	public int getHoras() {
        return super.getHoras()*2;           // trabaja 80 horas / semana
    }
    
    public double getSalario() {
        return super.getSalario()-10000;      // Q10,000.00 / anio
    }
    
    public int getDiasVacaciones() {
        return super.getDiasVacaciones()/2;           // 2 semanas de vacaciones pagadas
    }

    public void recibeOrden(){
    	System.out.println("Ordene mi General");
    }
}
