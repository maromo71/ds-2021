package net.maromo.prjencapsulamento;

public class Main {

    public static void main(String[] args) {
	    // Registrar dois medicamentos. Fazer compras e vendas deles
        Medicamento med1, med2;
        med1 = new Medicamento();
        med1.setCodigo(111);
        med1.setDescricao("Novalgina");
        med1.setPrincipioAtivo("Dipirona Mono hidratada");
        med1.setVolume("Em gotas");
        med1.setPrecoVenda(23.81);
        //comprar 1000 frascos de novalgina
        med1.comprar(1000);
        med1.mostrarMedicamento();
        med1.vender(400);
        med1.mostrarMedicamento();
    }
}
