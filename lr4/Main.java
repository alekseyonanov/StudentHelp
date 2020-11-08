package lr4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TemperatureDevice multiMeter = new TemperatureDevice("Мультиметр", 12, 0, 60);
        TemperatureDevice iron = new TemperatureDevice("Утюг");

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        customers.add(new Customer("Владимир", "Москва", 11));
        SaleProduct television = new SaleProduct("Телевизор", 12, 0, 55, customers);
        SaleProduct modem = new SaleProduct("Модем");

        Device device = multiMeter;
        System.out.println(device.getDeviceInfo());
        System.out.println();

        device = television;
        System.out.println(device.getDeviceInfo());
        System.out.println();

        TemperatureDevice temperatureDevice = television;
        System.out.println(temperatureDevice.getDeviceInfo());
        System.out.println();

        DeviceInfo deviceInfo = iron;
        System.out.println(deviceInfo.getDeviceInfo());
        System.out.println();

        modem.setBasicInfo("Модем 3000", 36);
        System.out.println(modem.getDeviceInfo());
    }
}

