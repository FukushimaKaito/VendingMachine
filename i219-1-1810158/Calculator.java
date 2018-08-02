public class Calculator {
    int total;
    int remainder;

    
    Calculator() {
        total = 0;
        remainder = -1;
    }

    public void addPayTotal(int pay) {
        total += pay;
    }

    public void addCoinTotal(int coin) {
        total += coin;
    }

    public int getTotal() {
        return total;
    }

    public int getRemainder(int price) {
        remainder = total - price;
        return remainder;
    }
}