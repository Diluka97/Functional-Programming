object q3{

    def total(y:Int):Int = {
        if(y==1) {
            1
        }
        else{
            y+total(y-1)
        }
       
    }

    def main(args:Array[String]){
        print("Enter number : ")
        var x=scala.io.StdIn.readInt()
        println("Addition of numbers from 1 to " + x + " = "+total(x))
    }

   
}