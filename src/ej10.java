
public class ej10 {
	public ej10() {
	}

	public static void main(String[] args) {
		int x=10;int y=20;int z=50; 
		

		if (x>=y) {
			if (x>=z) { 
				System.out.println(x); 
				if (y>=z) { 
					System.out.println(y); 
					System.out.println(z);
				}else {
					System.out.println(z); 
					System.out.println(y);
				}
			}else { 
					System.out.println(z);	
					System.out.println(x);
					System.out.println(y);
			}	

		} else { 
			if (x<z ) { 
				if (y>=z) { 
					System.out.println(y);
					System.out.println(z);
					System.out.println(x); 
				}else { 
					System.out.println(z);
					System.out.println(y);
					System.out.println(x); 
				}
			}else {		
				System.out.println(y); 
				System.out.println(x);
				System.out.println(z);
			}
			
		}

		System.out.println("___________________________________________________");
		
		if ( (x>=y) && (x>=z) ) {	
			if (y>=z) {	
			System.out.println(x); 
			System.out.println(y);
			System.out.println(z);
			}else {
				System.out.println(x); 
				System.out.println(z);
				System.out.println(y);
			}
		}

		if ( (y>x) && (y>=z) ) {	
			if (x>=z) {	
				System.out.println(y); 
				System.out.println(x);
				System.out.println(z);
			}else {
				System.out.println(y); 
				System.out.println(x);
				System.out.println(z);
			}
		}
		
		if ( (z>x) && (z>y) ) {	
			if (x>=y) {	
				System.out.println(z); 
				System.out.println(x);
				System.out.println(y);
			}else {
				System.out.println(z); 
				System.out.println(y);
				System.out.println(x);
			}
		}
		
		
		System.out.println("___________________________________________________________");
		try {
		final int CANT = 5;
		int[] vecInts=new int[CANT];
		
		vecInts[0]=40;
		vecInts[1]=50;
		vecInts[2]=20;
		vecInts[3]=10;
		vecInts[4]=30;

		int i=0;
		int menorTmp=-1; 
		
		
		while (i<vecInts.length -1) {  
			 
			if (vecInts[i]<vecInts[i+1]) { 
				menorTmp=vecInts[i];
				vecInts[i]=vecInts[i+1];
				vecInts[i+1]=menorTmp;
				i=0; 
				continue; 
			}
			
			i++;
		}
		
		mostrarVector(vecInts);
		
		System.out.println("___________________________________________________________");
		
		Integer vecIntegers[]=new Integer[CANT]; 
		vecIntegers[0]=40; 
		vecIntegers[1]=50; 
		vecIntegers[2]=20; 
		vecIntegers[3]=10; 
		vecIntegers[4]=30;
		
		int vecIntsOrdenados[]=new int[CANT];
		int vueltasSiOsi;
		int iPosVecOrd=0;
		
		int indMajTentativo=0;
		
		int indMajReal=-1;
		
		int ii=0;
		boolean fin = false;
		while (!fin) {
		
			while  (indMajTentativo < vecIntegers.length)  {
				if (vecIntegers[indMajTentativo] != null) {
					break;
				}
				indMajTentativo++;
			}
			if (indMajTentativo==vecIntegers.length) { 
				fin=true;
			}else if(indMajTentativo==vecIntegers.length-1) { 
				vecIntsOrdenados[vecIntsOrdenados.length]=vecIntegers[indMajTentativo];
				fin=true;
			}else {	
				
				indMajReal = indMajTentativo;
				for (ii=0;ii<vecIntegers.length;ii++) {
					if ( vecIntegers[ii] != null ) {
						if ( vecIntegers[ii] > vecIntegers[indMajReal] ) {
							indMajReal=ii;
						} 
					}
				}
				vecIntsOrdenados[iPosVecOrd]=vecIntegers[indMajReal];
				vecIntegers[indMajReal]=null;
				iPosVecOrd++;
			}
		}	
		mostrarVector(vecIntsOrdenados);
		System.out.println("___________________________________________________________");
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public static void 	mostrarVector(int[] vecInts) {
		try {
			for (int i = 0; i < vecInts.length; i++) {
				System.out.println(vecInts[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
