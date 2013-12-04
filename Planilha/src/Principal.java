import java.util.Scanner;
import static java.lang.System.*;

public class Principal {
	public static void main(String[] args) {
		Planilha obj = new Planilha('j', 100);
		Scanner sc = new Scanner(in);
		String x = null;
		int comandos = 0;
		boolean sair = true;

		do{
			System.out.println("Bem vindo a planilha digite \n1 para insercao \n2 para consulta \n3 para finalizar");
			comandos = sc.nextInt();


			switch (comandos) {
			case 1:
				System.out.println("Voce escolheu a opcao de insercao\nPara sair digite 'sair'\n\n");
				do {
					System.out.println("Digite as coordenadas: ");
					x = sc.next();
					if (x.equalsIgnoreCase("sair")) {
						break;
					}
					char consulta1 = Character.toUpperCase(x.charAt(0));
					int consulta2 = Integer.parseInt(x.substring(1));

					System.out.println("Digite o valor: ");
					String valor = sc.next();
					obj.setValor(consulta1, consulta2, valor);
					
				} while (true);
				break;


			case 2:
				System.out.println("Voce escolheu a opcao de consulta \nPara sair digite 'sair'\n\n");
				do{
					System.out.println("Celula a ser consultada: ");
					x = sc.next();
					char consult1 = Character.toUpperCase(x.charAt(0));
					int consult2 = Integer.parseInt(x.substring(1));
					Celula valor = obj.getValor(consult1, consult2);

					String formula = valor != null ? valor.getFormula() : "(Formula vazia)";


					System.out.println("Celula consultada" + x + "    |    Formula: " + formula);
					if (x.equalsIgnoreCase("sair")){
						break;
					}
				}while(true);

				break;


			case 3:
				System.out.println("Finalizando planilha");
				System.exit(0);
				break;


			default:
				break;
			}
		}while(true);



	}
}


