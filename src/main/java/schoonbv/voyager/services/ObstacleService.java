package schoonbv.voyager.services;

import org.springframework.beans.factory.annotation.Autowired;
import schoonbv.voyager.entities.Coordinate;
import schoonbv.voyager.entities.Obstacle;
import schoonbv.voyager.repositories.ObstacleRepository;

public class ObstacleService {
    @Autowired
    ObstacleRepository obstacleRepository;

    public void initDB(){
        obstacleRepository.save(new Obstacle("water", new Coordinate(52.399727, 4.588791), 100));
        obstacleRepository.save(new Obstacle("water", new Coordinate(52.397410, 4.567423), 50));
        obstacleRepository.save(new Obstacle("tree", new Coordinate(52.401825, 4.590626), 5));
        obstacleRepository.save(new Obstacle("tree", new Coordinate(52.398595, 4.584471), 3));
        obstacleRepository.save(new Obstacle("tree", new Coordinate(52.397018, 4.594003), 2));
    }
}
