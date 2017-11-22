/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Cliente;
import Entidades.ClienteJuridico;
import javax.persistence.EntityManager;

/**
 *

 */
public class ClienteJuridicoDAO {

    private EntityManager em;

    public ClienteJuridicoDAO(EntityManager em) {
        this.em = em;
    }

    public ClienteJuridico salvar(ClienteJuridico c) {
        if (c== null) {
            em.persist(c);
        } else {
            em.merge(c);
        }
        return c;
    }

    public void excluir(Long id) {
        ClienteJuridico c = consultarPorId(id);
        em.remove(c);
    }

    public ClienteJuridico consultarPorId(Long id) {
        ClienteJuridico c = null;
        em.find(ClienteJuridico.class, id);
        return c;
    }

}
