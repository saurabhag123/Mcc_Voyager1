package schoonbv.voyager.entities;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

@Entity
@Table(name = "voyagers")
@SequenceGenerator(name="VOYAGER", sequenceName="private_sequence")
public class Voyager {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOYAGER")
    @Column(name = "voyager_id")
    private int id;
    private int batteryLevel;
    private boolean active;
    private String dataTypes;
    private int timeActive; //in hours
    private String routePath;
    @Embedded
    private Coordinate location;
    private Coordinate startLoc;
    private Coordinate endLoc;
    private int startHour;
    private int endHour;


    public Voyager() {
        batteryLevel = 100;
        active = false;
    }

    public Voyager(Coordinate one){
        this(100, true, one);
    }

    //dummy constructor
    public Voyager(int batteryLevel, boolean active) {
        this(batteryLevel, active, null);
    }

    public Voyager(int batteryLevel, boolean active, Coordinate coordinate) {
        this(batteryLevel, active, coordinate, false);
    }

    public Voyager(int batteryLevel, boolean active, Coordinate location, boolean charging) {
        this.batteryLevel = batteryLevel;
        this.active = active;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(String dataTypes) {
        this.dataTypes = dataTypes;
    }

    public int getTimeActive() {
        return timeActive;
    }

    public void setTimeActive(int timeActive) {
        this.timeActive = timeActive;
    }

    public String getRoutePath() {
        return routePath;
    }

    public void setRoutePath(String routePath) {
        this.routePath = routePath;
    }

    public Double[] getLocation() {
        return location.getCoordinateArray();
    }

    public void setLocation(Coordinate location) {
        this.location = location;
    }

    public Double extractLatitude(){
        return location.getLat();
    }

    public Double extractLongitude(){
        return location.getLat();
    }

    public Coordinate extractLocationCoordinate() {
        return location;
    }

    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }


}
