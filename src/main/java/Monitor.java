public class Monitor extends Device {

    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {

        return "Monitor: manufacturer = " + getManufacturer()  + ", price = " + getPrice() +
                ", serialNumber = " + getSerialNumber() + ", X = " + getResolutionX() +
                ", Y= " + getResolutionY();
    }
}
