
public class DriverMilitar {
	public static void main(String[] args) {
		Soldado soldado = new Soldado();
		Teniente teniente = new Teniente();
		Coronel coronel = new Coronel();
		General general = new General();
		
		
		//* Soldado
		System.out.println("Soldado");
		System.out.println("-------");
		System.out.println("Trabaja "+ soldado.getHoras() + " a la semana");
		System.out.println("Gana " + soldado.getSalario() + " al año");
		System.out.println("Tiene " + soldado.getDiasVacaciones() + "dias de vacaciones al anio");
		System.out.println("El formulario es: " + soldado.getFormularioVacaciones());
		
		//* Teniente
		System.out.println("Teniente");
		System.out.println("-------");
		System.out.println("Trabaja "+ teniente.getHoras() + " a la semana");
		System.out.println("Gana " + teniente.getSalario() + " al año");
		System.out.println("Tiene " + teniente.getDiasVacaciones() + "dias de vacaciones al anio");
		System.out.println("El formulario es: " + teniente.getFormularioVacaciones());
		
		//* Coronel
		System.out.println("Coronel");
		System.out.println("-------");
		System.out.println("Trabaja "+ coronel.getHoras() + " a la semana");
		System.out.println("Gana " + coronel.getSalario() + " al año");
		System.out.println("Tiene " + coronel.getDiasVacaciones() + "dias de vacaciones al anio");
		System.out.println("El formulario es: " + coronel.getFormularioVacaciones());
		
		//* General
		System.out.println("General");
		System.out.println("-------");
		System.out.println("Trabaja "+ general.getHoras() + " a la semana");
		System.out.println("Gana " + general.getSalario() + " al año");
		System.out.println("Tiene " + general.getDiasVacaciones() + "dias de vacaciones al anio");
		System.out.println("El formulario es: " + general.getFormularioVacaciones());

	}
}
