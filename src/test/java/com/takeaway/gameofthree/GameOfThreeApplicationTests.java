package com.takeaway.gameofthree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = GameOfThreeApplication.class)
public class GameOfThreeApplicationTests {

    @Test
    public void contextLoads() {
        assertTrue(true);
    }

}
