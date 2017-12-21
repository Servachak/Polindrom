import java.util.Arrays;

/**
 * Created by adavi on 20.12.2017.
 */
public class Main {
    public static void main(String[] args) {

        SimpleNumbers simpleNumbers = new SimpleNumbers();

        BuildMultiplicationArray buildMultiplicationArray = new BuildMultiplicationArray();
        int [] arrayOne = simpleNumbers.createSimpleNumbers(5);

        int [] arrayTwo = simpleNumbers.createSimpleNumbers(5);

       long [][] multiplicationArray =  buildMultiplicationArray.multiplication(arrayOne,arrayTwo);

        System.out.println();
        for (int i = 0; i < multiplicationArray.length; i++){
           for (int j = 0; j < multiplicationArray.length; j++){
               System.out.print(multiplicationArray[i][j]+ " ");
           }
            System.out.println();
        }




    }
}
