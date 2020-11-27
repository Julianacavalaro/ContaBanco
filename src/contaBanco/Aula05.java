package contaBanco;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBanco p1 = new ContaBanco();
		p1.setDono("Jose");
		p1.abrirConta("cp");
		p1.setNumConta(123457);
		p1.status();
		
		System.out.println();
		p1.fecharConta();

		
		System.out.println();
		p1.sacar(150f);
		p1.status();
		
		System.out.println();
		p1.fecharConta();
		
		p1.status();
		
		System.out.println();
		p1.abrirConta("cc");
		p1.depositar(100);
		p1.status();
		p1.sacar(49f);
		
		System.out.println();
		ContaBanco p2 = new ContaBanco();
		p2.setDono("Maria");
		p2.abrirConta("cc");
		p2.setNumConta(987654);
		p2.depositar(100f);
		p2.status();
		
		System.out.println();
		p2.sacar(60.5f);
		p2.fecharConta();
		
		System.out.println();
		p1.sacar(0.50f);
		System.out.println("Saldo de p1: "+ p1.getSaldo());
		
		System.out.println();
		p2.sacar(10f);
		System.out.println("Saldo de p2: "+ p2.getSaldo());
	}

}
