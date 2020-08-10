package schoonbv.voyager.entities;
import javax.persistence.*;


@Entity
@Table(name = "obstacles")
public class Obstacle {
	//types of objects:
	private final String water ="Water";
	private final String tree ="Tree";

	@Id
    @GeneratedValue
    @Column(name = "obstacle_id")
    private int id;
    private String type;
    @Embedded
    private Coordinate coordinate;
    //in meters
    private double radius;

    //private String shape; --- this is for later implementation

    public Obstacle() {
	}

	public Obstacle(String type, Coordinate coordinate, double radius) {
		this.type = type;
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
