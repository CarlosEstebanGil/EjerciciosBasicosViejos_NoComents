import java.math.BigDecimal;

public class ej06 {
	public ej06() {
	}


	public static void main(String[] args) {
		double k=10;
		double z=2;
 		
		float decimal_part=-1;
				

		boolean r=false;

		double doubleNumber=k/z;
		BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
		
		decimal_part= bigDecimal.subtract(new BigDecimal(bigDecimal.intValue())).floatValue();

		if (decimal_part==0) 
			r=true;
		
	
		if (r) 
		System.out.println(k + " y " + z + " son multiplo uno del otro ");
		else 
		System.out.println(k + " y " + z + " NO SON MULTIPLOS EL UNO DEL OTRO");		
		
		

		int n1=new Double(k).intValue();
		int n2=new Double(z).intValue();
		
		if(n1%n2==0)            System.out.println("Son múltiplos");        
		else            System.out.println("No son múltiplos");

	}
}
