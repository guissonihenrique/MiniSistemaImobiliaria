// GABRIEL SANTOS ZAMPIERI
// HENRIQUE GUISSONI

package Heranca;

public class Proprietario extends Pessoa {
    private Imovel imovel[] = new Imovel[10];
    // posição livre = null

    public Proprietario(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    public Imovel[] getImovel() {
        return imovel;
    }

    public void setImovel(Imovel[] imovel) {
        this.imovel = imovel;
    }
    
    public void adicionaImovel(Imovel imovel){
        // idImovel = 10
        // endereco = "Rua Julio Marques, 60"
        
        // não permitir a duplicidade de ID
        // fazer teste para verificar
    }
    
    public void retirarImovel(int id){
        // colocar 'null' no lugar do imovel removido
    }
}
