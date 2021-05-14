object cost{

	var totalcost:Double=0;
	def main(args:Array[String])
		{	
			
		}
		
	def func(copy:Int):Double={

		if(copy>50){
			totalcost = (24.95*40/100) + 3 + (0.75*(copy-50));		
		}
		else{
			totalcost = (24.95*40/100) + 3;	
		}
		
	 return totalcost;
	}
	
	println("total wholesale cost = Rs." + func(60));
}