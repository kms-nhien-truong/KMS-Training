class Example {
   static void main(String[] args) {
      
      Capitalization("jon skeet");
      Capitalization("old mcdonald");
      Capitalization("miles o'Brien");
      
   }
   
   static void Capitalization(String str_ig)
    {
        String sample = str_ig;
        String []array = sample.split(" ");
        String collection="";
        for( String values : array )
        {

            collection+= values[0].toUpperCase();
            int lenghtstr = values.length();

            lenghtstr--;
            collection+= values[1..lenghtstr];
            collection+= " ";
        }
        println(collection);
}}