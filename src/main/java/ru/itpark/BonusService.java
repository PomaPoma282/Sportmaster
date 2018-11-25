package ru.itpark;

public class BonusService {
    public int calculateBonus(int purchaseAmount, int accumulatedAmount) {
        int result = 0;
        int bonusBlueCard = 50;
        int bonusSilverCard = 70;
        int bonusGoldCard = 100;

        if (accumulatedAmount == 0){
            result = 0;
        } else if (accumulatedAmount >= 1 && accumulatedAmount <= 15_000) {
            result = purchaseAmount * bonusBlueCard / 1_000;
        } else if (accumulatedAmount >= 15_001 && accumulatedAmount <= 150_000) {
            result = purchaseAmount * bonusSilverCard / 1_000;
        } else {
            result = purchaseAmount * bonusGoldCard / 1_000;
        }
        // Ctrl + Alt + L - выравнивание
        return result;
    }
}
