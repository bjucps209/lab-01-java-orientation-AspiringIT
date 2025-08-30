package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void testFailGrade() {
        int grade = 38;
        int result = Grader.NoRoundGrade(grade);
        assertEquals(38, result, "Grade of 38 should NOT round up to 40 as it is a failing score");
    }

    @Test
    void testRoundGrade() {
        int grade = 88;
        int result = Grader.roundGrade(grade);
        assertEquals(90, result, "Grade of 87 SHOULD round up to 90 as it the next multiple of 5 is less than 3")
    }

    @Test
    void testNoRoundGrade() {
        int grade = 76;
        int result = Grader.NoRoundGrade(grade);
        assertEquals(76, result, "Grade of 76 SHOULD NOT round as it is more than 3 from a multiple of 5");
    }

}



