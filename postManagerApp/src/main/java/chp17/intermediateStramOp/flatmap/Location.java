package chp17.intermediateStramOp.flatmap;

public class Location {
    private double longitude;
    private double latitude;

    public Location(double langtitude, double longitude) {
        this.latitude = langtitude;
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
