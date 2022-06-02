package com.dh.medicamentos.dao.impl;

public interface IDao < T > {

    // T es un dato generico. Es un parámetro que puede ser cualquier cosa
    public T guardar(T t );
    // T retorna la clase
    public T buscar(Integer id );
    public void  eliminar ( Integer id );


}
