package programmers.level1;

/**
 * [Programmers - Level 1] 크기가 작은 부분 문자열
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/147355
 * 풀이 날짜: 2025.11.08
 * 사용 알고리즘: Loop
 * 시간복잡도: O(N)
 *
 * p의 길이(L) 만큼을 기준으로, t에서 길이 L짜리 부분 문자열을 왼쪽부터 하나씩 잘라간다.
 * loop 돌면서 t.substring(i, i+L) → 길이 L짜리 윈도우, 그 값이 p보다 작거나 같으면 count++
 * 모든 윈도우를 검사한 뒤 count 반환한다.
 *
 */
public class P_147355_크기가작은부분문자열 {
    public int solution(String t, String p) {
        int count = 0;
        int L = p.length();
        long pv = Long.parseLong(p); // p를 long으로 변환 (1 ≤ p의 길이 ≤ 18)

        for (int i = 0; i <= t.length() - L; i++) {
            long wv = Long.parseLong(t.substring(i, i + L)); // window 숫자
            if (wv <= pv) {
                count++;
            }
        }
        return count;
    }
}
