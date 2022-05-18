
set1 = list()
set2 = list()

n = int(input("enter no of elements"))
print("enter elements for first set")
for i in range(0, n):
    set1.append(float(input()))

print("enter elements for second set")
for i in range(0, n):
    set2.append(float(input()))

# Fuzzy Set Union
union = list()
for x, y in zip(set1, set2):
    if x > y:
        union.append(x)
    else:
        union.append(y)

print("union=" + str(union))

# Fuzzy Set Intersection
intersect = list()
for x, y in zip(set1, set2):
    if x < y:
        intersect.append(x)
    else:
        intersect.append(y)

print("intersection=" + str(intersect))

# Algebraic sum
ASum = list()
for x, y in zip(set1, set2):
    ASum.append(x + y - x * y)
print("Algebraic Sum=" + str(ASum))

# Compliment
comp = list()
for x in set1:
    comp.append(1 - x)

print("compliment of set1=" + str(comp))

# Product
product = list()
for x, y in zip(set1, set2):
    product.append(x * y)

print("product=" + str(product))
