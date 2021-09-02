package net.maromo.prj2608;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarPapelaria {

    //Lista de Produto (definir)
    List<Produto> lista = new ArrayList<>();

    public static void main(String[] args) {
	    // Simular compra de produtos
        // Teremos um menu com opções
        // para cadastrar, vender, comprar
        // e exibir o estoque de determinado
        // produto
        GerenciarPapelaria gerenciar = new GerenciarPapelaria();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar Produto");
            System.out.println("2.. Comprar Produto");
            System.out.println("3.. Vender Produto");
            System.out.println("4.. Listar Produto ");
            System.out.println("9.. Sair ");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.cadastrarProduto();
                    break;
                case 2:
                    gerenciar.comprarProduto();
                    break;
                case 3:
                    gerenciar.venderProduto();
                    break;
                case 4:
                    gerenciar.mostrarTodosProdutos();
                    break;
                case 9:
                    System.out.println("Acabou");
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        }while(opcao!=9);
    }

    public void cadastrarProduto(){
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o codigo do produto..");
        produto.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descrição do produto..");
        produto.setDescricao(sc.nextLine());
        System.out.println("Digite o valor do produto..");
        produto.setValor(Double.parseDouble(sc.nextLine()));
        //preciso colocar o produto na lista
        lista.add(produto);
        System.out.println("Produto cadastrado com sucesso");
    }
    public void comprarProduto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto a comprar: ");
        int codigo = Integer.parseInt(sc.nextLine());
        for (Produto p : lista ) {
            if(p.getCodigo()==codigo){
                System.out.println("Digite a quantidade comprada: ");
                int quantidade = Integer.parseInt(sc.nextLine());
                p.comprar(quantidade);
                System.out.println("Produto comprado com sucesso");
            }
        }
    }
    public void venderProduto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto a vender: ");
        int codigo = Integer.parseInt(sc.nextLine());
        for (Produto p : lista ) {
            if(p.getCodigo()==codigo){
                System.out.println("Digite a quantidade vendida: ");
                int quantidade = Integer.parseInt(sc.nextLine());
                p.vender(quantidade);
                System.out.println("Produto vendido com sucesso");
            }
        }
    }
    public void mostrarTodosProdutos(){
        for(Produto p : lista){
            System.out.println("Dados do Produto");
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Quantidade em Estoque: " + p.getQuantidadeEstoque());
            System.out.println("Valor: " + p.getValor());
            System.out.println();
        }
    }
}
