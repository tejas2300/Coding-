list = 1:10
list2 = 1:20
for j in list2
    for i in list
        println("$j * $i = ",j*i)

    end
    println(" ")
end 