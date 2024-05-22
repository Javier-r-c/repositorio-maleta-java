package clases;

//import java.util.Arrays;

public class Maleta <T>{
	protected T[]elementos;
	protected int num;
	protected String nombre;
	
	public Maleta (T[]elementos, int num) {
		this.elementos=elementos;
		this.num=num;
	}

	
	//getters & setters
	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		String info="\n\t- Numero de elementos: "+num;
		for(int i=0; i<num; i++) {
			info+="\n\t"+i+"- "+elementos[i];
		}
		
		return info;
	}
	
	public void addElem(T  elemento) {
		
		elementos[num]= elemento;
		num++;
	}
	
	public void deleteElem(int ele) {
		for(int i=ele; i<elementos.length-1; i++) {  
			//lenght-1 para que no sobrepase el tamaño del array dentro del bucle
			
			elementos[i]=elementos[i+1];
			
		}
		num--;
	}
}
