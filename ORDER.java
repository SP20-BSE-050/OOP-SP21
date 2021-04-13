package labA;

public class ORDER {
	
	
		private int Number_of_Pizza;
		private pizza P1;
		private pizza P2;
		private pizza P3;
		
		public ORDER()
		{
			this.Number_of_Pizza = 0;
			this.P1 = null;
			this.P2 = null;
			this.P3 = null;
		}
		
		public ORDER(int Number_of_Pizza, pizza P1, pizza P2, pizza P3)
		{
			setNumber_of_Pizza(Number_of_Pizza);
			setPizza1(P1);
			setPizza2(P2);
			setPizza3(P3);
		}

		public void setNumber_of_Pizza(int Number_of_Pizza)
		{		
			if(Number_of_Pizza < 1)
				this.Number_of_Pizza = 1;
			else if(Number_of_Pizza > 3)
				this.Number_of_Pizza = 3;
			else
				this.Number_of_Pizza = Number_of_Pizza;
		}

		public void setPizza1(pizza P1)
		{
			if(Number_of_Pizza >= 1)
				this.P1 = P1;
			else
				this.P1 = null;
		}

		public void setPizza2(pizza P2)
		{
			if(Number_of_Pizza >= 2)
				this.P2 = P2;
			else
				this.P2 = null;
		}

		public void setPizza3(pizza P3)
		{
			if(Number_of_Pizza >= 3)
				this.P3 = P3;
			else
				this.P3 = null;
		}
		
		public double calcTotal()
		{
			double total = 0.0;
			
			if(P1 != null)
				total += P1.calcCost();
			
			if(P2 != null)
				total += P2.calcCost();
			
			if(P3 != null)
				total += P3.calcCost();
			
			return total;
		}	
	}
	 

	