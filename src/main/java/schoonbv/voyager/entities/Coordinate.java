package schoonbv.voyager.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Coordinate {
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
