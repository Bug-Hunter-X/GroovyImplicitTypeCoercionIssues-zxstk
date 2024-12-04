def list = [1, 2, 3, 4, 5]

def mySum(List list) { // Explicitly define parameter type as List
  sum = 0
  for (item in list) {
    sum += item
  }
  return sum
}

println mySum(list) // This now works correctly