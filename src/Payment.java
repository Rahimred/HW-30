import java.time.LocalDateTime;

public class Payment {
    private Car car;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private int minutes;
    private final double pricePerMinute = 0.1;
    private double total;
    public Payment(Car car, LocalDateTime checkInTime, LocalDateTime checkOutTime, int minutes) {
        this.car = car;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.minutes = minutes;
        total = this.minutes * pricePerMinute;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDateTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDateTime checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public String toString() {
        return  "Машина с номером: " + car +
                ", заехала в " + checkInTime +
                ", выехала в " + checkOutTime +
                ", минуты на парковке: " + minutes +
                ", стоимость за парковку: " + total;
    }
}
