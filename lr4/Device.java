package lr4;

abstract class Device implements DeviceInfo, UpdateBasicDeviceInfo {
    private String name;
    private int warrantyPeriod;

    public Device(String name) {
        this(name, 12);
    }

    public Device(String name, int warrantyPeriod) {
        this.name = name;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void setBasicInfo(String name, int warranty) {
        setName(name);
        setWarrantyPeriod(warranty);
    }
}
