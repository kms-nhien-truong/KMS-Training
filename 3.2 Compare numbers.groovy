class Example {
   static void main(String[] args) {
      
      CompareNumber(99, 5);
      CompareNumber(1, 1000);
   }
   
   static void CompareNumber(int n1, int n2)
    {
        if(n1<n2)
            println("Number "+ n2+ " is greater than " + n1);
        if(n1>n2)
            println("Number "+ n1+ " is greater than " + n2);
    }
}