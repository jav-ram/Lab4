
public class Alarma3 extends Timbre3 {
	public void m1() {
		System.out.println("alarma 1");
	}
	 
	public void m2() {
		super.m1();
	}
	 
	public String toString() {
		return super.toString() + "â€¦" + super.toString();
	}
}
