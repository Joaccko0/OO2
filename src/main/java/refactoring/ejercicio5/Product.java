package refactoring.ejercicio5;

import java.util.Date;

public abstract class Product {

    public class TimePeriod {
        int start;
        int end;
        TimePeriod(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public int duration(){ return 1; };
    }

    protected double cost;
    protected TimePeriod tripPeriod;

    public int startDate() {
        return tripPeriod.start;
    }
    
    public int endDate() {
        return tripPeriod.end;
    }

    public abstract double price();
}
