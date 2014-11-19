/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viite.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import viitteidenhallinta.model.Project;


public class GenericRepository<Type> {
    @PersistenceContext
    EntityManager em;
    
    /**
     * Persistoi objektin
     * @param object 
     */
    public void add(Type object) {
        em.persist(object);
    }
    
//    public List<Type> listAll() {
//        CriteriaQuery<Type> c = em.getCriteriaBuilder().createQuery(Type);
//        c.from(Type.class);
//        return em.createQuery(c).getResultList();
//    }
    
}
