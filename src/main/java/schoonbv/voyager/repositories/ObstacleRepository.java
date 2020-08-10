package schoonbv.voyager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schoonbv.voyager.entities.Obstacle;

@Repository
public interface ObstacleRepository extends JpaRepository <Obstacle, Integer> {
}
