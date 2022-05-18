touch("poe.txt") 


f = open("poe.txt","w") 
write(f," Hello Tejas! ")
close(f)

f = open("poe.txt", "a")
write(f, "\n How are you? ") 
close(f)



open("poe.txt") do f  
    line = 0 
    
    while ! eof(f) 
         s = readline(f) 
        line += 1
        
        println("$line . $s")
        println(count("o", s))
        end 
    end 
 



 




    # open("poe.txt") do f
    #     uppercase(read(f, String))
    # end
    # open("poe.txt") do f
    #     lowercase(read(f, String))
    # end


    