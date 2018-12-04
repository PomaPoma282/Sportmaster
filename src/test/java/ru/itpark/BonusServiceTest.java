package ru.itpark;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    @DisplayName("Should calculate bonus")
    void calculateBonus() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(2_000, 2_000);

            assertEquals(100, bonus);
        }
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(2_000, 20_000);

            assertEquals(140, bonus);
        }
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(2_000, 200_000);

            assertEquals(200, bonus);
        }
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(2_000, 0);

            assertEquals(0, bonus);
        }
    }
}