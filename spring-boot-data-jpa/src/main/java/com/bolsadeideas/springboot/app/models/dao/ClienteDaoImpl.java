
package com.bolsadeideas.springboot.app.models.dao;

//import java.util.List;

//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;

//import org.springframework.stereotype.Repository;

//import com.bolsadeideas.springboot.app.models.entity.Cliente;

//@Repository
//public class ClienteDaoImpl implements IClienteDao {
//public class ClienteDaoImpl{
	
	/*
	
	@PersistenceContext 
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findAll() {
		return em.createQuery("from Cliente").getResultList();
	}
	
	@Override
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	public void save(Cliente cliente) {
		
		if(cliente.getId() != null && cliente.getId() > 0) {
			em.merge(cliente);
		}
		else {
			em.persist(cliente);			
		}
		
		//persist: Almacena un obj entity en el contexto de persistencia y en la base de datos
		//find: Busca la entidad a traves de su clave primaria
		//merge: Actualiza las modificaciones n una entidad devolviendo un obj entity manejado por el contexto
		//remove: Elimina una entidad
	}
	
	*/

	//@Override
	//public void delete (Long id) {
		/*Cliente cliente = findOne(id);
		em.remove(cliente);*/
		//em.remove(findOne(id));
	//}

//}