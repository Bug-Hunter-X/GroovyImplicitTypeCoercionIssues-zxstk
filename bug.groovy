def list = [1, 2, 3, 4, 5]

println list.sum() // This works fine

def mySum(list) {
  sum = 0
  for (item in list) {
    sum += item
  }
  return sum
}

println mySum(list) // This throws MissingMethodException: No signature of method: Script1.mySum() is applicable for argument types: (java.util.ArrayList) values: [[1, 2, 3, 4, 5]]
Possible solutions: mySum([Ljava.lang.Object;)