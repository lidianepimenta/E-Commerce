/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static com.sun.codemodel.JExpr.component;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;

/**
 *
 
 */

@SessionScoped
public class Carrinho {
    
    private List<Item> itens = new ArrayList<Item>();
    private double total = 0.0;

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
