package programmers.level1;

/**
 * [Programmers - Level 1] 없는 숫자 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * 풀이 날짜: 2025.10.30
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * numbers 배열에 포함되지 않은 0~9까지 숫자의 합을 반환한다.
 */
public class P_86051_없는숫자더하기 {
    public int solution(int[] numbers) {
        int total = 45;
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return total - sum;
    }
}
