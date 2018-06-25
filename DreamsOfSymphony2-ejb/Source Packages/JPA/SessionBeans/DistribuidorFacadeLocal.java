/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA.SessionBeans;

import JPA.Entidades.Distribuidor;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jacky
 */
@Local
public interface DistribuidorFacadeLocal {

    void create(Distribuidor distribuidor);

    void edit(Distribuidor distribuidor);

    void remove(Distribuidor distribuidor);

    Distribuidor find(Object id);

    List<Distribuidor> findAll();

    List<Distribuidor> findRange(int[] range);

    int count();
    
}
