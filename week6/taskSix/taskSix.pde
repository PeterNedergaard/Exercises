//Task 6

//a
int a = (int)random(10), b = (int)random(10);

if (a == 10 || b == 10 || a+b == 10) {
  println("Success!");
} else {
  println("Failure!");
}


//b
int[] xyz = new int[3];

for (int i = 0; i < 3; i++) {
  xyz[i] = (int)random(30);

  if (xyz[i] == 10 || xyz[i] == 20 || xyz[i] == 30) {
    xyz[i] = (int)random(30);
  }
}

if (xyz[0] + xyz[1] + xyz[2] == 30) {
  println("Success!");
} else {
  println("Failure!");
}
//Another solution to this problem could be to create multiple
//if statements, checking whether the value assigned to each variable was either 10, 20 or 30
//and assigning a new value if it returned true
