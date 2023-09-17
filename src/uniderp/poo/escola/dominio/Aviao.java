package uniderp.poo.escola.dominio;

public class Aviao extends BaseVeiculo {
    
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Aviao(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int assentos,
            int portas, int rodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String qtdeMotores, String qtdeOcupantes, String tamanho) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, assentos, portas, rodas, fabricante, potencia,
                tipoCombustivel, nomeProprietario, qtdeMotores, qtdeOcupantes);
        this.tamanho = tamanho;
    }

    @Override
    public void Imprimir() {
        // TODO Auto-generated method stub
    System.out.println("codigo: " + this.codigo);
    System.out.println("nome: " + this.nome);
    System.out.println("modelo: " + this.modelo);
    System.out.println("cor: " + this.cor);
    System.out.println("Ano Modelo: " + this.anoModelo);
    System.out.println("Ano Fabricação: " + this.anoFabricacao);
    System.out.println("Assentos: " + this.assentos);
    System.out.println("Portas: " + this.portas);
    System.out.println("Rodas: " + this.rodas);
    System.out.println("Fabricante: " + this.fabricante);
    System.out.println("Potencia: " + this.potencia);
    System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
    System.out.println("Nome do Proprietário: " + this.nomeProprietario);
    System.out.println("Quantidade de motores: " + this.qtdeMotores);
    System.out.println("Quantidade de Ocupantes: " + qtdeOcupantes);
    System.out.println("Tamanho: " + this.tamanho);
    }
    
}
