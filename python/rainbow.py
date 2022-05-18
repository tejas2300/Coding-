import turtle
colors=["red","yellow","white","blue","green"]
t= turtle.Pen()
turtle.bgcolor("black")
for x in range(360):
    t.pencolor(colors[x%5])
    t.width(x//100+1)
    t.forward(x)
    t.left(70)
