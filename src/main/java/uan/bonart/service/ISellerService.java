package uan.bonart.service;


import uan.bonart.entities.Seller;

import java.util.List;

public interface ISellerService {
    Seller create (Seller seller);

    List<Seller> findAll();
}
