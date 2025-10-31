package programmers.level1;

/**
 * [Programmers - Level 1] 수박수박수박수박수박수?
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12922
 * 풀이 날짜: 2025.10.31
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(n)
 *
 * 인덱스가 짝수인지, 홀수인지 판단하여 짝수일 경우 "수", 홀수일 경우 "박"
 */
public class P_12922_수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i % 2 == 0 ){
                sb.append("수");
            }else{
                sb.append("박");
            }
        }
        return sb.toString();
    }
}
