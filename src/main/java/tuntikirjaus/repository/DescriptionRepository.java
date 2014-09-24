package tuntikirjaus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tuntikirjaus.domain.Description;

public interface DescriptionRepository extends JpaRepository<Description, Long> {

}