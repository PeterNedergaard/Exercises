class Main{
  public static boolean happy = true;

  public static void main(String [] args) {
     if (iAmHappy())
     {
       System.out.println("I clap my hands");
     }
     else
     {
       System.out.println("I don't clap my hands"); 
     }

     System.out.println(sumOfInts(5,7));
     System.out.println(returnAsUpper("these words will be uppercase"));

     System.out.println(firstLetterUpper("Upper case"));
  }


public static boolean iAmHappy()
{
  if(!happy)return false;
  return true;
}


public static int sumOfInts(int int1, int int2){
  return int1 + int2;
}


public static String returnAsUpper(String word){
  return word.toUpperCase();
}

public static boolean firstLetterUpper(String someWord){
  char firstLetter = someWord.charAt(0);
  if(Character.isUpperCase(firstLetter)) return true;
  else return false;
}

}