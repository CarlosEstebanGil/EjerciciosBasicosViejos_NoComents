import java.util.Scanner;

public class ej01 {

	public ej01() {
	}

	public static void main(String[] args) {
		Scanner entrada=null; 

		 double a,b,c; 
		 double x1,x2,d; 

		try {
			entrada= new Scanner(System.in);
			
		    System.out.println("Introduzca primer coeficiente (a):");
		    a=entrada.nextDouble();
		    System.out.println("Introduzca segundo coeficiente: (b):");
		    b=entrada.nextDouble();
		    System.out.println("Introduzca tercer coeficiente: (c):");        
		    c=entrada.nextDouble();
		    
		    
		    d=((b*b)-4*a*c);
		    
		    if(d<0) 
		    	System.out.println("No existen soluciones reales");        
		    else{            
		    	  
		    	
		    	x1=(-b+Math.sqrt(d))/(2*a);            
		    	x2=(-b-Math.sqrt(d))/(2*a);           
		    	
		    	System.out.println("Solución: " + x1);            
		    	System.out.println("Solución: " + x2);
		    	 
		    }
		    	 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
