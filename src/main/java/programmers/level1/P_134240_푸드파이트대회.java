package programmers.level1;

/**
 * [Programmers - Level 1] 푸드 파이트 대회
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/134240
 * 풀이 날짜: 2025.10.31
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(n)
 *
 *  - 각 음식의 개수는 공평하게 절반씩 나누어야 하므로 food[i] / 2 만큼만 사용
 *  - 왼쪽은 오름차순으로 배치하고, 물(0)을 중앙에 두고, 오른쪽은 왼쪽을 뒤집은 형태
 */
public class P_134240_푸드파이트대회 {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            int half = food[i] / 2;
            if(half > 0 ){
                left.append(String.valueOf(i).repeat(half));
            }
        }
        String right = left.reverse().toString();
        left.reverse();
        return left.append("0").append(right).toString();
    }
}
