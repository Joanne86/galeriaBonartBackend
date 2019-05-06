package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artwork;
import uan.bonart.repositories.ArtworkRepository;
import uan.bonart.service.IArtworkService;

@Service
public class ArtworkService implements IArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

	@Override
	public Artwork create(Artwork artwork) {
		return artworkRepository.save(artwork);
	}

	@Override
	public Iterable<Artwork> findAll() {

		return artworkRepository.findAll();
	}

	@Override
	public Artwork findByName(String name) {
		return artworkRepository.findByName(name);
	}

	@Override
	public Iterable<Artwork> findByRoomCode(Integer code) {
		return artworkRepository.findByRoomCode(code);
	}

	@Override
	public void deleteByInscription_code(int code) {
		//	if (artworkRepository.findByInscription_code(code).isPresent()) {
			artworkRepository.deleteByInscription_code(code);
		//}
		//throw new ResourceNotFoundException("User", "id", Integer.toString(artwork.getInscription_code()));
	}

}
