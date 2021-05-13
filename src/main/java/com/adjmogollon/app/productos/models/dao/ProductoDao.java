package com.adjmogollon.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.adjmogollon.app.commons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
