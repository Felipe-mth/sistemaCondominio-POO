package DAO.interfaces;

import java.util.List;

public interface crudDAO<OBJ> {

    public List<OBJ> findAll();

    public List<OBJ> findByName(String nome);

    public void insertDados(OBJ obj);

    public void updateDados(OBJ obj);

    public void deleteDados(OBJ obj);

}
