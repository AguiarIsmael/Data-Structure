public class Manager {
	
	public static void main(String[] args) {
		
		AdminMenosElementos recMen = new AdminMenosElementos();
		AdminMasElementos adMas = new AdminMasElementos();
		ColaCompuesta c1 = new ColaCompuesta(adMas, recMen);	
		ColaTerminal c2 = new ColaTerminal("c2");
		ColaTerminal c3 = new ColaTerminal("c3");
		c2.agregar(5);
		c2.agregar(6);
		c3.agregar(1);
		c3.agregar(2);
		c1.agregarCola(c2);
		c1.agregarCola(c3);
		c1.agregar(3);
		System.out.println(c1.recuperar());
		System.out.println(c1.recuperar());
		System.out.println(c1.recuperar());
	}
}