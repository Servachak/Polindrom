import java.util.Arrays;

/**
 * Created by adavi on 20.12.2017.
 */
public class SimpleNumbers implements CreateSimpleNumbers{



    @Override
    public int[] createSimpleNumbers(int lengthArray) {

        int[]a = new int[lengthArray];

        for (int i = 0;i < a.length; i++){

           int k = 0;
           while (k < lengthArray){
               a[i] = (int)(Math.random()*99 + 1);

               if(simpleNumberOfArray(a[i]) ){

                   ++k;
               }
           }
        }
        System.out.println(Arrays.toString(a));
        return a;
    }

    @Override
    public boolean simpleNumberOfArray(int n) {
        if(n >= 2  && n % 2 != 0 ) {

          int d = 3;
          while(d * d <= 100){

              if(n % d == 0){
                  return false;
              }
              d += 2;
          }
            return true;
        }
        return  false;
    }
}
