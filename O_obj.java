// ORIENTAÇÃO A OBJETOS

// MÉTODO == FUNÇÃO && CLASSE == OBJETO

// PARTE 1

// PLAYER.java

/*
package orientacao_a_objetos;

public class Player {
	public void iniciarJogador(){
		System.out.println("Jogador Iniciado");
	}

}
*/

//INIMIGO.java

/*
package orientacao_a_objetos;

public class inimigo {
	public void iniciarInimigo(){
		System.out.println("Inimigo Iniciado");
	}

}
*/

//AGORA POSSO CHAMAR O ARQUIVO PLAYER E O ARQUIVO INIMIGO NA MINHA CLASSE MAIN.

/*
package orientacao_a_objetos;

public class Main {
	
	public static void main (String args[]){
		
		Player player = new Player();
		player.iniciarJogador();
		
		inimigo inimigo = new inimigo();
		inimigo.iniciarInimigo();
		
		Player player2 = new Player();
		player2.iniciarJogador();
	}

}
*/

//AULA 2 

// CRIANDO UMA CLASSE DENTRO DE UMA CLASSE
// INNER CLASS
// ESSA CLASSE SÓ PODE SER ACESSADA DENTRO DO MAIN, POIS É PRIVADA.

/*
package orientacao_a_objetos;

public class Main {
	
	public static void main (String args[]){
		
	 new Main().instanceMain2();
	}
	
	public void instanceMain2() {
		new Main2().ola();
	}
	
	private class Main2{
		public void ola() {
			System.out.println("Olá");
		}
	}
	
	
}
*/

// ABSTRACT
// AO CRIAR UMA CLASS ABSTRACT, NADA QUE EU ESCREVER NELA TERÁ VALOR E EU NÃO CONSEGUIREI CHAMAR ELA NO MAIN
// PARA USAR ELA NO MAIN DEVO USAR A TAG "EXTENDS - nome da classe"

// ABSTRACT_CLASS.java

/*
package orientacao_a_objetos;

public class Abstract_class {
	public void iniciarJogo() {
		System.out.println("iniciar Jogo");
	}
}
*/

// MAIN.java

/*
package orientacao_a_objetos;

public class Main extends Abstract_class{
	
	public static void main (String args[]){
		Abstract_class teste = new Abstract_class();
	}
	
	
}
*/

// POSSO ACESSAR DESSA FORMA TAMBÉM:

/*
package orientacao_a_objetos;

public class Main extends Abstract_class{
	
	public static void main (String args[]){
		//Abstract_class teste = new Abstract_class();
		new Main().iniciarJogo();
	}
	
	public void chamarMetodoAbstract() {
		 iniciarJogo();
	}
	
}
*/


// OU POSSO ATÉ REESCREVER O CÓDIGO DA CLASS ABSTRACT DENTRO DA MINHA MAIN

/*
  public void iniciarJogo(){
    xxxxxxxxxxxxxxxx
  }
*/

// THIS ---------------  SERVE PARA CHAMER TODOS OS MÉTODOS DISPONÍVEIS DENTRO DA CLASSE

/*
public void chamarMetodoAbstract() {
		this.instanceMain2();
	}
*/















