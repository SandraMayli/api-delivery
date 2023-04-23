package com.delivery.apidelivery.Modelo;

import java.util.Date;
import java.util.List;

public class order {
    public int id;
    public String nombreCliente;
    public String emailCliente;
    public String estado;
    public  Date tiempoCreacion;
    public Date tiempoEstimadoDelivery;
    public List<Item> items;
    public order(int id, String nombreCliente, String emailCliente, String estado, Date tiempoCreacion, Date tiempoEstimadoDelivery, List<Item> items) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
        this.estado = estado;
        this.tiempoCreacion = tiempoCreacion;
        this.tiempoEstimadoDelivery = tiempoEstimadoDelivery;
        this.items = items;
    }
    }
}
