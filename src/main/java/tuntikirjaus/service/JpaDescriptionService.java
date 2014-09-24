package tuntikirjaus.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tuntikirjaus.domain.Description;
import tuntikirjaus.repository.DescriptionRepository;

@Service
public class JpaDescriptionService implements DescriptionService {

    @Autowired
    private DescriptionRepository descriptionRepository;
    
    @Override
    @Transactional(readOnly = false)
    public void save(Description description) {
        descriptionRepository.save(description);
    }
    
    @Override
    @Transactional(readOnly = false)
    public void save(List<Description> descriptions) {
        descriptionRepository.save(descriptions);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Description> list() {
        return descriptionRepository.findAll();
    }
}