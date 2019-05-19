package uan.bonart.service;

import uan.bonart.entities.Sale;

import java.util.List;

public interface ISaleService {
    Sale create (Sale sale);

    List<Sale> findAll();
}
