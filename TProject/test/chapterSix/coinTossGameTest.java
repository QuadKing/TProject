package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class coinTossGameTest {

    private CoinTossGame coinTossGame;

    @BeforeEach
    public void startWith(){
        coinTossGame = new CoinTossGame();
    }

    @Test
    public void testThatGameExists(){
        CoinTossGame coinTossGame = new CoinTossGame();
        assertNotNull(coinTossGame);

    }
    @Test
    void testMenuOption(){
        coinTossGame.getGameMenu();
    }
}
