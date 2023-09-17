package uniderp.poo.escola.dominio;

public abstract class BaseVeiculoT extends BaseVeiculo {

    protected String chassi;
    protected String placa;
    protected String renavam;
    protected String estadoUF;
    protected String cidadeUF;
    protected String eixo;
    protected double pesoTotal;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getEixo() {
        return eixo;
    }
    public void setEixo(String eixo) {
        this.eixo = eixo;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public BaseVeiculoT(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int assentos, int portas, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String qtdeMotores, String qtdeOcupantes, String chassi, String placa,
            String renavam, String estadoUF, String cidadeUF, String eixo, double pesoTotal) {
        super(codigo, nome, modelo, cor, anoModelo, anoFabricacao, assentos, portas, rodas, fabricante, potencia,
                tipoCombustivel, nomeProprietario, qtdeMotores, qtdeOcupantes);
        this.chassi = chassi;
        this.placa = placa;
        this.renavam = renavam;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.eixo = eixo;
        this.pesoTotal = pesoTotal;
    }

    
}
