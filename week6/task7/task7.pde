//Task 7

//a, b

//The easiest way that came to mind was to simply create two FOR loops
//one for positive numbers, and one for negative numbers.

int input = -20;

if(input > 0){
for (int i = 0; i <= input; i++) {
  if (i == 6) {
    println("six");
  } else if (i == input/2) {
    println("HALF!");
  } else {
    println(i);
  }
}
} else {
  for (int i = 0; i >= input; i--) {
  if (i == -6) {
    println("-six");
  } else if (i == input/2) {
    println("HALF!");
  } else {
    println(i);
  }
}
}
