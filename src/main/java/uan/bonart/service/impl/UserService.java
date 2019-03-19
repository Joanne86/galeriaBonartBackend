package uan.bonart.service.impl;

import org.springframework.stereotype.Service;

import uan.bonart.entities.Artist;
import uan.bonart.entities.Artwork;
import uan.bonart.entities.Room;
import uan.bonart.entities.Sesion;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.service.IUserService;

@Service
public class UserService implements IUserService {
	@Override
	public Iterable<Artist> findAll() {
		return null;
	}

	@Override
	public Iterable<Artwork> findAllArtwork() {
		return null;
	}

	@Override
	public Room create(Room room) {
		return null;
	}

	@Override
	public void deleteById(int id) throws ResourceNotFoundException {

	}

	@Override
	public Sesion getSesion(String username, String password) {
		return null;
	}

	@Override
	public Artist create(Artist artist) {
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
