import java.util.Arrays;

/**
 * Created by adavi on 20.12.2017.
 */
public class BuildMultiplicationArray implements MultiplicationArray {
    @Override
    public int[][] multiplication(int[] a, int[] b) {

        int [][] multArray = new int[a.length][ b.length];

            for (int i = 0; i < a.length; i++){

                for(int j = 0; j < b.length; j++){

                    multArray[i][j] = a[i] * b[j];
                    String s = "" + multArray[i][j];
                    char[]charString = s.toCharArray();
                    String polindromS = "";
                    for(int k = charString.length-1; k >= 0; k--){
                         polindromS += charString[k];

                    }
                    if (s.equals(polindromS)){
                        System.out.println(s + " = " + a[i] +" * " + b[j]);
                    }
                    }
                }
        return multArray;
    }
}
