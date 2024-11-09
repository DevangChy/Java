// Print all the subsets of a set of first n natural numbers.
import java.util.*;

public class AdvanceRecursion05 {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subsets){
        if(n == 0){
            printSubset(subsets);
            return;
        }
        // add
        subsets.add(n);
        findSubsets(n-1, subsets);

        //don't add
        subsets.remove(subsets.size()-1);
        findSubsets(n-1, subsets);
    }
    public static void main(String[] args){
        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<>();
        findSubsets(n, subsets);
    }    
}
