package schoonbv.voyager.entities;
import javax.persistence.*;


@Entity
@Table(name = "obstacles")
public class Obstacle {

	@Id
    @GeneratedValue
    @Column(name = "obstacle_id")
    private int id;
    private String type;
    
    @Embedded
    private Coordinate coordinate;
    
    private double radius;
    
    private final String circle ="Circle";

    public Obstacle() {
    	
    }
	public Obstacle(int id, String type, Coordinate coordinate, double radius) {
		this.id = id;
		this.type = circle;
		this.coordinate = coordinate;
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    
    
}
