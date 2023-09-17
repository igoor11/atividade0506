import uniderp.poo.escola.dominio.Aviao;
import uniderp.poo.escola.dominio.Caminhao;
import uniderp.poo.escola.dominio.Carro;
import uniderp.poo.escola.dominio.Moto;
import uniderp.poo.escola.dominio.Onibus;
import uniderp.poo.escola.dominio.iImpressao;

public class App {
    public static void main(String[] args) throws Exception {
       
    Carro c1 = new Carro(1, "Toro", "Caminhonete", "verde", 2015, 2013, 4, 4, 4, "Fiat", 160, "Diesel", "Victor", "1", "4", "123123123", "ABC-1234", "009765212", "Mato Grosso do Sul", "Campo Grande", "2", 1500, "Picape");
    c1.Imprimir();

    Moto m1 = new Moto(2, "Titan", "Street", "Vinho", 2015, 2013, 1, 0, 2, "Honda", 150, "Flex", "Igor", "1", "2", "123321678", "DEF - 4567", "678678678", "Mato Grosso do Sul", "Campo Grande", "2", 200, "150");
    m1.Imprimir();

    Onibus o1 = new Onibus(3, "Benz Omnibus", "Mercedes", "Prata", 2015, 2010, 50, 2, 6, "Mercedes Benz", 285, "Diesel", "Marcopolo", "1", "50", "11OS067F", "HIJ - 9089", "1231231231", "Mato Grosso do Sul", "Campo Grande", "2", 2000, "Público");
    o1.Imprimir();

    Caminhao b1 = new Caminhao(4, "f 14000", "F 14000", "Vermemlho", 2020, 2015, 3, 2, 6, "Volkswagen", 305, "Diesel", "Aldair", "1", "3", "12lJKJ123", "DFG - 8324", "ASD123GVDFH", "Rio Grande do Sul", "Porto Alegre", "2", 1750, "2100");
    b1.Imprimir();

    Aviao a1 = new Aviao(5, "BelugaXL", "A 380", "Branco", 2010, 2000, 78, 2, 8, "AirBus", 165.000, "Querosene", "Azul", "6", "74", "70");
    a1.Imprimir();
    }   
}
