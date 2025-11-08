package programmers.level1;

/**
 * [Programmers - Level 1] 신규 아이디 추천
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/72410
 * 풀이 날짜: 2025.11.08
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 문자열을 공백 기준으로 분리하되, split(" ", -1)을 사용해 공백 개수를 그대로 유지한다.
 * 각 단어의 j번째 문자를 순회하며 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환한다.
 * StringBuilder를 사용해 문자열을 누적하고, 단어 처리 후 공백을 복구한다.
 */
public class P_72410_신규아이디추천 {
    public String solution(String new_id) {
        // 1. 소문자
        String str = new_id.toLowerCase();

        // 2~3. 허용문자만 남기고, 연속 '.'을 하나로
        StringBuilder sb = new StringBuilder();
        boolean prevDot = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean allowed = (ch >= 'a' && ch <= 'z')      // 소문자
                    || (ch >= '0' && ch <= '9')             // 숫자
                    || ch == '-' || ch == '_' || ch == '.'; // 특수문자
            if (!allowed) continue;

            if (ch == '.') {
                if (prevDot) continue;   // 연속 점이면 건너뛰기
                prevDot = true;
                sb.append('.');
            } else {
                prevDot = false;
                sb.append(ch);
            }
        }
        String answer = sb.toString();

        // 4. 앞/뒤 '.' 제거
        if(answer.startsWith(".")){
            answer = answer.substring(1);
        }

        if(answer.endsWith(".")){
            answer = answer.substring(0, answer.length() - 1);
        }

        // 5. 빈 문자열이면 "a"
        if (answer.isEmpty()){
            answer = "a";
        }

        // 6. 길이 16 이상이면 15로 자르고, 끝 '.' 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7. 길이 2 이하이면 마지막 문자 반복해 길이 3 만들기
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
