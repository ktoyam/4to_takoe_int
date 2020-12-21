package pract29;

public final class Address {
    private final String cityName;
    private final int zipCode;
    private final String streetName;
    private final int buildingNumber;
    private final int buildingLetter;
    private final int apartmentNumber;
    public static Address EMPTY_ADDRESS = null;

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, int buildingLetter, int apartmentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
