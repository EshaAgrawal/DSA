

/* Given two arrays A[] and B[] consisting of m and n integers.
   The task is to check whether the array B[] is a subarray of the array A[] or not.
 */

public class Main {

    public static int subArray(int[] A, int[] B){

        for(int i=0; i< B.length ; i++){
            for(int j = 0; j< A.length ; j++){
                if(A[j] == B[i]){
                    break;
                }
                if(j==A.length)
                    return -1;
                }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {4,5};
        subArray(A,B);
    }
}