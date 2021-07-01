object flight{
	
		var A_array = Array.ofDim[Int](4,10)
		var B_array = Array.ofDim[Int](4,10)
		var C_array = Array.ofDim[Int](4,10)
		var D_array = Array.ofDim[Int](4,10)
		var E_array = Array.ofDim[Int](4,10)
		var tempArray = Array.ofDim[Int](4,10)
		var i=0
		var j =0
		var x=0
		
		def str_Convertor(a:Char):Int={
			
			a match{
			
				case 'A' =>
					return 1
				
				case 'B' =>
					return 2
					
				case 'C' =>
					return 3
					
				case 'D' =>
					return 4
					
				case 'E' =>
					return 5
				
			}
		}
		
		
		def arrayConvertor(b:Int):Array[Array[Int]]={
			
			b match{
				case '1' =>
					return A_array
				
				case '2' =>
					return B_array
					
				case '3' =>
					return C_array
					
				case '4' =>
					return D_array
					
				case '5' =>
					return E_array
				
			}
		
		}
		
		def display(From:Char , To:Char, row:Int ,colomn:Int):Unit={
				
				var start = str_Convertor(From)
				var end = str_Convertor(To)
					
		
			for(i<- start until end){
				var tempArray = arrayConvertor(i)
				
					if(tempArray(row)(colomn) == 1 ){
						println("Booking")
					}
					else{
						tempArray(row)(colomn)=1
						println("success booking")
					}
			}
		}
		
			
		def main(args:Array[String]){
			
			print("from : ")
			var from = scala.io.StdIn.readChar()
			
			print("to : ")
			var to = scala.io.StdIn.readChar()
			
			print("Seat row no : ")
			var row = scala.io.StdIn.readInt()
			
			print("seat colomn no : ")
			var col = scala.io.StdIn.readInt()
			
			display(from ,to , row, col)
		}
}