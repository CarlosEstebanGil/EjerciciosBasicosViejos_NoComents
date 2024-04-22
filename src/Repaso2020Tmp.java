import java.math.BigDecimal;
import java.util.Scanner;

public class Repaso2020Tmp {

	public Repaso2020Tmp() {
	}
	
	public static void main(String[] args) {
		 
		try {

			final String APELLIDO="GIL";
			
			Character c1=new Character('c');
			Character c2=new Character('a');
			Character c3=new Character('r');
			String str1="litos";
			String strMyName=new String(Character.toString(c1)+Character.toString(c2)+Character.toString(c3) + 
					str1);

			StringBuffer sb1=new StringBuffer();
			sb1.append(strMyName).append(" Esteban ").append(APELLIDO);
			
			System.out.println(sb1.toString());
			
			System.out.println(APELLIDO.charAt(0));
			
			char[] cArrMyName = new char[] {'c','a','r','l','i','t','o','s'};
			
			for (int i = 0; i < cArrMyName.length; i++) {
				System.out.println(cArrMyName[i]);
			}
			
			for(char c: cArrMyName) {
				System.out.println(Character.toString(c));
			}
			
			System.out.println("/n");
			char[] cArrTmp= new char[8];
			cArrTmp[0]='c';
			cArrTmp[1]='a';
			cArrTmp[2]='r';
			for ( char cTmp : cArrTmp) {
				System.out.println(Character.toString(cTmp));
			}
			
			
			char[] cTmp2= new char[1];
			
			Character characterArr[] = new Character[3];
			characterArr[0]='C';
			characterArr[1]='A';
			characterArr[2]='R';
			for (int x=0;x<characterArr.length;x++) { 
				System.out.println(characterArr[x].toString()); 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static double parteDecOf(double d) {
		double r=0;
		try {
			BigDecimal bd=new BigDecimal(d);
			int iValue= bd.intValue();
			double decPart = bd.subtract(new BigDecimal(iValue)).doubleValue();
			r=decPart;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return r;
		
	}
}
