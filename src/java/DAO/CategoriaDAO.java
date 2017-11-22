/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Categoria;
import javax.persistence.EntityManager;

/**
 *
 
 */
public class CategoriaDAO {
    
    private EntityManager em;
    
    public CategoriaDAO (EntityManager em){
        this.em=em;
    }
    
    public Categoria salvar(Categoria c){
        if(c.getIdCategoria()==null){
            em.persist(c);
        } else {
            em.merge(c);
        }
        return c;
    }
    
    public void excluir (Long id){
        Categoria c = consultarPorId(id);
        em.remove(c);
    }
    
    public Categoria consultarPorId(Long id){
        Categoria c = null;
        em.find(Categoria.class, id);
        return c;
    }
}
