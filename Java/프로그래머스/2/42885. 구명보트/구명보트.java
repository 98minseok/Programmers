import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 1;
        Arrays.sort(people);
        int sum = 0;
        int i = 0;
        for(int j = people.length - 1 ; j > i ; j --){
            if(people[i] + people[j] <= limit) i++;
        }
        return people.length - i;
    }
}