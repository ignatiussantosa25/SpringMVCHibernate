/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import org.hibernate.SessionFactory;
import entities.EntitiesEnum;

/**
 *
 * @author Ignatius
 */
public class DAO extends FunctionDAO implements DAOInterface{
    private final FunctionDAO fdao;
    private final EntitiesEnum table;
    private final QueryEnum query;

    public DAO(SessionFactory sf, EntitiesEnum table) {
        super(sf);
        this.table = table;
        this.query = this.table.getQueryEnum(table);
        this.fdao = new FunctionDAO(sf);
    }

    @Override
    public List<Object> getData(){
        return fdao.getData(query.getQuery(table));
    }
    
    @Override
    public List<Object> search(String category, String data){
        return fdao.getData(query.getQuery(table, category, data));
    }
}