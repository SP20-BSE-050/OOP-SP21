package labA;

public class pizza {
	private String SizeOfPizza;
	private int CheeseQuantity;
	private int Quantitypepperoni;
	private int hamQuantity;
	
	public pizza()
	{
		SizeOfPizza = "";
		CheeseQuantity = 0;
		Quantitypepperoni = 0;
		hamQuantity = 0;
	}
	public pizza(String a, int b, 
			int c, int d){
    this.SizeOfPizza = a;
    this.CheeseQuantity = b;
    this.Quantitypepperoni = c;
    this.hamQuantity = d;
}
	public String getSizeOfPizza()
	{
		return SizeOfPizza;
	}
	public void setSizeOfPizza(String SizeOfPizza)
	{
		this.SizeOfPizza = SizeOfPizza;
	}
	public int getQuantityofCheese()
	{
		return CheeseQuantity;
	}
	public void setQuantityofCheese(int CheeseQuantity)
	{
		this.CheeseQuantity = CheeseQuantity;
	}
	public int getNumofPepperoni()
	{
		return Quantitypepperoni;
	}
	public void setNumofPepperoni(int Quantitypepperoni)
	{
		this.Quantitypepperoni = Quantitypepperoni;
	}
	

	public int getNumofHam()
	{
		return hamQuantity;
	}
	public void setNumofHma(int hamCount)
	{
		this.hamQuantity = hamCount;
	}
	public double calcCost()
	{		
		if(SizeOfPizza.equalsIgnoreCase("SMALL"))
		{
			return 10 + (CheeseQuantity + Quantitypepperoni + hamQuantity) * 2;  /*10$ AND 2$ EXTRA FOR TOPPING*/
		}
		
               else if(SizeOfPizza.equalsIgnoreCase("MEDIUM"))
		{
			return 12 + (CheeseQuantity + Quantitypepperoni + hamQuantity) * 2;
		}
	       else if(SizeOfPizza.equalsIgnoreCase("LARGE"))
		{
			return 14 + (CheeseQuantity + Quantitypepperoni + hamQuantity) * 2;
		}
		else
		{
			return 0.0;
		}
	}
		public String getDescription()
		{
			return "SIze of Pizza= " + SizeOfPizza + "\n Topping of cheese= " + CheeseQuantity + " \nTopping of pepporoni= " + Quantitypepperoni + "\n Topping of Ham: " + hamQuantity+ " \nCost of Pizza= $" + calcCost() + "\n";
		}
	
	}



	


