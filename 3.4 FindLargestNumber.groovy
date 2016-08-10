class Example {
   static void main(String[] args) {
      
      FindLargestNumber(999,2,68);
      FindLargestNumber(18,77,70);
      FindLargestNumber(89,15,250);
      
   }
  static void FindLargestNumber(int number1, int number2, int number3)
    {
        int a, b, c,largest;
        a=number1; b=number2; c=number3;
        largest=a;
        if(a>=b && a>=c)
        {
          largest=a;
        }
        if(b>=a && b>=c)
        {
            largest=b;
        }

        if(c>=a && c>=b)
        {
          largest=c;
        }
        println(a +", "+b+", "+c+". The lagest number is " +largest);
    } 
   
}