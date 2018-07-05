object array_range
{
	def main(args: Array[String])
	{
		var a = Range('a','z')
		for(i <- a)
		{
			println(i)
		}

		val x = (1 to 10).toArray
		for(i <- x)
		{
			println(i)
		}
	}
} 