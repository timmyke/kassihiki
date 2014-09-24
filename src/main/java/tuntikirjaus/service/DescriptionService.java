package tuntikirjaus.service;

import java.util.List;
import tuntikirjaus.domain.Description;

public interface DescriptionService {

    void save(Description description);
    void save(List<Description> descriptions);
    List<Description> list();
}