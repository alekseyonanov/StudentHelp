package lr4;

public class TemperatureDevice extends Device {

    private int tMin;
    private int tMax;

    public TemperatureDevice(String name, int warrantyPeriod, int tMin, int tMax) {
        super(name, warrantyPeriod);
        this.tMax = tMax;
        this.tMin = tMin;
    }

    public TemperatureDevice(String name) {
        this(name, 12, 0, 50);
    }

    public int gettMin() {
        return tMin;
    }

    public void settMin(int tMin) {
        this.tMin = tMin;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }

    @Override
    public String getDeviceInfo() {
        return "Название: " + getName() + "\n"
                + "Гарантия: " + getWarrantyPeriod() + " мес." + "\n"
                + "Минимальная температура: " + gettMin() + " град." + "\n"
                + "Максимальная температура: " + gettMax() + " град.";
    }
}
