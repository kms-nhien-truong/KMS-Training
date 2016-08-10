class Example {
   static void main(String[] args) {
      
      PrintEvenNumbers(10);
      PrintEvenNumbers(15);
      
   }
  static void PrintEvenNumbers(int pnumber)
    {
        println("The number is "+pnumber+". The even numbers are below: ");
        for(int i=0;i<=pnumber;i++)
        {
            if((i%2)==0)
                println(i);
        }

    }
   
}