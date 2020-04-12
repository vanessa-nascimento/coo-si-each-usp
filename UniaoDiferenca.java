/* Atividade de COO - Turma 94 */
/* Vanessa Alves do Nascimento */

import java.util.*;

class ConjuntoSet<T> {
	
    @Override
	public String toString() {
		return "[a=" + a + ", b=" + b + "]";
	}


	private Set<T> a = new HashSet<>();
    private Set<T> b = new HashSet<>();
    
    public void addA(T a){
		this.a.add(a);
	}
    
    public void addB(T b){
  		this.b.add(b);
  	}
    
    public Set<T> getA() {
		return a;
	}

	public Set<T> getB() {
		return b;
	}

	public Set<T> getUniao() {
    	Set<T> union = new HashSet<>(a);
    	union.addAll(b);
    	return union;
	}
      
    public Set<T> getDiferenca(Set<T> a, Set<T> b) {
    	Set<T> diference = new HashSet<>(a);
    	diference.removeAll(b);
		return diference;
	}
    
}

public class UniaoDiferenca {
	
	public static void main(String[] args) {
	
		ConjuntoSet<Integer> conjunto = new ConjuntoSet<Integer>();
		
		for(int i = 1; i < 4; i++){
			conjunto.addA(i *2);
			conjunto.addB(i);
		}
		
		System.out.println("Conjunto: " + conjunto);
		System.out.println("União: " + conjunto.getUniao());
		System.out.println("Diferença: " + conjunto.getDiferenca(conjunto.getA(),conjunto.getB()));
	}
}

