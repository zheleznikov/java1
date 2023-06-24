package org.example.class4.hw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProblemsSolving {

    Problems problems;

    @BeforeAll
    public void setup() {
        problems = new ProblemsSolving();
    }

    @Test
    public void testShouldGetMaxNumberInArray() {
        int [] arr = new int[]{10, 14, 20};

        int expected = 20;
        int actual = problems.getMaxNumber(arr);

        assertEquals(expected, actual, "should get max correctly");
    }
}
