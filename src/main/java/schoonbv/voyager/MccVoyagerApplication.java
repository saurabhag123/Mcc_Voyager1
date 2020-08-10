package schoonbv.voyager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import schoonbv.voyager.services.ObstacleService;

@SpringBootApplication
public class MccVoyagerApplication {
	@Autowired
	ObstacleService obstacleService;

	/**
	 * comment this method out after having run the application once
	 * creates a table of obstacles
	 **/
	@EventListener(ApplicationReadyEvent.class)
	public void createTableOfObstacles() {
		obstacleService.initDB();
	}

	public static void main(String[] args) {
		SpringApplication.run(MccVoyagerApplication.class, args);
	}

}
