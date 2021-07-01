object harvest{
			
		var Harvest = Array(Array(50,54,88,56,61,35,50),
								 Array(40,45,52,63,35,54,26),
								 Array(51,34,63,73,27,35,47),
								 Array(19,63,25,79,86,63,57));
								 
		def sumHarvest():Int={  //Sum harvest of the month
			var sum = 0 ;
			
			for(i<- 0 to 3){
				for(j<- 0 to 6){
					 sum = sum + Harvest(i)(j);
				}
			}
			return sum;
		}
		
		def totalDate():Int={    // Total date of the month
			var totalDate = 0 ;
			for(i<- 0 to 3){
				for(j<- 0 to 6){
					 totalDate = totalDate + 1;
				}
			}
			return totalDate;
		}

		
		def maxHarvest():Int={
			var x = 0;
			var y = 0;
			var week = 0;
			var date = 0;
			
			for(i<- 0 to 3){
				for(j<- 0 to 6){
					var x = Harvest(i)(j);
					
					if(y<x){
						y = x; 
						week = i;
						date = j;
					}
				}
			}
			
			println("Maximum Harvest is " + y + " on " + (date+1) + " day of " + (week+1)+ " week.");
			return y;
		}
		
		
		def minHarvest():Int={
			var x = 0;
			var y = Harvest(0)(0);
			var week = 0;
			var date = 0;
			
			for(i<- 0 to 3){
				for(j<- 0 to 6){
					var x = Harvest(i)(j);
					
					if(x<y){
						y = x; 
						week = i;
						date = j;
					}
				}
			}
			
			println("Minimum Harvest is " + y + " on " + (date+1) + " day of " + (week+1) + " week.");
			return y;
		}
		
		def rangeOfHarvest():Int={
			var rangeOfHarvest = maxHarvest() - minHarvest();
			return rangeOfHarvest;
		}
		
		
		def avarageHarvest():Double={
				var avarageHarvest = sumHarvest()/totalDate();
				return avarageHarvest;
		}
		
		
		def sortArray(a:Array[Int]):Unit={
				for(i <- 0 until a.length){
					var j=i+1

					while(j>1 && a(j)<a(j-1) && j<a.length){
						  var c=a(j)
						  a(j)=a(j-1)
						  a(j-1)=c
						  j-=1
					}
				}
				
				
				for(i<- 0 to a.length){
						
						print(a(i));
					}
		}
		
		
		def meadiumOfHarvest():Unit={
			var a = 0;
			var s_Array = new Array[Int](28);
			
			for(i<- 0 to 3){
				for(j<- 0 to 6){
				
					var x = Harvest(i)(j);
					s_Array(a) = x;
					a = a+1;
				}
			}
			 
			 sortArray(s_Array); 
			
		}
		
		

		def main(args:Array[String]){
					 // maxHarvest();
					 // minHarvest();	
					 //println("Range Of Harvest is " + rangeOfHarvest());
					 // println("Avarage Harvest is " + avarageHarvest());
					meadiumOfHarvest();
			}
}