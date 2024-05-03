import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

    int parametroUm;
    int parametroDois;

    if (args.length == 2) {
      parametroUm = Integer.parseInt(args[0]);
      parametroDois = Integer.parseInt(args[1]);
    } else {
      Scanner terminal = new Scanner(System.in);
      System.out.print("Digite o primeiro parâmetro: ");
      parametroUm = terminal.nextInt();
      System.out.print("Digite o segundo parâmetro: ");
      parametroDois = terminal.nextInt();
      terminal.close();
    }
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    
		if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException();
    }

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
    
	}
}
