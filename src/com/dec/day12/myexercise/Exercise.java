package com.dec.day12.myexercise;

import java.util.StringTokenizer;

public class Exercise {
	public static void main(String[] args) {
		Solution s = new Solution();
		
		String[] sss = s.solution("i love you");
		for(String ss : sss ) {
			System.out.println(ss);
		}
	}
}

class Solution {
    public String[] solution(String my_string) {
        
        StringTokenizer st = new StringTokenizer(my_string," ");
        String[] answer = new String[st.countTokens()];
        for(int i=0; i<answer.length; i++){
            answer[i] = st.nextToken();
        }

        return answer;
    }
}