package uan.bonart.service;


import uan.bonart.entities.Seller;

public interface ISellerService {
    Seller create (Seller seller);

    Iterable<Seller> findAll();
}
