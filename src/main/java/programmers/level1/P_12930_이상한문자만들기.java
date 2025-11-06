package programmers.level1;

/**
 * [Programmers - Level 1] 이상한 문자 만들기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 풀이 날짜: 2025.11.06
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 문자열을 공백 기준으로 분리하되, split(" ", -1)을 사용해 공백 개수를 그대로 유지한다.
 * 각 단어의 j번째 문자를 순회하며 짝수 인덱스는 대문자, 홀수 인덱스는 소문자로 변환한다.
 * StringBuilder를 사용해 문자열을 누적하고, 단어 처리 후 공백을 복구한다.
 */
public class P_12930_이상한문자만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for(int i = 0; i < words.length; i++){
            String word = words[i];

            for(int j = 0; j < word.length(); j++){
                char ch = word.charAt(j);

                if(j % 2 == 0){
                    answer.append(Character.toUpperCase(ch));
                }else{
                    answer.append(Character.toLowerCase(ch));
                }
            }
            if(i < words.length - 1) {
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
