# using Pkg
# # Pkg.add("LIBSVM")

# # Pkg.add("RDatasets")
# # Pkg.add("Printf")
# # Pkg.add("Statistics")
# using LIBSVM
# using RDatasets
# using Printf
# using Statistics

# # Load Fisher's classic iris data
# iris = dataset("datasets", "iris")

# # First four dimension of input data is features
# X = Matrix(iris[:, 1:4])'

# # LIBSVM handles multi-class data automatically using a one-against-one strategy
# y = iris.Species

# # Split the dataset into training set and testing set
# Xtrain = X[:, 1:2:end]
# Xtest  = X[:, 2:2:end]
# ytrain = y[1:2:end]
# ytest  = y[2:2:end]

# # Train SVM on half of the data using default parameters. See documentation
# # of svmtrain for options
# model = svmtrain(Xtrain, ytrain)

# # Test model on the other half of the data.
# ŷ, decision_values = svmpredict(model, Xtest);

# # Compute accuracy
# @printf "Accuracy: %.2f%%\n" mean(ŷ .== ytest) * 100



# print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")




using LIBSVM
using RDatasets

# Classification C-SVM
iris = dataset("datasets", "iris")
X = Matrix(iris[:, 1:4])
y = iris.Species

Xtrain = X[1:2:end, :]
Xtest  = X[2:2:end, :]
ytrain = y[1:2:end]
ytest  = y[2:2:end]

model = fit!(SVC(), Xtrain, ytrain)
ŷ = predict(model, Xtest)
# Epsilon-Regression

whiteside = RDatasets.dataset("MASS", "whiteside")
X = Matrix(whiteside[:, 3:3])  # the `Gas` column
y = whiteside.Temp

model = fit!(EpsilonSVR(cost = 10., gamma = 1.), X, y)
ŷ = predict(model, X)