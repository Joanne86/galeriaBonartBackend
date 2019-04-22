package uan.bonart.service;

import uan.bonart.entities.Sale;

public interface ISaleService {
    Sale create (Sale sale);

    Iterable<Sale> findAll();
}
