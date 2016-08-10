import java.util.ArrayList;
import java.util.Collections;

class Example {
   static void main(String[] args) {
     SortThreenumbers(5,10,8);
     
     SortThreenumbers(100,10,500);
     }
   
  static void SortThreenumbers(int a, int b, int c)
    {

        ArrayList arrayList = new ArrayList();

        arrayList.add(a);

        arrayList.add(b);
        arrayList.add(c);
        Collections.sort(arrayList)
        for(int i=0; i < arrayList.size(); i++)
            print(arrayList.get(i)+" ");
        
        println("\n");
    }
   
}