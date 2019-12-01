package com.education.l6;

import org.junit.*;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @BeforeClass
    public static void globalInit() {

    }

    @AfterClass
    public static void globalCleanUp() {

    }

    @Before
    public void init() {
        System.out.println("haha");
    }

    @After
    public void cleanUp() {
        System.out.println("By");
    }

    // actual expected
    @Test
    public void testGetNumberByDigitStringR() {
        int[] array = {4, 111, 4523};

        Main main = new Main();
        assertEquals(2, main.getNumberByDigitStringR(array));
    }

    @Test
    public void testGetNumberByDigit() {
        int[] array = {45, 216, 324};
        Main main = new Main();
        assertEquals(2, main.getNumberByDigit(array));
    }

    @Test(expected = AssertionError.class)
    public void testGetNumberByDigitException() {
        int[] array = {45, 216, 324};
        Main main = new Main();
        assertEquals(3, main.getNumberByDigit(array));
    }

    @Test(timeout = 10000)
    public void testGetNumberByDigitLoad() {
        Random random = new Random();
        random.setSeed(10);

        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 1;
        }
        Main main = new Main();
        main.getNumberByDigit(array);
    }

    @Test(timeout = 3000)
    public void testGetNumberByStringRLoad() {
        Random random = new Random();
        random.setSeed(10);

        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000) + 1;
        }
        Main main = new Main();
        main.getNumberByDigit(array);
    }
}
