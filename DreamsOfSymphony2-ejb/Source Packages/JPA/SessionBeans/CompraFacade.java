/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA.SessionBeans;

import JPA.Entidades.Compra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jacky
 */
@Stateless
public class CompraFacade extends AbstractFacade<Compra> implements CompraFacadeLocal {

    @PersistenceContext(unitName = "DreamsOfSymphony2-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompraFacade() {
        super(Compra.class);
    }
    
}
