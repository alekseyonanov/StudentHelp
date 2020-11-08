package lr4;

import java.util.ArrayList;
import java.util.List;

public class SaleProduct extends TemperatureDevice {

    private List<Customer> customerList;



    public SaleProduct(String name, int warrantyPeriod, int tMin, int tMax, List<Customer> customerList ) {
        super(name, warrantyPeriod, tMin, tMax);
        this.customerList = customerList;
    }

    public SaleProduct(String name, List<Customer> customerList) {
        super(name);
        this.customerList = customerList;
    }

    public SaleProduct(String name) {
        this(name, new ArrayList<Customer>());
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String getDeviceInfo() {
        String deviceInfo = super.getDeviceInfo() + "\n"
                + "Количество покупателей: " + customerList.size();

        for (int i = 0; i < customerList.size(); i++) {
            deviceInfo += "\n" + "Покупатель №" + (i + 1) + ":\n" + getCustomerList().get(i).toString();
        }

        return deviceInfo;
    }
}
