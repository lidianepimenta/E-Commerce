/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Cliente;
import javax.persistence.EntityManager;

/**
 *
 * 
 */
public class ClienteDAO {
    
    private EntityManager em;
    
    public ClienteDAO (EntityManager em){
        this.em=em;
    }
    
    public Cliente salvar(Cliente c){
        if(c.getIdCliente()==null){
            em.persist(c);
        } else {
            em.merge(c);
        }
        return c;
    }
    
    public void excluir (Long id){
        Cliente c = consultarPorId(id);
        em.remove(c);
    }
    
    public Cliente consultarPorId(Long id){
        Cliente c = null;
        em.find(Cliente.class, id);
        return c;
    }
    
}
