object q4_q5 {
  def isEven(num:Int):Boolean={
    num match {
      case 0 => true;
      case _ => isOdd(num-1);
    }
  }

  def isOdd(num:Int):Boolean={
    return !isEven(num);
  }

  def allEven(num:Int):Unit={
    if(num>1){
      allEven(num-1);
    }
    if(isEven(num)){
      print(" "+num+" ");
    }
  }

  def main(args: Array[String]): Unit = {
    println(isEven(5));
    println(isEven(10));
    allEven(10);
  }
}