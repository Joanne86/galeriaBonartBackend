package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.bonart.entities.Artwork;
import uan.bonart.exception.ResourceNotFoundException;
import uan.bonart.repositories.ArtworkRepository;
import uan.bonart.service.IArtworkService;

import java.util.List;
import java.util.Optional;

@Service
public class ArtworkService implements IArtworkService {
    @Autowired
    private ArtworkRepository artworkRepository;

	@Override
	public Artwork create(Artwork artwork) {
		return artworkRepository.save(artwork);
	}

	@Override
	public List<Artwork> findAll() {

		return (List<Artwork>) artworkRepository.findAll();
	}

	@Override
	public Artwork findByName(String name) {
		return artworkRepository.findByName(name);
	}

	@Override
	public List<Artwork> findByRoomCode(Integer code) {
		return artworkRepository.findByRoomCode(code);
	}

	@Override
	public void deleteByInscription_code(int code) {
		if (artworkRepository.findByInscription_code(code).isPresent()) {
			artworkRepository.deleteByInscription_code(code);
		}
	}

	@Override
	public Optional<Artwork> findByInscription_code(int inscription_code) {
		return artworkRepository.findByInscription_code(inscription_code);
	}

}
