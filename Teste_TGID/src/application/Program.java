package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.ItemVenda;
import entities.Usuario;
import entities.Venda;
import entities.Produto;

import entities.enums.VendaStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		// Para pegar os preços utilizando "." em vez de ","
		Locale.setDefault(Locale.US);
		
		// Objeto para pegar pegare fornecer a data no formato (DD/MM/YYYY)
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Instanciando usuário (cliente)
		Usuario client = new Usuario("Victor", "64320394531", "vhl12.victor@gmail.com");
		
		int tArray = 7;
		// Itens que farão parte da venda
		ItemVenda item[] =  new ItemVenda[tArray];
		
		item[0] = new ItemVenda(1, 2500.0, new Produto("Computador", 4));
		item[1] = new ItemVenda(1, 400.00, new Produto("Mesa", 2));
		item[2] = new ItemVenda(2, 800.0, new Produto("Monitor", 5));
		item[3] = new ItemVenda(2, 699.99, new Produto("Cadeira", 1));
		item[4] = new ItemVenda(1, 210.70, new Produto("Kit Teclado e Mouse", 2));
		item[5] = new ItemVenda(3, 15.99, new Produto("Caderno", 4));
		item[6] = new ItemVenda(5, 3.50, new Produto("pen", 10));
		
		
		// Instanciando uma nova venda
		Venda homeOfficeKit = new Venda(sdf.parse("27/07/2022"), client, VendaStatus.valueOf("PAGAMENTO_CONFIRMADO"));
		
		// Adicionando os ItemVendas ao objeto venda (homeOfficeKit)
		for (int i = 0; i < tArray; i++) {
			homeOfficeKit.addItem(item[i]);
			item[i].toString();
		}
		
		System.out.println("------------------");
		System.out.println("| TGID LOJA TECH |");
		System.out.println("------------------");
		
		System.out.println("DADOS DA VENDA: \n");
		System.out.println(homeOfficeKit.toString());
		System.out.println("Cliente: ");
		System.out.println(homeOfficeKit.getClient().toString() + "\n");
		System.out.println("Itens vendidos: ");
		homeOfficeKit.getItemsList();
		System.out.println("\nTOTAL DA VENDA: R$ " + homeOfficeKit.totalOfSale());
		
		
		
	}

}
