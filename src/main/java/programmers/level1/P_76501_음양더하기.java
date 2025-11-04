package programmers.level1;

/**
 * [Programmers - Level 1] 음양 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/76501
 * 풀이 날짜: 2025.11.04
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * signs 배열의 부호에 따라 absolutes의 각 값을 더하거나 빼서 총합을 계산한다.
 */
public class P_76501_음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
