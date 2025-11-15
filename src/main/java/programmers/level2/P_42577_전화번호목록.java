package programmers.level2;

import java.util.*;

/**
 * [Programmers - Level 2] 전화번호 목록
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * 풀이 날짜: 2025.11.15
 * 사용 알고리즘: HashSet, Loop
 * 시간복잡도: O(N)
 *
 * 1. 모든 전화번호를 HashSet에 저장한다. (존재 여부를 O(1)에 확인하기 위함)
 * 2. 각 번호 s에 대해, s의 길이보다 짧은 모든 접두사(prefix)를 잘라서 만든 뒤
 *      그 접두사가 Set 안에 존재하는지 검사한다.
 *      - prefix가 존재한다면 → 어떤 번호가 다른 번호의 앞부분이라는 뜻이므로 false 반환.
 * 3. 모든 번호를 검사했는데 접두사 충돌이 없다면 true 반환.
 *
 */
public class P_42577_전화번호목록 {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

        for(String s : phone_book){
            set.add(s);
        }

        for(String s : phone_book){
            for(int i = 1; i < s.length(); i++){
                String prefix = s.substring(0, i);

                if(set.contains(prefix)){
                    return false;
                }
            }
        }

        /* 배열 정렬을 이용하여 풀이하기 */
//        Arrays.sort(phone_book);
//
//        for(int i = 0; i < phone_book.length - 1; i++){
//            if(phone_book[i].startsWith(phone_book[i])){
//                return false;
//            }
//        }

        return true;
    }
}
