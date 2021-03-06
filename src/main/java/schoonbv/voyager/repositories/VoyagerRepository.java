package schoonbv.voyager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schoonbv.voyager.entities.Voyager;

@Repository
public interface VoyagerRepository extends JpaRepository<Voyager, Integer> {

}
