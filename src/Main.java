public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(1);
        address.setCountry("Russia");
        address.setCity("Moscow");
        address.setStreet("Pushkinskaya st.");
        address.setHouse(1);
        address.setApartment(11);
        System.out.println(address.getIndex() + " " + address.getCountry() + " " +address.getCity() + " "
        + address.getStreet() + " " + address.getHouse() + " " + address.getApartment());

    }
}
