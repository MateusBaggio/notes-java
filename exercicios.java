// ex 1
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

		public static void main(String[] args) {
			/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
			mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
			(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
			
			Scanner in = new Scanner(System.in);
			
			int ano, mes, dia;
			
			System.out.println("Insira o ano");
			ano = Integer.parseInt(in.nextLine());
			
			System.out.println("Insira o mes");
			mes = Integer.parseInt(in.nextLine());
			
			System.out.println("Insira o dia");
			dia = Integer.parseInt(in.nextLine());
			 	
			int[] infos = new int[3];
			infos[0] =  ano;
			infos[1] = mes;
			infos[2] = dia;
			
			int total = (ano * 365) + (mes * 30) + (dia);
			
				
			System.out.println(total);
			
		}


// Ex2 
//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.

	public static void main(String[] args) {
		int[] first = new int[3];
		first[0] = 8;
		first[1] = 9;
		first[2] = 7;
		int[] second = new int[3];
		second[0] = 4;
		second[1] = 5;
		second[2] = 6;
		
		float media_first = ((first[0]) + (first[1]) + (first[2])) / 3;
		float media_second = ((second[0]) + (second[1]) + (second[2])) / 3;
		
		float media_total = ((media_second) + (media_first))  / 2;
		
		System.out.println(media_first);
		System.out.println(media_second);
		System.out.println(media_total);
		
		
	}


