package uan.bonart.service.impl;

import org.springframework.stereotype.Service;

import uan.bonart.bean.Sesion;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.service.IUserService;

@Service
public class UserService implements IUserService {
	@Override
	public void deleteById(int id) throws ResourceNotFoundException {

	}

	@Override
	public Sesion getSesion(String username, String password) {
		return null;
	}
	/*@Override
	public void deleteById(int id) throws ResourceNotFoundException {

	}

	@Override
	public Iterable<User> findAllByIdsesion(int idsesion) {
		return null;
	}

	@Override
	public Iterable<User> findAll() {
		return null;
	}

	@Override
	public Sesion getSesion(String username, String password) {
		return null;
	}

	/*@Autowired
	private UserRepository repository; // lo inyecta para no hacer new

	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public void delete(User user) throws ResourceNotFoundException {
		if (repository.findById(user.getId()).isPresent()) {
			repository.delete(user);
		}
		throw new ResourceNotFoundException("User", "id", Integer.toString(user.getId()));

	}

	// <app-menu></app-menu>
	// <router-outlet></router-outlet>
	@Override
	public void deleteById(int id) throws ResourceNotFoundException {
		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("User", "id", Integer.toString(id));
		}

	}

	@Override
	public Iterable<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(int id) throws ResourceNotFoundException {
		if (repository.findById(id).isPresent()) {
			return repository.findById(id).get();
		} else {
			throw new ResourceNotFoundException("User", "id", Integer.toString(id));
		}
	}

	@Override
	public User update(User user) throws ResourceNotFoundException {
		if (repository.findById(user.getId()).isPresent()) {
			return repository.save(user);
		}
		throw new ResourceNotFoundException("User", "id", Integer.toString(user.getId()));

	}

	@Override
	public Iterable<User> findAllByIdsesion(int idsesion) {
		return repository.findAllByIdsesion(idsesion);
	}

	@Override
	public Sesion getSesion(String username, String password) {
		
		return repository.getSesion(username, password);
		
		
	}*/

}
