package programmers.level1;

/**
 * [Programmers - Level 1] 삼총사
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/131705
 * 풀이 날짜: 2025.11.02
 * 사용 알고리즘: Brute Force (3중 반복문)
 * 시간복잡도: O(n³)
 *
 * number 배열에서 서로 다른 3명의 합이 0이 되는 경우의 수를 구한다.
 */
public class P_131705_삼총사 {
    public int solution(int[] number) {
        int count = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
