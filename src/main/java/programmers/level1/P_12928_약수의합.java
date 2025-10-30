package programmers.level1;

/**
 * [Programmers - Level 1] 약수의 합
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12928
 * 풀이 날짜: 2025.10.30
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(√n)
 *
 * 자연수 n이 주어졌을 때, n의 모든 약수의 합을 리턴하는 함수
 */
public class P_12928_약수의합 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }
}
