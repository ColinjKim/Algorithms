import java.util.Arrays;

// chapter 2.1
// Given insertion sort:
// for j = 2 to A.length
//     key = A[j]
//     //insert A[j] into the sorted sequence A[1..j-1]
//     i=j-1
//     while i > 0 and A[i] > key  
//         A[i+1] = A[i]
//         i = i-1
//     A[i+1]=key
// Q2.1-2 rewrite the insertion sort procedure to sort into nonincreasing instead of
// non-decreasing order 
// Q2.1-3 
// Consider the searching proble:
// input: a sequence of n numbers A=(a1,a2,...,an) and a value v
// output: an index i such that v=A[i] or special value null if v does not appear in a
// write in linear search.
public class c2s1{
    public static void main(String[] args){
        int[] A = {5,3,1,4,2};
        System.out.println("original");
        print(A);
        int[] temp = Arrays.copyOf(A, A.length);
        ascendInsertion(temp);
        System.out.println("Given Insertion sort result");
        print(temp);
        temp = Arrays.copyOf(A, A.length);
        decreasingInsertion(temp);
        System.out.println("Decreasing order Q2.1-2");
        print(temp);
        linSearch(temp, 2);
    }

    public static void ascendInsertion(int[] A){
        for(int j=1; j<A.length;j++){
            int key=A[j];
            int i=j-1;
            while(i>=0 && A[i]>key){
                A[i+1]=A[i];
                i=i-1;
            }
            A[i+1]=key;
        }
    }
    //q 2.1-2
    public static void decreasingInsertion(int[] A){
        for(int j=1;j<A.length;j++){
            int key=A[j];
            int i=j-1;
            while(i>=0&&A[i]<key){
                A[i+1]=A[i];
                i=i-1;
            }
            A[i+1]=key;
        }
    }
    //q 2.1-3
    public static void linSearch(int[] A, int v){
        for(int i=0;i<A.length;i++){
            if(A[i]==v){
                System.out.println(v + " found in index: "+i);
                return;
            }
        }
        System.out.println(v+" Does Not Exist");
    }

    public static void print(int[] A){
        for(int i : A){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}