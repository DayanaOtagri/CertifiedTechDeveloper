package com.dh.odontologos.dao.impl;

import java.sql.SQLException;
import java.util.List;


public interface IDao<T> {

    // T es un dato generico. Es un parámetro que puede ser cualquier cosa
    public T guardar(T t);
    public List<T> buscarTodos() throws SQLException;
    public void  eliminar ( Integer id );

}
