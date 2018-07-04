

val a1 = Array(1, 2, 3)


for(i <- 0 to 2)
println(a1(i))

println()
val a2 = a1 map (_ * 3)

for(i <- 0 to 2)
println(a2(i))

println()
val a3 = a2 filter (_ % 2 != 0)
for(i <- 0 to a3.size-1 )
println(a3(i))
