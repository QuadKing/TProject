package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3PlayerTest {

    Mp3Player QPlayer;

    @BeforeEach
    void startWith() { QPlayer = new Mp3Player();}

    @Test
    public void playerTest(){
        //given that there is a music player
      /*  Mp3Player QPlayer = new Mp3Player(); */
        //Assert that the music player is off by default
        assertFalse(QPlayer.isOn());
        //when I click the QPlayer icon, it opens, &
        // Assert that the music player come on or opens up
        QPlayer.clickOn();
        assertTrue(QPlayer.isOn());
    }


}
