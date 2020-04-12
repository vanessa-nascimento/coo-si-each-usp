/*
Escreva o código de uma classe qualquer que ilustre a implementação do
padrão de projeto Singleton
*/

class SingletonEx {

	private static SingletonEx connection = null;

	private String bd, username, password;

	private SingletonEx(String bd, String username, String password){
		this.bd = bd;
		this.username = username;
		this.password = password;
	}

	public String getBd(){
		return this.bd;
	}
	
	public String getUser(){
		return this.username;
	}

	public String getPass(){
		return this.password;
	}

	public static SingletonEx getConnection(String bd, String username, String password){

		if(connection == null){
				 connection = new SingletonEx(bd, username, password);
		}

		return connection;
	}
}


public class Singleton {
	
	public static void main(String [] args){
		SingletonEx user1 = SingletonEx.getConnection("BancoCOO","vanessa", "COO2019");
		SingletonEx userTentative = SingletonEx.getConnection("bancoIncorreto","root", "root");

		System.out.println(user1.getBd() + ", " + user1.getUser() + ", " + user1.getPass());
		System.out.println(userTentative.getBd() + ", " + userTentative.getUser() + ", " + userTentative.getPass());
		System.out.println("Usuários apontam para o mesmo banco(objeto)? " + (user1 == userTentative));
	}
}
