package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.Seller;
import uan.bonart.repositories.SellerRepository;
import uan.bonart.service.ISellerService;

import java.util.List;


@Service
public class SellerService implements ISellerService {
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public Seller create(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return (List<Seller>)sellerRepository.findAll();
    }
}
