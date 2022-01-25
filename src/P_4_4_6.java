import java.util.*;
public class P_4_4_6 {
	public static  Scanner dato= new Scanner(System.in);
	public final static  String [] MONEDA= {"Dolar","Libra esterlina","Yen","Dirham","Euros"};
	public final static  Double [] CAMBIO=	{0.82,1.072,0.0075,0.084,1.00};
	
	public static void main(String[]args) {
		String Tipo,cambia;
		Double dinero,son;
		System.out.println("qué tipo modeda lleva para cambia");
		System.out.println(Arrays.toString(MONEDA));
		do {
		Tipo=dato.nextLine();
		if(correta(Tipo)==false) System.out.println(" introduce otro vez 1");
		}while(correta(Tipo)==false);
		
		System.out.println("cuantos dinero para cambio");
		do {
			dinero=dato.nextDouble();
			if(dinero<0) {
				System.out.println("erro introduce otro vez!!!");
			}
		}while(dinero<0);
		
		System.out.println("qué tipo modeda quiere cambia");
		dato.nextLine();
		
		do {
		cambia=dato.nextLine();
		
		if(correta(cambia)==false) System.out.println(" introduce otro vez 2");
		if(Tipo.toLowerCase().equals(cambia.toLowerCase()))System.out.println(" introduce otro vez los dos dinero es iguales");
		
		}while(correta(cambia)==false || (Tipo.toLowerCase().equals(cambia.toLowerCase())));
		
		son=Cambiamoneda(Tipo,cambia,dinero);
		
		System.out.printf("el dinero %9s : %2f cambia %9s : %2f",Tipo,dinero,cambia,son);
	}
	
	public static double Cambiamoneda (String Tipo,String cambia, Double dinero ){
		
		Double cambio1=0.0,cambio2=0.0,son,utl;
		for(int i=0; i<MONEDA.length;i++) {
			if(Tipo.toLowerCase().equals(MONEDA[i].toLowerCase())){			
				cambio1=CAMBIO[i];				
			}
		}
		son=cambio1*dinero;
		for(int i=0; i<MONEDA.length;i++){
			if(cambia.toLowerCase().equals(MONEDA[i].toLowerCase())){
				cambio2=CAMBIO[i];
			}
		}
		utl=son/cambio2;
		return utl;
	}
	public static boolean correta (String lol) {
		for(int i=0;i<MONEDA.length;i++) {
			if(lol.toLowerCase().equals(MONEDA[i].toLowerCase())){			
				return true;				
			}
		}
		
		return false;
	}
}

