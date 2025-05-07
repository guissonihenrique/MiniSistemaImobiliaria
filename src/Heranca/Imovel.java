// GABRIEL SANTOS ZAMPIERI
// HENRIQUE GUISSONI

package Heranca;

public class Imovel {
    private String endereco;
    private double valorBaseLocacao;
    private double valorBaseVenda;
    private double valorIptu;

    public Imovel(String endereco, double valorBaseLocacao, double valorBaseVenda, double valorIptu) {
        this.endereco = endereco;
        this.valorBaseLocacao = valorBaseLocacao;
        this.valorBaseVenda = valorBaseVenda;
        this.valorIptu = valorIptu;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }

    public double getValorBaseVenda() {
        return valorBaseVenda;
    }

    public void setValorBaseVenda(double valorBaseVenda) {
        this.valorBaseVenda = valorBaseVenda;
    }

    public double getValorIptu() {
        return valorIptu;
    }

    public void setValorIptu(double valorIptu) {
        this.valorIptu = valorIptu;
    }
    
    public void mostraDados(){
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor Base Locação: " + valorBaseLocacao);
        System.out.println("Valor Base Venda: " + valorBaseVenda);
        System.out.println("Valor IPTU: " + valorIptu);
    }
}
