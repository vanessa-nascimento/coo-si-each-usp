import java.util.*;

class Lista<T> {
	private ArrayList<T> lista = new ArrayList<T>(); 

	public Lista(){
	}
	
	public void adiciona(T lista){
		this.lista.add(lista);
	}
	
	public ArrayList<T> imprime(){
		Iterator<T> no = lista.iterator();
		System.out.println("Imprime números na ordem:");
		while(no.hasNext()){
			System.out.println(no.next());
		} 
		return lista;
	}
}

public class TesteLista {

	public static void main(String [] args){
		Lista<Integer> lista = new Lista<Integer>();
		
		lista.adiciona(10);
		lista.adiciona(20);
		lista.adiciona(30);
		lista.adiciona(40);
		lista.adiciona(50);
		
		lista.imprime();
	}
}
