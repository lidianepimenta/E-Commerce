/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Produto;
import javax.persistence.EntityManager;

/**
 *
 
 */
public class ProdutoDAO {
    
    private EntityManager em;
    
    public ProdutoDAO (EntityManager em){
        this.em=em;
    }
    
    public Produto salvar(Produto p){
        if(p.getIdProduto()==null){
            em.persist(p);
        } else {
            em.merge(p);
        }
        return p;
    }
    
    public void excluir (Long id){
        Produto p = consultarPorId(id);
        em.remove(p);
    }
    
    public Produto consultarPorId(Long id){
        Produto p = null;
        em.find(Produto.class, id);
        return p;
    }
    
}
