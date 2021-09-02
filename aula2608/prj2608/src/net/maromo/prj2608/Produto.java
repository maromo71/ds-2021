package net.maromo.prj2608;

public class Produto {
    //Atributos
    private int codigo;
    private String descricao;
    private double valor;
    private int quantidadeEstoque;

    //métodos getters e setters
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //método para dar entrada no estoque
    //ou método para dar saída do estoque
    public boolean vender(int quantidade){
        if(quantidade <= quantidadeEstoque){
            //devemos subtrair o valor do estoque
            quantidadeEstoque = quantidadeEstoque - quantidade;
            return true;
        }
        return false;
    }

    public boolean comprar(int quantidade){
        if(quantidade <= 0){
            return false;
        }
        quantidadeEstoque = quantidadeEstoque + quantidade;
        return true;
    }

}
