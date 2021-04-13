package labA;

public class runnerPizza {
	public static void main(String[] args)
	{
		pizza P1 = new pizza("LARGE", 2, 2, 2);
		pizza P2 = new pizza("medium", 2, 4, 5);
		ORDER order = new ORDER();
		order.setNumber_of_Pizza(2);
		order.setPizza1(P1);
		order.setPizza2(P2);
		double total = order.calcTotal();
		
		System.out.println(P1.getDescription());
		System.out.println(P2.getDescription());
		System.out.println("Total ammount in $ = " + total);
	}
}
