package greatestDifferenceFinder;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray){

        if(intArray.length < 2)
            return 0;
        else{
            int max = intArray[0];
            int min = intArray[0];

            for (int a : intArray){
                if(max < a)
                    max = a;

                if(min > a)
                    min = a;
            }
            return max - min;
        }

    }
}
