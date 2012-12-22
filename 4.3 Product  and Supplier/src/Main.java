
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product falafel = new Product();
		falafel.name = "Falafel Vegan";
		falafel.avaible = 45;
		falafel.price = 4.5;
		
		Product soyMilk  = new Product();
		soyMilk.name = "Alprosoya";
		soyMilk.avaible = 54;
		soyMilk.price = 5.0;
		
		Product soyYoghurt = new Product();
		soyYoghurt.name = "Vanillay ChoMoco";
		soyYoghurt.price = 4.12;
		soyYoghurt.avaible = 12;
		
		Supplier alpro = new Supplier();
		alpro.compName = "Alpro";
		
		Supplier falafCo = new Supplier();
		falafCo.compName = "Falafel Ibn Ah Muhamed";
		
		soyMilk.supplier = alpro;
		falafel.supplier = falafCo;
		soyYoghurt.supplier = alpro;
		
		System.out.println(soyMilk.supplier == alpro);
		
//		falafCo. = falafel;
//		alpro.product = soyMilk; 
//		alpro.product = soyYoghurt;
//		
		
	}

}
