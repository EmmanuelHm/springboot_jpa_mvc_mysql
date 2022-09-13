package com.bolsadeideas.springboot.app.models.dao;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

//import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

//public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
	/*public List<Cliente> findAll();
	public void save(Cliente cliente);
	public Cliente findOne(Long id);
	public void delete(Long id);*/

//}

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
}
