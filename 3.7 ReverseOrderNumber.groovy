class Example {
   static void main(String[] args) {
      
      ReverseOrderNumber(10);
      ReverseOrderNumber(15);
      
   }
  static void ReverseOrderNumber(int rnumber)
    {
        println("The number is "+rnumber+". The reverse order numbers are below: ");
        for(int i=rnumber;i>0;i--)
        {
            println(i);
        }

    }
   
}