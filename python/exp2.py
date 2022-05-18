set1 = list()
set2 = list()

n = int(input("enter no of elements"))
print("enetr elements for first set")
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

print("union="+str(union))

# Fuzzy Set Intersection
intersect = list()
for x, y in zip(set1, set2):
    if x < y:
        intersect.append(x)
    else:
        intersect.append(y)

print("intersection="+str(intersect))


# Algebraic sum
ASum = list()
for x, y in zip(set1, set2):
    ASum.append(x+y-x*y)
print("Algebraic Sum="+str(ASum))

# Compliment
comp = list()
for x in set1:
    comp.append(1-x)

print("compliment of set1="+str(comp))

# Product
product = list()
for x, y in zip(set1, set2):
    product.append(x*y)

print("product="+str(product))

result = []
# bounded sum
result.clear()
for i in range(len(set1)):
    result.append(min(1, (set1[i]+set2[i])))
print("bounded sum:")
print(result)

# bounded difference
result.clear()
for i in range(len(set1)):
    result.append(max(0, (set1[i]+set2[i]-1)))
print("bounded diff:")
print(result)

# algebraic sum
result.clear()
for i in range(len(set1)):
    result.append((set1[i]+set2[i])-(set1[i]*set2[i]))
print("al sum")
print(result)

# algebraic difference
result.clear()
for i in range(len(set1)):
    result.append(max(0, (set1[i]+set2[i]-1)))
print("alg. Diff:")
print(result)

# power
p = int(input("Enter power:"))
result.clear()
for i in range(len(set1)):
    result.append(pow(set1[i], p))
print("power:")
print(result)


# Composition of matrix
nrows = int(input("Enter no.of rows for 1 matrix:"))
ncolmns = int(input("Enter no.of columns for 1 matrix:"))
matrix1 = []
result = []

print("Enter values:")
for i in range(nrows):
    a = []
    for j in range(ncolmns):
        a.append(float(input()))
    matrix1.append(a)

for i in range(nrows):
    for j in range(ncolmns):
        print(matrix1[i][j], end=" ")
    print()

nrows = int(input("Enter no.of rows for 2 matrix:"))
ncolmns = int(input("Enter no.of columns for 2 matrix:"))
matrix2 = []
print("Enter values:")
for i in range(nrows):
    a = []
    for j in range(ncolmns):
        a.append(float(input()))
    matrix2.append(a)

for i in range(nrows):
    for j in range(ncolmns):
        print(matrix2[i][j], end=" ")
    print()


for i in range(0, nrows):
    result.append([])

for i in range(0, nrows):
    for j in range(0, ncolmns):
        result[i].append(j)
        result[i][j] = 0


print("Composition of matrices is:")
for i in range(len(matrix1)):
    for j in range(len(matrix2[0])):
        for k in range(len(matrix2)):
            result[i][j] = max(result[i][j], min(matrix1[i][k], matrix2[k][j]))

for i in range(nrows):
    for j in range(ncolmns):
        print(result[i][j], end=" ")
    print()
