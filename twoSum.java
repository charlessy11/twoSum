import java.util.*;

public class twoSum {
    //method that checks the sum of any two values in the array
    private static int[] twoSum(int[] sum, int target){
        //hash map algorithm for key/value pairing
        Map<Integer, Integer> numMap = new HashMap<>();
        //iterate through array
        for (int i = 0; i < sum.length; i++){
            //variable that stores complementary value needed to achieve target num
            int comp = target - sum[i];
            //check if 'comp' is present in array
            if (numMap.containsKey(comp)){
                //check if 'comp' equals first value(i)
                if (comp == sum[i]){
                    //if so, return {-1,-1} bec num isn't allowed to be used twice
                    return new int[] {-1,-1};
                }
                //if so, return indices of 'comp' and i
                return new int[] {numMap.get(comp), i};
            } else{
                //associates the specified value w/ specified key in this map
                numMap.put(sum[i],i);
            }
        }
        //no match found in array
        return new int[]{};
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //ask user for num of elems they want in array
        System.out.println("Enter number of elements for the array:");
        //store input
        int input = scan.nextInt();
        //assign array to length of input
        int[] sum = new int[input];
        //ask user for values to be placed in array
        System.out.println("Enter array of numbers:");
        //store all values being inputted in array
        for(int i = 0; i < input; i++){
            sum[i] = scan.nextInt();
            }
        //ask user for target num
        System.out.println("Enter target number:");
        //store target num
        int target = scan.nextInt();
        //array that is assigned to 'twoSum' method
        int[] indices = twoSum(sum, target);
            //check if 'indices' array has 2 elems inside
            if (indices.length == 2){
                //if so, display the indices
                System.out.println("The two indices that sum up to "+target+" are:");
                System.out.println("["+indices[0]+", "+indices[1]+"]");
              //display "no solution"
            } else{
                System.out.println("No solution");
            }
    }
}
