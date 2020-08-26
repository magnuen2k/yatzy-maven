package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    public void shouldScoreOnes(){
        assertEquals(5, new Yatzygame().score("ONES", new int[] {1, 1, 1, 1, 1,}));
        assertEquals(3, new Yatzygame().score("ONES", new int[] {1, 2, 3, 1, 1,}));
    }

    @Test
    public void shouldScoreTwos(){
        assertEquals(10, new Yatzygame().score("TWOS", new int[] {2, 2, 2, 2, 2,}));
        assertEquals(4, new Yatzygame().score("TWOS", new int[] {1, 2, 3, 1, 2,}));
    }

    @Test
    public void shouldScoreThrees(){
        assertEquals(15, new Yatzygame().score("THREES", new int[] {3, 3, 3, 3, 3}));
        assertEquals(6, new Yatzygame().score("THREES", new int[] {1, 3, 3, 1, 2,}));
    }

    @Test
    public void shouldScorePair(){
        assertEquals(4, new Yatzygame().score("PAIR", new int[] {1, 2, 2, 3, 4}));
    }
}
