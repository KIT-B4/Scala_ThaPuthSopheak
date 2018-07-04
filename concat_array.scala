object main
{
	def main(args: Array[String]) {
		var arr1 = new Array[Int](5)
		var arr2 = new Array[Int](5)
		for(i <- 0 to 4)
		{
			arr1(i)= scala.io.StdIn.readInt();
		}
		for(i <- 0 to 4)
		{
			arr2(i)= scala.io.StdIn.readInt();
		}
		var array = Array.concat(arr1,arr2)
		for(i <- 0 to 9)
		println(array(i))








	 // val a = ArrayBuffer(1,2,3)
	 // for(i <- 0 to 2)
	 // {
	 // 	println(a(i))
	 // }
	 // a++ = ArrayBuffer(1,2,3)
	 // for (i <- 0 to a.size-1)
	 // {
	 // 	println(a(i))
	 // }
	}
}