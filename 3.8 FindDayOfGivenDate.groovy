class Example {
   static void main(String[] args) {
      //input dd/MM/yyyy format
      FindDayOfGivenDate("01/08/2016");
      FindDayOfGivenDate("02/08/2016");
      FindDayOfGivenDate("17/08/2016");
      FindDayOfGivenDate("18/08/2016");
      FindDayOfGivenDate("19/08/2016");
      FindDayOfGivenDate("20/08/2016");
      FindDayOfGivenDate("21/08/2016");
      
   }
  static void FindDayOfGivenDate(String strDate)
    {

        String olddate=strDate;
        olddate+= " 00:00:00";
        Date date = Date.parse("dd/MM/yyyy HH:mm:ss",olddate);
        //String newDate = olddate.format( 'dd/MM/yyyy' );

        String []Fdate = date.toString().split(" ");
        println(strDate);
        String result="";

        switch(Fdate[0]){
            case "Mon":
                result = "Day is Monday\n"
                break;
            case "Tue":
                result = 'Day is Tuesday\n'
                break;
            case "Wed":
                result = 'Day is Wednesday\n'
                break;
            case "Thu":
                result = 'Day is Thursday\n'
                break;
            case "Fri":
                result = 'Day is Friday\n'
                break;
            case "Sat":
                result = 'Day is Saturday\n'
                break;
            case "Sun":
                result = 'Day is Sunday\n'
                break;
        }
        println(result);
    }
   
}