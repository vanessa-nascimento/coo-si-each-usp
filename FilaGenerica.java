/*
Considerando um classe genérica, usando uma Colletion Java para armazenar os elementos que implementa uma estrutura de dados do tipo fila e oferece os seguintes métodos: adiciona (fim da fila), remove (inicio da fila) e tamanho. 
*/
import java.util.*;

class ListaArray<T> {
	
	private List<T> frutas = new ArrayList<T>();

	
	public void adiciona(T fruta){
		this.frutas.add(fruta);
	}
	
	public T remove(){
		return this.frutas.remove(0);
	}
	
	public int tamanho(){
		return this.frutas.size();
	}
	
	public List<T> getLista() {
		return this.frutas;
	}
}

public class FilaGenerica {

	public static void main(String[] args) {
		
		ListaArray<String> frutas = new ListaArray<String>();
		
		frutas.adiciona("Morango");
		frutas.adiciona("Laranja");
		frutas.adiciona("Abacaxi");
		
		System.out.println("Lista: " + frutas.getLista());
		
		System.out.println("Item removido: " + frutas.remove()); //observe que o primeiro item que foi retirado
		
		System.out.println("Nova lista: " + frutas.getLista());
		
		frutas.adiciona(new String("Banana"));
		
		System.out.println("Novo item: " + frutas.getLista()); //observe que novo item foi colocado na ultima posicao
		
		System.out.println("Elementos na lista: " + frutas.tamanho());
		
		
	}
}

