package programmers.level1;

/**
 * [Programmers - Level 1] 나머지가 1이 되는 수 찾기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * 풀이 날짜: 2025.10.29
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(n)
 *
 * 자연수 n를 나눴을 때 나머지가 1인 제일 작은 수 찾기
 * 예) n = 10 -> 3
 */
public class P_87389_나머지가1이되는수찾기 {
    public int solution(int n) {
        for(int i = 1; i < n; i++){
            if(n % i == 1){
                return i;
            }
        }
        return -1;
    }
}
