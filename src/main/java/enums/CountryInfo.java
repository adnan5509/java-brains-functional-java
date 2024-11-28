package enums;

public enum CountryInfo {
    // Africa
    EGYPT("Egypt", "Cairo", "Africa", "Egyptian Pound"),
    NIGERIA("Nigeria", "Abuja", "Africa", "Naira"),
    SOUTH_AFRICA("South Africa", "Pretoria", "Africa", "South African Rand"),

    // Asia
    PAKISTAN("Pakistan", "Islamabad", "Asia", "Pakistani Rupee"),
    INDIA("India", "New Delhi", "Asia", "Indian Rupee"),
    CHINA("China", "Beijing", "Asia", "Chinese Yuan"),
    JAPAN("Japan", "Tokyo", "Asia", "Japanese Yen"),

    // Europe
    LUXEMBOURG("Luxembourg", "Luxembourg City", "Europe", "Euro"),
    FRANCE("France", "Paris", "Europe", "Euro"),
    GERMANY("Germany", "Berlin", "Europe", "Euro"),
    UNITED_KINGDOM("United Kingdom", "London", "Europe", "Pound Sterling"),

    // North America
    UNITED_STATES("United States", "Washington, D.C.", "North America", "US Dollar"),
    CANADA("Canada", "Ottawa", "North America", "Canadian Dollar"),
    MEXICO("Mexico", "Mexico City", "North America", "Mexican Peso"),

    // South America
    BRAZIL("Brazil", "Brasília", "South America", "Brazilian Real"),
    ARGENTINA("Argentina", "Buenos Aires", "South America", "Argentine Peso"),
    COLOMBIA("Colombia", "Bogotá", "South America", "Colombian Peso"),

    // Oceania
    AUSTRALIA("Australia", "Canberra", "Oceania", "Australian Dollar"),
    NEW_ZEALAND("New Zealand", "Wellington", "Oceania", "New Zealand Dollar"),
    FIJI("Fiji", "Suva", "Oceania", "Fijian Dollar"),

    // Antarctica
    ANTARCTICA("Antarctica", "N/A", "Antarctica", "N/A");

    private final String countryName;
    private final String capital;
    private final String continent;
    private final String currency;

    // Constructor
    CountryInfo(String countryName, String capital, String continent, String currency) {
        this.countryName = countryName;
        this.capital = capital;
        this.continent = continent;
        this.currency = currency;
    }

    // Getters
    public String getCountryName() {
        return countryName;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return String.format("%s (Country: %s, Capital: %s, Continent: %s, Currency: %s)",
                this.name().replace('_', ' '), countryName, capital, continent, currency);
    }
}



