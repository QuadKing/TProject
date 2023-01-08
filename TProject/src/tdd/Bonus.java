package tdd;

public class Bonus {
    public int amount(int amount) {
       double bonus = 0;

        if (amount >= 0 && amount <= 49){
            return 0;
        }
        if (amount >= 50 && amount<= 59){
            return (int) ((bonus / 100.0) * 100) * 200;
        }

        if (amount >= 60 && amount <= 69){
            return (int) ((bonus / 100.0) * 100) * 250;
        }

        if (amount >= 70){
            return (int) ((bonus / 100.0) * 100) * 500;
        }
        return (int) bonus;
    }
    public double bonus(int amount) {
        return amount;
    }


}
