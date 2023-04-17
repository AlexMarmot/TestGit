import java.util.Objects;

public class Flight {

    private String number;
    private String airport;
    private String companyName;
    private String arrival;
    private String time;
    private int cost;


    public String getNumber() {
        return number;
    }

    public boolean setNumber(String number) {
        if (number.matches("[A-ZА-Я]{2}\\d{4}")) {
            this.number = number;
            return true;
        } else {
            System.out.println("Некорректно");
            return false;
        }
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getTime() {
        return time;
    }

    public boolean setTime(String time) {
        if (time.matches("[0-2]\\d:[0-5]\\d")) {
            this.time = time;
            return true;
        } else {
            System.out.println("Некорректно");
            return false;
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(number, flight.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Номер рейса: " + getNumber() + "\n Наименование аэропорта: " + getAirport() +
                "\n Наименование компании: " + getCompanyName() + "\n Пункт назначения: " + getArrival() +
                "\n Время рейса: " + getTime() + "\n Стоимость: " + getCost() + "\n";
    }
}
