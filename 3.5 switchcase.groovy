class Example {
   static void main(String[] args) {
      
      switchcase(1);
      switchcase(2);
      switchcase(3);
      switchcase(0);
      
   }
  static void switchcase(int number)
    {
        String result="";

        switch (number)
        {
            case 1:
                result = "one"
                break;
            case 2:
                result = 'two'
                break;
            case 3:
                result = 'three'
                break;
            default:
                result = 'unknown'
                break;
        }

        println(number + " " + result);
    }
   
}