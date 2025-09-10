import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
        // replace "return null" with your code:
        List<Integer> duplicates = new ArrayList<>();

        for(int i=0; i<l.size(); i++){
            int current = l.get(i);
            for(int j=i+1; j<l.size(); j++){
                if(current == l.get(j) && !duplicates.contains(current)){
                    duplicates.add(current);
                    break;
                }
            }
        }

        return duplicates;
       
    }

    public static List<Integer> findDuplicatesHashMap(List<Integer> nums){
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : nums){
            if(map.containsKey(num)){
                duplicates.add(num);
            }else{
                map.put(num,1);
            }
        }

        return new ArrayList<>(duplicates);
    }



    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));

        System.out.println("Sample 1: " + findDuplicatesHashMap(sample1));
        System.out.println("Sample 2: " + findDuplicatesHashMap(sample2));
        System.out.println("Sample 3: " + findDuplicatesHashMap(sample3));
        System.out.println("Sample 4: " + findDuplicatesHashMap(sample4));
    }

}
