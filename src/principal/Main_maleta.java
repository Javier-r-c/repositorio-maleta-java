package principal;

import java.util.Scanner;

import clases.Maleta;


public class Main_maleta {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String[]elementos = new String[100];
		
		System.out.println("--MALETA DE VIAJES--");
		
		System.out.println("Cuantos elementos quieres meter en la maleta");
		int num=sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(i+"- ¿Que elemento desea guardar?");
			String ele=sc.next();
			elementos[i]=ele;
		}
		
		Maleta <String> maleta = new Maleta <>(elementos,num);
		
		int n=0;
		do {
			//menu de operaciones
			System.out.println("\n- Maleta de viaje");
			System.out.println("\t1. Ver mi maleta");
			System.out.println("\t2. Añadir un nuevo elemento a mi maleta");
			System.out.println("\t3. Borrar un elemento de mi maleta");
			System.out.println("\t4. Salir");
			System.out.print("- Elija una opcion: ");
			n=sc.nextInt();
			
			if(n==1) {
				System.out.println(maleta.toString());
			}else if(n==2) {
				System.out.print("- Introduzca el elemento que desea guardar: ");
				String nEle=sc.next(); 
				
				//añado elemento
				maleta.addElem(nEle);
				
			}else if(n==3) {
				System.out.println(maleta.toString());
				
				System.out.println("- Introduzca el numero del elemento que desea eliminar: ");
				int nEle=sc.nextInt();
				
				//elimino elemento
				maleta.deleteElem(nEle);
				
			}
			
		}while(n!=4);

		sc.close();

	}

}
