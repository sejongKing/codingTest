import java.io.BufferedReader;



import java.io.BufferedWriter;
import java.lang.reflect.Array;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.IOException;

import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            q.add((100 - progresses[i]) % speeds[i] == 0 ?
                    (100 - progresses[i]) / speeds[i] :
                    (100 - progresses[i]) / speeds[i] + 1);
        }

        int prev = q.poll();
        int funcNum = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (prev >= cur) {
                funcNum++;
            }else{
                arr.add(funcNum);
                prev = cur;
                funcNum = 1;
            }
        }
        arr.add(funcNum);
        answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        //System.out.println(Main.class);
        //System.out.println(Solution.class   );
//        Solution s = new Solution();
//        String[] str = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//        int[] arr = {2,3,4};
//        String[] ans = s.solution(str, arr);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }
        
        double n = 123.77;
        System.out.println("n = " + (int)n);
    }
}



















