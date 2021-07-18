object q2 {

  def gcd(num1:Int, num2:Int):Int = {
    num2 match {
      case 0 => return num1;
      case num2 if(num2>num1) => return gcd(num2, num1);
      case _ => return gcd(num2, num1%num2);
    }
  }

  def prime(num1:Int, num2:Int = 1):Boolean = {
    num2 match {
      case num if(num1 == num) => return true;
      case num if(gcd(num1, num) > 1)=> return false;
      case num => return(prime(num1, num+1));
    }
  }

  def primeSeq(num:Int):Unit={
   if(num >= 1){
      primeSeq(num-1);
   }
    if(prime(num) == true){
      print(" "+num+" ");
    }

  }

  def main(args: Array[String]): Unit = {
      print("Enter number : ")
      var x=scala.io.StdIn.readInt()
      primeSeq(x);
  }

}