package com.hht.builderdesigndemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_builder(){
        Computer computer = new ComputerBuilder().setDisplayer("联想").setKeyboard("飞利浦").setKeyboard("双飞燕").setMouse
                ("扬天").create();
        computer.show();
    }
}