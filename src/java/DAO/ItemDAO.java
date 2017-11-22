/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Item;
import javax.persistence.EntityManager;

/**
 *
 
 */
public class ItemDAO {
    
    private EntityManager em;
    
    public ItemDAO (EntityManager em){
        this.em=em;
    }
    
    public Item salvar(Item i){
        if(i.getIdItem()==null){
            em.persist(i);
        } else {
            em.merge(i);
        }
        return i;
    }
    
    public void excluir (Long id){
        Item i = consultarPorId(id);
        em.remove(i);
    }
    
    public Item consultarPorId(Long id){
        Item i = null;
        em.find(Item.class, id);
        return i;
    }
    
}
