package web.model;

public class Car {

    private String model;
    private int year;
    private int enginePower;

    public Car(String model, int year, int enginePower) {
        this.model = model;
        this.year = year;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", enginePower=" + enginePower +
                '}';
    }
}


