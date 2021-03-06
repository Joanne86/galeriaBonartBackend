package uan.bonart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uan.bonart.entities.Sale;
import uan.bonart.repositories.SaleRepository;
import uan.bonart.service.ISaleService;

import java.util.List;


@Service
public class SaleService implements ISaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public Sale create(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> findAll() {
        return (List<Sale>) saleRepository.findAll();
    }
}
