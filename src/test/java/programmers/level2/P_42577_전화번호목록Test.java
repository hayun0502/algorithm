package programmers.level2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P_42577_전화번호목록Test {

    @Test
    void testCase1() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"119", "97674223", "1195524421"};

        assertFalse(sol.solution(phone_book));
    }

    @Test
    void testCase2() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"123", "456", "789"};

        assertTrue(sol.solution(phone_book));
    }

    @Test
    void testCase3() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"12", "123", "1235", "567", "88"};

        assertFalse(sol.solution(phone_book));
    }

    @Test
    void testCase4() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"111", "1122", "33343"};

        assertTrue(sol.solution(phone_book));
    }

    @Test
    void testCase5_singleNumber() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"5555"};

        assertTrue(sol.solution(phone_book));
    }

    @Test
    void testCase6_similarStartButNotPrefix() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"0102345", "0109999"};

        assertTrue(sol.solution(phone_book));  // 앞 3글자 같아도 prefix 아님
    }

    @Test
    void testCase7_prefixSelfCheckNotTrigger() {
        P_42577_전화번호목록 sol = new P_42577_전화번호목록();
        String[] phone_book = {"111"};

        assertTrue(sol.solution(phone_book)); // 자기 자신 prefix 검사 안 함
    }
}
