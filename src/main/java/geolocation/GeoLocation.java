package geolocation;


public record GeoLocation(String as, String city, String country, String countryCode, String isp, double lat, double lon, String org, String query, String region, String regionName, String timezone, String zip) {

    public String getAs() {
        return as;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getIsp() {
        return isp;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getOrg() {
        return org;
    }

    public String getQuery() {
        return query;
    }

    public String getRegion() {
        return region;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getZip() {
        return zip;
    }
}
