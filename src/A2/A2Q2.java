
import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class A2Q2 {
    public static void main(String[] args) {
        float sum = 0, average, mode, median, max = 0;
//        float[] arr1 = new float[args.length];
        ArrayList <Float>  arr = new ArrayList<>();
        //Put all input into arr1
        for (int i = 0; i < args.length; i++) {


            float n = Float.parseFloat(args[i]);

//            arr1[i] = n;
            arr.add(n);
            sum += n;
        }
        arr.sort(Float::compareTo);
        Float []arr1 = new Float[arr.size()];
        for (int i=0;i<arr.size();i++)
            arr1[i]=arr.get(i);

//        average = sum / arr1.length;
        average = sum / arr.size();
        System.out.printf("%.2f\n", average);
//        Arrays.sort(arr1);

        //reline arr1 by bubble sorting
//        for (int j = 0; j < arr1.length - 1; j++) {
//            for (int i = 0; i < arr1.length - 1; i++) {
//                if (arr1[i] > arr1[i + 1]) {
//                    temp = arr1[i];
//                    arr1[i] = arr1[i + 1];
//                    arr1[i + 1] = temp;
//                }
//            }
//        }
        //Find median
//        if ((arr1.length) / 2 != (float) (arr1.length) / 2)
//            median = arr1[(arr1.length) / 2 - 1];
//        else
//            median = (arr1[(arr1.length) / 2 - 1] + arr1[(arr1.length) / 2]) / 2;
        if ((arr.size()) % 2 != 0)
            median = arr.get((arr.size()) / 2 - 1);
        else
            median = (arr.get((arr.size()) / 2 - 1) + arr.get((arr.size()) / 2)) / 2;

        //Set arr2 to find the frequency of every number
        float[][] arr2 = new float[2][arr.size()];
        arr2[0][0] = arr1[0];
        arr2[1][0] = 0;
        int k = 0, l = 0;
        //input numbers in arr1 into arr2
        while (k < arr.size()) {
            if (arr1[k] == arr2[0][l])
                arr2[1][l]++;
            else {
                l++;
                arr2[0][l] = arr1[k];
                arr2[1][l]++;
            }
            k++;
        }
        //find the largest number of frequency
        for (k = 0; k < arr2[1].length - 1; k++) {
            if (arr2[1][k] >= max)
                max = arr2[1][k];
        }
        //compare each frequency with the max
        for (k = 0; k <= arr2[1].length - 1; k++) {
            if (arr2[1][k] == max) {
                mode = arr2[0][k];
                System.out.printf("%.2f ", mode);
//                System.out.printf("%s ", Float.toString(arr2[0][k]));
            }
        }
        System.out.printf("\n%.2f", median);
    }
//        System.out.println("print ctrl+z to stop");
//        Scanner in = new Scanner(System.in);
//        ArrayList<Integer> x = new ArrayList<>();
//        for (int i = 0; in.hasNext() && i < 100; i++)
//            x.add(in.nextInt());
//        in.close();
//        int[] y = new int[x.size()];
//        for (int i = 0; i < x.size(); i++) // ArrayList to int[]
//            y[i] = x.get(i);
//        System.out.println("Arrays:"+Arrays.toString(y));
//        Arrays.sort(y);
//        System.out.println("mode:"+ Arrays.toString(mode(y)).substring(1,Arrays.toString(mode(y)).length()-1));
//        System.out.println("median:"+ median(y));
//        System.out.println("average:"+average(y));
//    }
//    public static double average(int[] x){
//        double sum=0;
//        for(int i:x){
//            sum+=i;
//        }
//        return sum/x.length;
//    }
//    public static double median(int x[]){
//        if(x.length%2 == 0){
//            return ((double)x[x.length/2]+(double)x[x.length/2-1])/2;
//        }
//        else
//            return (double)x[(x.length-1)/2];
//    }
//    public static int[] mode(int x[]){
//        int x1[][] = new int[2][x.length];
//        int k = x[0];
//        for (int i = 0,j = 0;i < x.length;i++){
//            k = x[i];
//            if(i==0){
//                x1[0][j]=k;
//                x1[1][j]=1;
//            }
//            else if(k==x1[0][j]){
//                x1[1][j]++;
//            }
//            else if(k!=x1[0][j]){
//                j++;
//                x1[0][j] = k;
//                x1[1][j] = 1;
//            }
//        }
//        int[] x2 = new int[x.length];
//        System.arraycopy(x1[1],0,x2,0,x1.length);
//        Arrays.sort(x2);
//        int t = x2[x.length-1];
//        int w = 0;
//        for (int r=0;r<x.length;r++){
//            if(x1[1][r] == t && x1[0][r] != 0){
//                w++;
//            }
//        }
//        int[] x3 = new int[w];
//        int u = 0;
//        for (int r=0;r<x.length;r++){
//            if(x1[1][r] == t && x1[0][r] != 0){
//                x3[u] = x1[0][r];
//                u++;
//            }
//        }
//        return x3;
//    }
}
