/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import viitteidenhallinta.model.Project;

/**
 *
 * @author tim
 */
public interface IViiteRepository extends JpaRepository<Project, Long> {
    
}
