package com.example.jacoco;

import static org.junit.Assert.*;

import java.lang.ref.PhantomReference;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO
 * Created by BoQin on 2021/12/27.
 * Modified by BoQin
 *
 * @author BoQin
 * @Version
 */
public class JojoDemoTest {

    private static JojoDemo mJojoDemo;

    @BeforeClass
    public static void beforeClass() throws Exception {
        mJojoDemo = new JojoDemo();
    }

    @Test
    public void getName() {
        assertEquals(mJojoDemo.getName(),"JOJO");
    }

    @Test
    public void dos() {
    }
}