package viitteidenhallinta.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import viitteidenhallinta.model.Project;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ViiteService implements IViiteService {

    @PersistenceContext
    EntityManager em;
        
    public void addEntityManager(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    @Override
    public void addViite(Project viite) {
        em.persist(viite);
    }

    @Transactional
    @Override
    public List<Project> listViite() {
        CriteriaQuery<Project> c = em.getCriteriaBuilder().createQuery(Project.class);
        c.from(Project.class);
        return em.createQuery(c).getResultList();
    }
    
    @Transactional
    @Override
    public Project getViite(Integer id) {
        return em.find(Project.class,id);
    }

    @Transactional
    @Override
    public void removeViite(Integer id) {
        Project person = em.find(Project.class, id);
        if (null != person) {
            em.remove(person);
        }
    }
    
}
