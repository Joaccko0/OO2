package refactoring.ejercicio5;

public class AirTicket extends Product{

    public class AirlineFly {
        public int price(){ return 1; }
        public int promotionRate(){ return 1; }
    }

    private AirlineFly fly;

    @Override
    public double price() {
        return fly.price() * fly.promotionRate();
    }
}
