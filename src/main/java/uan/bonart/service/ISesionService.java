package uan.bonart.service;

import uan.bonart.entities.Sesion;

public interface ISesionService {
    Sesion getSesion(String username, String password);
}
