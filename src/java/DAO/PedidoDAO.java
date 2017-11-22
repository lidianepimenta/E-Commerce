/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Pedido;
import javax.persistence.EntityManager;

/**
 *
 
 */
public class PedidoDAO {
    
    private EntityManager em;
    
    public PedidoDAO (EntityManager em){
        this.em=em;
    }
    
    public Pedido salvar(Pedido p){
        if(p.getIdPedido()==null){
            em.persist(p);
        } else {
            em.merge(p);
        }
        return p;
    }
    
    public void excluir (Long id){
        Pedido p = consultarPorId(id);
        em.remove(p);
    }
    
    public Pedido consultarPorId(Long id){
        Pedido p = null;
        em.find(Pedido.class, id);
        return p;
    }
    
}
