package viitteidenhallinta.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import viitteidenhallinta.model.BibTeXEntry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

@Service
public class BibTeXStorage implements BibTeXStorageService {

    @PersistenceContext
    EntityManager em;
        
    @Transactional
    public void addEntry(BibTeXEntry person) {
        em.persist(person);
    }

    @Transactional
    public List<BibTeXEntry> listEntries() {
        CriteriaQuery<BibTeXEntry> c = em.getCriteriaBuilder().createQuery(BibTeXEntry.class);
        c.from(BibTeXEntry.class);
        return em.createQuery(c).getResultList();
    }

    @Transactional
    public void removeEntry(Integer id) {
        BibTeXEntry person = em.find(BibTeXEntry.class, id);
        if (null != person) {
            em.remove(person);
        }
    }
    
}
