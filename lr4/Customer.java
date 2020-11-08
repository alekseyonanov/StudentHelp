package lr4;

public class Customer {
    private String name;
    private String address;
    private int orderedDevicesQuantity;

    public Customer(String name, String address, int orderedDevicesQuantity) {
        this.name = name;
        this.address = address;
        this.orderedDevicesQuantity = orderedDevicesQuantity;
    }

    public Customer() {
        this("Тест", "Тест", 0);
    }

    public Customer(String name) {
        this(name, "", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderedDevicesQuantity() {
        return orderedDevicesQuantity;
    }

    public void setOrderedDevicesQuantity(int orderedDevicesQuantity) {
        this.orderedDevicesQuantity = orderedDevicesQuantity;
    }

    @Override
    public String toString() {
        return "\tИмя: " + getName() + "\n"
                + "\tАдрес: " + getAddress() + "\n"
                + "\tКоличество заказанных товаров: " + orderedDevicesQuantity;


    }
}
