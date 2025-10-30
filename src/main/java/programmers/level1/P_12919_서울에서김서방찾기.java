package programmers.level1;

/**
 * [Programmers - Level 1] 서울에서 김서방 찾기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12919
 * 풀이 날짜: 2025.10.30
 * 사용 알고리즘: Loop, String
 * 시간복잡도: O(n)
 *
 * String 배열 seoul에서 "Kim"의 위치(index)를 찾아
 * "김서방은 X에 있다" 형태로 반환한다.
 */
public class P_12919_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }
        return "";
    }
}
