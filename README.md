# 🧠 Algorithm Solutions (Java)

> 꾸준한 문제 풀이로 사고력과 구현력을 다듬는 공간입니다.  
> **주 언어:** Java 21  
> **보조 언어:** Python 3 (README 자동 업데이트 및 유틸 스크립트용)  
> **목표:** Programmers → BOJ → LeetCode 단계별 확장  
> **환경:** IntelliJ IDEA + Gradle + JUnit5

---

## 📂 Folder Structure

```
src/
 ├── main/
 │   └── java/
 │       ├── programmers/
 │       │   ├── level1/
 │       │   ├── level2/
 │       │   └── level3/
 │       ├── boj/
 │       │   ├── silver/
 │       │   └── gold/
 │       └── leetcode/
 │           ├── easy/
 │           └── medium/
 └── test/
     └── java/
         └── programmers/
             └── level1/
```

> 📌 **Naming Rule**
> - `P_` = Programmers, `B_` = BOJ, `L_` = LeetCode
> - `[문제번호]_[문제명].java` 형식
> - 각 파일 상단에 문제 링크, 사용 알고리즘, 시간복잡도 주석 기재
> - 테스트 코드는 동일한 패키지 경로 하위에 `*Test.java` 로 작성
---

## 🧩 Problem Comment Template

```java
/**
 * [Programmers - Level 2] 기능개발
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42586
 * 풀이 날짜: 2025.10.27
 * 사용 알고리즘: Queue, Simulation
 * 시간복잡도: O(N)
 */
```

---

## 🧾 Commit Convention

| 타입 | 설명 | 예시 |
|------|------|------|
| ✨ `solve:` | 새 문제 풀이 추가 | `solve: [Programmers] 기능개발 (Level 2)` |
| 🧩 `refactor:` | 코드 개선 | `refactor: [BOJ] 1920 수찾기 - 이진탐색 적용` |
| 🐛 `fix:` | 버그 수정 | `fix: [Programmers] 문자열 내 p와 y의 개수` |
| 📝 `docs:` | 문서 / README 수정 | `docs: README에 문제 목록 추가` |
| 🚚 `chore:` | 폴더 이동, 설정 변경 | `chore: 폴더 구조 정리` |

---

## 🗓️ Solving Goals
- [x] 하루 1문제 이상 풀이
- [x] 각 풀이마다 시간복잡도 기록
- [ ] Programmers Lv.3 → BOJ Gold 단계 진입
- [ ] Python 보조 풀이 확장

---

## 🧮 Solved Topics

| 분류 | 문제 수 |
|------|------|
| 구현 | 28    |
| 문자열 | 10    |
| DFS/BFS | 0    |
| 스택/큐 | 2    |
| DP | 0    |
| 정렬 | 0    |

---

## 🔗 Problem Links
| 플랫폼 | 문제 | 레벨 | 링크 |
|---------|------|------|------|
| Programmers | 자릿수더하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12931) |
| Programmers | 자연수 뒤집어 배열로 만들기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12932) |
| Programmers | 짝수와 홀수 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12937) |
| Programmers | 나머지가 1이 되는 수 찾기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/87389) |
| Programmers | 문자열을 정수로 바꾸기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12925) |
| Programmers | 약수의 합 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12928) |
| Programmers | 서울에서 김서방 찾기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12919) |
| Programmers | 없는 숫자 더하기 | :Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/86051) |
| Programmers | 가운데 글자 가져오기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12903) |
| Programmers | 수박수박수박수박수박수? | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12922) |
| Programmers | 푸드 파이트 대회 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/134240) |
| Programmers | 같은 숫자는 싫어 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12906) |
| Programmers | 삼총사 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/131705) |
| Programmers | 콜라문제 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/132267) |
| Programmers | 약수의 개수와 덧셈 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/77884) |
| Programmers | 음양 구하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/76501) |
| Programmers | 부족한 금액 계산하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/82612) |
| Programmers | 문자열 내림차순으로 배치하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12917) |
| Programmers | 숫자 문자열과 영단어 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/81301) |
| Programmers | 문자열 다루기 기본 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12918) |
| Programmers | 추억 점수 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/176963) |
| Programmers | 이상한 문자 만들기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12930) |
| Programmers | 가장 가까운 같은 글자 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/142086) |
| Programmers | 크기가 작은 부분문자열 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/147355) |
| Programmers | 신규 아이디 추천 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/72410) |
| Programmers | K번째수 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/42748) |
| Programmers | 예산 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12982) |
| Programmers | 최소직사각형 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/86491) |
| Programmers | 행렬의 덧셈 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12950) |
| Programmers | 폰켓몬 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/1845) |
| Programmers | 두 개 뽑아서 더하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/68644) |
| Programmers | 문자열 내 마음대로 정렬하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12915) |
| Programmers | 전화번호 목록 | Lv.2 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/42577) |
| Programmers | 최댓값과 최솟값 | Lv.2 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12939) |
| Programmers | 올바른 괄호 | Lv.2 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/42577) |
| Programmers | 나누어 떨어지는 숫자 배열 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12910) |
| Programmers | 문자열 내 p와 y의 개수 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12916) |
| Programmers | 두 정수 사이의 합 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12912) |
| Programmers | 정수 내림차순으로 배치하기 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/12933) |
| Programmers | 카드 뭉치 | Lv.1 | [바로가기](https://school.programmers.co.kr/learn/courses/30/lessons/159994) |
> 💡 `add_problem.py` 스크립트를 실행하면 새 문제 정보가 이 표에 자동으로 추가됩니다.
> ```
> python add_problem.py
> ```

---

## ⚙️ Tools & Environment
- Java 21 (main)
- Python 3.0 (optional: README 자동 업데이트 스크립트)
- IntelliJ IDEA (개발 환경)
- **Gradle**: 빌드 & 의존성 관리
- **JUnit5**: 문제별 solution() 단위 테스트

---

## 🧰 Example Test (JUnit5)

```java
package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12944_평균구하기Test {

    @Test
    void testSolution() {
        P_12944_평균구하기 s = new P_12944_평균구하기();
        assertEquals(2.5, s.solution(new int[]{1, 2, 3, 4}));
        assertEquals(5.3333333333, s.solution(new int[]{5, 5, 6}), 0.0001);
    }
}
```

---

## 📈 꾸준함을 기록하기

- [BaekjoonHub](https://github.com/BaekjoonHub/BaekjoonHub): 백준/프로그래머스 자동 업로드
- [GitHub Readme Stats](https://github.com/anuraghazra/github-readme-stats): 언어 비율 및 커밋 기록 시각화
- [Streak Stats](https://github.com/denvercoder1/github-readme-streak-stats): 연속 커밋 현황 표시
- [GitHub Activity Graph](https://github.com/Ashutosh00710/github-readme-activity-graph): 커밋 활동 시각화
---

## ✨ Motivation
> 단순히 문제를 푸는 게 아니라,  
> **문제 해결력과 코드 품질을 함께 성장시키는 기록**을 남깁니다.  
> 꾸준히 푼다는 건 결국 꾸준히 성장한다는 것.
