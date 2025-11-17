package programmers.level2;

import java.util.Stack;

/**
 * [Programmers - Level 2] 올바른 괄호
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * 풀이 날짜: 2025.11.17
 * 사용 알고리즘: Stack, Loop
 * 시간복잡도: O(N)
 *
 * 해당 인덱스의 문자가 '('일 때, stack 에 push, 아닐 때 pop
 * 중간에 '(' 해당 문자를 pop 하려고 했는데 비어있다면 false를 반환하고
 * 끝날 때 stack이 모두 비어있으면 짝이 맞는 괄호이니 true를 반환한다.
 *
 */
public class P_12909_올바른괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
