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
