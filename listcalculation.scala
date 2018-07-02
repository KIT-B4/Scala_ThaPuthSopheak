object listcalculation
{
  def main(args: Array[String])
	{
		// var  x = List(1,2,3)
		// x.foreach{println}

	// var names = List("Bob", "Fred", "Joe", "Julia", "Kim")
		// for (name <- names if name.startsWith("J"))
  //     println(name)
		// for (name <- names) println(name)

		// var names = List("Bob",1,3,4, "Fred", 9,4, "Joe", "Julia", "Kim")
		// for ( i <- 0 to names.size)
		// if(names(i) == Int)
		// println(names(i))

		var t = ("Bob",1,3,4, "Fred", 9.4f, "Joe", "Julia", "Kim");
		var sum:Float = 0;
		var str:String = " ";

		t.productIterator.foreach{
			case i:Int => sum = sum + i;
			case f:Float => sum = sum + f; 
			case s:String => str=str+s};
		println("The sum of integer and float is: " + sum);
		println("The concatenate string is: " + str);


	// for (name <- names if name.IsNumberic() println(name))
	
     
		// for (name <- wow if name.isNumberic())
		// println(name)
     
	}

}