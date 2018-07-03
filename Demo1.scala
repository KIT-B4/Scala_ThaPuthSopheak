// object Demo {
//    def main(args: Array[String]) {

// 		var myMatrix = ofDim[Int](3,3)
// 		println("Enter the number")
// 		for(i <- 0 to 2)
// 		{
// 			for(j <- 0 to 2)
// 			{
// 				myMatrix(i)(j)=scala.io.StdIn.readInt()
// 			}
// 		}

//    }}


import Array._

object Demo {
   def main(args: Array[String]) {
      var myMatrix = ofDim[Int](2,3,3)
      
      // build a matrix
      for(k <-0 to 1 ){
      	print("enter the array" + (k+1))
      	println()
      for (i <- 0 to 1) {
         for ( j <- 0 to 1) {
            myMatrix(k)(i)(j) = scala.io.StdIn.readInt();
         }
      }}

      
      // Print two dimensional array
     var sum = ofDim[Int](3,3)
     println()
      for (i <- 0 to 1) {
         for ( j <- 0 to 1) {
		sum(i)(j)=myMatrix(0)(i)(j) + myMatrix(1)(i)(j)
		print(sum(i)(j)+" ")
         }
         println();
      }
   
   }
}