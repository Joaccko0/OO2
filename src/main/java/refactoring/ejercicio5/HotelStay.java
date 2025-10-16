package refactoring.ejercicio5;

public class HotelStay extends Product{

    public class Hotel {
        public int nightPrice(){ return 1; }
        public int discountRate(){ return 1; }
    }

    private Hotel hotel;

    @Override
    public double price() {
        return tripPeriod.duration() * hotel.nightPrice() * hotel.discountRate();
    }

}
