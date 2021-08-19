package net.maromo.prjencapsulamento;

public class Medicamento {
    //Atributos
    private int codigo;
    private String descricao;
    private String principioAtivo;
    private String volume;
    private int quantidadeEstoque;
    private double precoVenda;

    //Métodos modificadores de acesso
    //Vou pedir auxulio para o Gênio da Lâmpada
    // ALT + INSERT --> Seleciona Getter and Setter, marca os
    //campos e da um OK.
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    //Métodos
    public void comprar(int qtd){
        quantidadeEstoque = quantidadeEstoque + qtd;
        //quantidadeEstoque += qtd;
    }
    public void vender(int qtd){
        quantidadeEstoque = quantidadeEstoque - qtd;
        //quantidadeEstoque -= qtd;
    }
    public void mostrarMedicamento(){
        System.out.println();
        System.out.println("Dados do Medicamento");
        System.out.println("Código do Medicamento: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Princípio Ativo: " + principioAtivo);
        System.out.println("Volume: " + volume);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Preço do Produto R$ " + precoVenda);
        System.out.println();
    }
}
