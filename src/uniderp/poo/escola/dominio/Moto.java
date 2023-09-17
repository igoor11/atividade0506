package uniderp.poo.escola.dominio;

public class Moto extends BaseVeiculoT {

    private String cilindradas;

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao, int assentos,
            int portas, int rodas, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String qtdeMotores, String qtdeOcupantes, String chassi, String placa, String renavam, String estadoUF,
            String cidadeUF, String eixo, double pesoTotal, String cilindradas) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, assentos, portas, rodas, fabricante, potencia,
                tipoCombustivel, nomeProprietario, qtdeMotores, qtdeOcupantes, chassi, placa, renavam, estadoUF,
                cidadeUF, eixo, pesoTotal);
        this.cilindradas = cilindradas;
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
    System.out.println("Chassi: " + this.chassi);
    System.out.println("Placa: " + this.placa);
    System.out.println("Renavam: " + this.renavam);
    System.out.println("Estado: " + this.estadoUF);
    System.out.println("Cidade: " + this.cidadeUF);
    System.out.println("Eixo: " + this.eixo);
    System.out.println("Peso Total: " + this.pesoTotal);
    System.out.println("Tipo veículo: " + this.cilindradas);
    }
    
}
