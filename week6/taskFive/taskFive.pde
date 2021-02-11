//Task 5

//a

//The problem here is that "output" is set as a local variable.
//To fix the problem, is has to be set as a global variable.
String output;

void setup() {
  MethodOne(); 
  MethodTwo();
}

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  if (i > max)
  {
    output = "i is greater than "+max+".";
  }

  println(output);
}


//b
void MethodTwo() 
{
  int weekDay = 0; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  String currentDay = "";

  if (weekDay < 5)
  {
    weekend = false;
  } else 
  {
    weekend = true;
  }
  
  if(weekDay == 0){currentDay = "Monday";}
  else if(weekDay == 1){currentDay = "Tuesday";}
  else if(weekDay == 2){currentDay = "Wednesday";}
  else if(weekDay == 3){currentDay = "Thursday";}
  else if(weekDay == 4){currentDay = "Friday";}
  else if(weekDay == 5){currentDay = "Saturday";}
  else if(weekDay == 6){currentDay = "Sunday";}
  
  // Print the name of the weekday here: 

  println(currentDay);

  // Print if it is weekend here:
  if(weekend){println("It is weekend");}
  else{println("It is not weekend");}
  
}
