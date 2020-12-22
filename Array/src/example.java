
public class example {
	
	  double[ ] exampleArray = {1,5,6,5,4,1};

      double maximum = exampleArray[0];

      private int index = 0;{

      for (int i = 1; i<exampleArray.length; i++){

           if (exampleArray[ i ] > maximum) {

                maximum = exampleArray[ i ];

                index = i;

           }

      }

      System.out.println(index);{
    	  
      }
}
}
