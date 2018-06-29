

object Findword{
   def main(args: Array[String]) :Unit= 
   {

val words = List("apqs", "avadavat", "avail", "availability", "available", 
  "avalanche", "avantgarde", "avarice")

// for (i <- 0 to words.size) 
// {
// 	if(words(i).startsWith("a"))
// 	{
// 		println(words(i))
// 	}
// }


words.foreach(c => (if(words.size ==4)println("yes") else println("no")))

words.foreach(c => (if(words.size >3)println("yes") else println("no")))
}}