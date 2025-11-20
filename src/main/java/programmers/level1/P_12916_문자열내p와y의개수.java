package programmers.level1;

import java.util.ArrayList;

/**
 * [Programmers - Level 1] 문자열 내 p와 y의 개수
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 풀이 날짜: 2025.11.20
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 대문자, 소문자 구분없이 p와 y의 개수를 비교해야하기 때문에
 * toUpperCase를 이용하여 모두 대문자로 변경한 후 p와 y의 개수를 count한다.
 *
 */
public class P_12916_문자열내p와y의개수 {
    boolean solution(String s) {
        s = s.toUpperCase();
        int p = 0;
        int y = 0;

        for(char c : s.toCharArray()){
            if(c == 'P') p++;
            else if(c == 'Y') y++;
        }

        return p == y;
    }
}
