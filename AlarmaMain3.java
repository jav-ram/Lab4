
public class AlarmaMain3 {
	public static void main(String[] args) {
		AlarmaEmergencia alarmaIncendio = new AlarmaEmergencia();
		alarmaIncendio.m1();                  // emergencia 1
		alarmaIncendio.m2();                  // alarma 1 / timbre 1
		System.out.println(alarmaIncendio);   // emergencia Ringâ€¦Ringâ€¦Ringâ€¦Ring
	}
}
