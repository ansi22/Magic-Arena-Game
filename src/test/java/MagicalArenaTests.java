import com.ritika.entities.Dice;
import com.ritika.entities.Player;
import com.ritika.service.MagicalArenaService;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagicalArenaTests {
    @Test
    public void testExcessDamage() {
        Player player = new Player(100, 40, 20);
        player.excessDamage(30);
        assertEquals(70, player.getHealth());
    }

    @Test
    public void testDiceRoll() {
        Dice dice = new Dice();
        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void testMagicalArenaGame() {
        Player player1 = new Player(100, 20, 10);
        Player player2 = new Player(90, 25, 12);

        MagicalArenaService magicalArena = new MagicalArenaService(player1, player2);
        magicalArena.PlayGame();

        assertTrue(player1.getHealth() == 0 || player2.getHealth() == 0);
    }
}
