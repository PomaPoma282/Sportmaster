package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int accumulatedAmount) {
        int result = 0;
        int bonusBlueCard = 50;
        int bonusSilverCard = 70;
        int bonusGoldCard = 100;

        if (accumulatedAmount <= 0) {
            return 0;
        }

        if (accumulatedAmount <= 15_000) {
            return purchaseAmount * bonusBlueCard / 1_000;
        }

        if (accumulatedAmount <= 150_000) {
            return purchaseAmount * bonusSilverCard / 1_000;
        }

        return purchaseAmount * bonusGoldCard / 1_000;


    }
}