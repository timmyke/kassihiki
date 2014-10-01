package viitteidenhallinta.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import viitteidenhallinta.model.InProceedingsViite;

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
    
    @Autowired
    public ViiteService(EntityManager em) {
        this.em = em;
    }
        
    @Transactional
    public void addViite(InProceedingsViite viite) {
        em.persist(viite);
    }

    @Transactional
    public List<InProceedingsViite> listViite() {
        CriteriaQuery<InProceedingsViite> c = em.getCriteriaBuilder().createQuery(InProceedingsViite.class);
        c.from(InProceedingsViite.class);
        return em.createQuery(c).getResultList();
    }

    @Transactional
    public void removeViite(Integer id) {
        InProceedingsViite person = em.find(InProceedingsViite.class, id);
        if (null != person) {
            em.remove(person);
        }
    }
    
}
