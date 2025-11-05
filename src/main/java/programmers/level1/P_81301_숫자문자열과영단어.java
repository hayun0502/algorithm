package programmers.level1;

/**
 * [Programmers - Level 1] 숫자 문자열과 영단어
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/81301
 * 풀이 날짜: 2025.11.05
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 배열에 0~9를 담은 후,
 * 배열 인덱스와 문자열(숫자)가 동일한 것을 이용하여 치환한다.
 */
public class P_81301_숫자문자열과영단어 {
    public int solution(String s) {
        String[] numbers = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i< numbers.length; i++){
            s = s.replace(numbers[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
