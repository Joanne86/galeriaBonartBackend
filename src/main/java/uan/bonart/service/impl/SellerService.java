package uan.bonart.service.impl;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.Seller;
import uan.bonart.repositories.SellerRepository;
import uan.bonart.service.ISellerService;

import java.util.logging.Logger;

@Service
public class SellerService implements ISellerService {
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public Seller create(Seller seller) {

        return sellerRepository.save(seller);
    }

    @Override
    public Iterable<Seller> findAll() {

        return sellerRepository.findAll();
    }
}
