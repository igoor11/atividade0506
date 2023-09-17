package uniderp.poo.escola.dominio;

public abstract class BaseVeiculo extends BaseIdentificador implements iImpressao{
    
    protected String nome;
    protected String modelo;
    protected String cor;
    protected int anoModelo;
    protected int anoFabricacao;
    protected int assentos;
    protected int portas;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected String nomeProprietario;
    protected String qtdeMotores;
    protected String qtdeOcupantes;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(String qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public String getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(String qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public BaseVeiculo(int codigo, String nome, String modelo, String cor, int anoModelo, int anoFabricacao,
            int assentos, int portas, int rodas, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String qtdeMotores, String qtdeOcupantes) {
        super(codigo);
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.assentos = assentos;
        this.portas = portas;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.nomeProprietario = nomeProprietario;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }

    
}
