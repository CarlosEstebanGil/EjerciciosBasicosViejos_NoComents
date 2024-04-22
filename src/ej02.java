import java.util.Scanner;


public class ej02 {
	public ej02() {
	}

	public static void main(String[] args) {
		double a;
		Scanner entrada=null;
		double circleRadio=-1;
		
		try {
			entrada = new Scanner(System.in);
			System.out.println("Ingrese Area de su circulo: ");
			a= entrada.nextDouble();
			
			circleRadio = Math.sqrt(a /  Math.PI) ;

			System.out.println("Radio de circulo de Area: " + a + "es: " + circleRadio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
