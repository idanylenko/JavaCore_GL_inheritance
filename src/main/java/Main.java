public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Apple", 2000, "AAA123", 1000, 700);
        System.out.println(monitor);

        Device device = new Device("sony",500,"jhdbfhjdf222");
        System.out.println(device.toString());

        EthernetAdapter ethernetAdapter = new EthernetAdapter("Samsung", 50, "87358HHHg", 250, "1231223");
        System.out.println(ethernetAdapter.toString());

    }
}
