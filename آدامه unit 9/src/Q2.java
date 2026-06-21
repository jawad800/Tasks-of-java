class TestStock {

    public static void main(String[] args) {
        Q2 stock = new Q2("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Change Percent: " + stock.getChangePercent() + "%");
    }
}
public class Q2 {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Q2(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}

