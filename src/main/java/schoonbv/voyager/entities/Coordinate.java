package schoonbv.voyager.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Coordinate {
    public static final Coordinate HEADQUARTERS = new Coordinate(52.421300, 4.831925);
    public static final Coordinate AMSTREDAM = new Coordinate(52.345016, 4.835530);
    public static final Coordinate ROTTERDAM = new Coordinate(51.921927, 4.554771);
    public static final Coordinate GRONINGEN = new Coordinate(53.199454, 6.523534);
    public static final Coordinate MAASTRICHT = new Coordinate(50.929145, 5.779725);
    public static final Coordinate DEVENTER = new Coordinate(52.236568, 6.189867);
    public static final Coordinate VIANEN = new Coordinate(51.982590, 5.095921);
    public static final Coordinate BEST = new Coordinate(51.486954, 5.393365);

    private Double longitude;
    private Double latitude;

    public Coordinate(){}

    public Coordinate(Double latitude, Double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLat(){
        return latitude;
    }
    public Double getLon(){
        return longitude;
    }

    public Double[] getCoordinateArray(){
        return new Double[] {latitude, longitude};
    }
}
