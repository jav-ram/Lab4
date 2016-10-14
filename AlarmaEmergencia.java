
public class AlarmaEmergencia extends Alarma3{
	public void m1(){
		System.out.println("emergencia 1");
	}
	public void m2(){
		super.m1();
		System.out.println("/");
		super.m2();
	}
}
