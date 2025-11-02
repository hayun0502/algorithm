package programmers.level1;

/**
 * [Programmers - Level 1] 콜라문제
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/132267
 * 풀이 날짜: 2025.11.02
 * 사용 알고리즘: Loop
 * 시간복잡도: O(log n)
 *
 * 설명:
 *  - 빈 병 a개를 가져가면 콜라 b병을 받는다.
 *  - 받은 콜라를 마시면 다시 빈 병이 생긴다.
 *  - 상빈이가 가지고 있는 빈 병이 n개일 때, 받을 수 있는 콜라의 총 개수를 반환한다.
 *
 * 예시:
 *  a = 2, b = 1, n = 20 → 19
 *  a = 3, b = 1, n = 20 → 9
 */
public class P_132267_콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int empty = n;

        while (empty >= a) {
            int exchanged = (empty / a) * b; // 교환한 콜라수
            answer += exchanged;
            empty = exchanged + (empty % a); // 교환해서 받은 콜라 빈병+ 남은 빈병
        }
        return answer;
    }
}
