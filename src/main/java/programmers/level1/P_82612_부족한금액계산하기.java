package programmers.level1;

/**
 * [Programmers - Level 1] 부족한 금액 계산하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/82612
 * 풀이 날짜: 2025.11.04
 * 사용 알고리즘: Math (등차수열), Loop
 * 시간복잡도: O(n)
 *
 * 놀이기구를 count번 이용할 때 필요한 총 이용 금액을 계산하고,
 * 현재 가진 돈(money)과 비교하여 부족한 금액을 반환한다.
 * 부족하지 않을 경우 0을 반환한다.
 *
 * 예) price = 3, money = 20, count = 4
 * → 총 이용 금액 = 3 + 6 + 9 + 12 = 30
 * → 부족한 금액 = 30 - 20 = 10
 */
public class P_82612_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }
        return Math.max(total - money, 0);
    }
}
