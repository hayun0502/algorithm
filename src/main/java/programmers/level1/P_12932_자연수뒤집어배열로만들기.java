package programmers.level1;

/**
 * [Programmers - Level 1] 자연수 뒤집어 배열로 만들기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * 풀이 날짜: 2025.10.28
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(d)  // d = 숫자의 자릿수 길이
 *
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열을 반환한다.
 * 예) n = 12345 -> [5, 4, 3, 2, 1]
 */
public class P_12932_자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        int length = number.length();
        int[] answer = new int[length];

        for (int i = 0; i < length; i++) {
            answer[i] = number.charAt(length - 1 - i) - '0';
        }

        return answer;
    }
}
