package com.gimnasio.gimnasiomarcosweb.service;

import com.gimnasio.gimnasiomarcosweb.model.Cliente;
import com.gimnasio.gimnasiomarcosweb.model.Membresia;
import com.gimnasio.gimnasiomarcosweb.model.Entrenador;
import com.gimnasio.gimnasiomarcosweb.model.Reserva;
import org.springframework.stereotype.Service;

@Service
public class GimnasioService {

    private Cliente[] clientes = new Cliente[100];
    private Membresia[] membresias = new Membresia[100];
    private Entrenador[] entrenadores = new Entrenador[100];
    private Reserva[] reservas = new Reserva[100];

    private int cantidadClientes = 0;
    private int cantidadMembresias = 0;
    private int cantidadEntrenadores = 0;
    private int cantidadReservas = 0;

    public GimnasioService() {

        agregarCliente(new Cliente(
                1,
                "Carlos",
                "Ramirez",
                "72845612",
                "987654321",
                "carlos@gmail.com"
        ));

        agregarCliente(new Cliente(
                2,
                "Maria",
                "Torres",
                "74561238",
                "986123456",
                "maria@gmail.com"
        ));

        agregarMembresia(new Membresia(
                1,
                "Plan Básico",
                80.00,
                1,
                "Acceso a máquinas"
        ));

        agregarMembresia(new Membresia(
                2,
                "Plan Premium",
                150.00,
                3,
                "Máquinas, clases y asesoría"
        ));

        agregarEntrenador(new Entrenador(
                1,
                "Luis Mendoza",
                "Musculación",
                "985456123",
                "luis@gmail.com"
        ));

        agregarEntrenador(new Entrenador(
                2,
                "Ana Torres",
                "Fitness",
                "984123456",
                "ana@gmail.com"
        ));

        agregarReserva(new Reserva(
                1,
                "Carlos Ramirez",
                "Luis Mendoza",
                "2026-10-05",
                "10:00",
                "Confirmada"
        ));
    }

    // CLIENTES

    public void agregarCliente(Cliente cliente) {
        if (cantidadClientes < clientes.length) {
            clientes[cantidadClientes] = cliente;
            cantidadClientes++;
        }
    }

    public Cliente[] listarClientes() {
    Cliente[] resultado = new Cliente[cantidadClientes];

    for (int i = 0; i < cantidadClientes; i++) {
        resultado[i] = clientes[i];
    }

    return resultado;
    }

    public Cliente buscarCliente(int id) {

        for (int i = 0; i < cantidadClientes; i++) {

            if (clientes[i].getId() == id) {
                return clientes[i];
            }
        }

        return null;
    }

    public void eliminarCliente(int id) {

        for (int i = 0; i < cantidadClientes; i++) {

            if (clientes[i].getId() == id) {

                for (int j = i; j < cantidadClientes - 1; j++) {
                    clientes[j] = clientes[j + 1];
                }

                clientes[cantidadClientes - 1] = null;
                cantidadClientes--;

                break;
            }
        }
    }

    // MEMBRESIAS

    public void agregarMembresia(Membresia membresia) {

        if (cantidadMembresias < membresias.length) {
            membresias[cantidadMembresias] = membresia;
            cantidadMembresias++;
        }
    }

    public Membresia[] listarMembresias() {
    Membresia[] resultado = new Membresia[cantidadMembresias];

    for (int i = 0; i < cantidadMembresias; i++) {
        resultado[i] = membresias[i];
    }

    return resultado;
    }

    public Membresia buscarMembresia(int id) {

        for (int i = 0; i < cantidadMembresias; i++) {

            if (membresias[i].getId() == id) {
                return membresias[i];
            }
        }

        return null;
    }

    public void eliminarMembresia(int id) {

        for (int i = 0; i < cantidadMembresias; i++) {

            if (membresias[i].getId() == id) {

                for (int j = i; j < cantidadMembresias - 1; j++) {
                    membresias[j] = membresias[j + 1];
                }

                membresias[cantidadMembresias - 1] = null;
                cantidadMembresias--;

                break;
            }
        }
    }

    // ENTRENADORES

    public void agregarEntrenador(Entrenador entrenador) {

        if (cantidadEntrenadores < entrenadores.length) {
            entrenadores[cantidadEntrenadores] = entrenador;
            cantidadEntrenadores++;
        }
    }

    public Entrenador[] listarEntrenadores() {
    Entrenador[] resultado = new Entrenador[cantidadEntrenadores];

    for (int i = 0; i < cantidadEntrenadores; i++) {
        resultado[i] = entrenadores[i];
    }

    return resultado;
    }

    public Entrenador buscarEntrenador(int id) {

        for (int i = 0; i < cantidadEntrenadores; i++) {

            if (entrenadores[i].getId() == id) {
                return entrenadores[i];
            }
        }

        return null;
    }

    public void eliminarEntrenador(int id) {

        for (int i = 0; i < cantidadEntrenadores; i++) {

            if (entrenadores[i].getId() == id) {

                for (int j = i; j < cantidadEntrenadores - 1; j++) {
                    entrenadores[j] = entrenadores[j + 1];
                }

                entrenadores[cantidadEntrenadores - 1] = null;
                cantidadEntrenadores--;

                break;
            }
        }
    }

    // RESERVAS

    public void agregarReserva(Reserva reserva) {

        if (cantidadReservas < reservas.length) {
            reservas[cantidadReservas] = reserva;
            cantidadReservas++;
        }
    }

    public Reserva[] listarReservas() {
    Reserva[] resultado = new Reserva[cantidadReservas];

    for (int i = 0; i < cantidadReservas; i++) {
        resultado[i] = reservas[i];
    }

    return resultado;
    }

    public Reserva buscarReserva(int id) {

        for (int i = 0; i < cantidadReservas; i++) {

            if (reservas[i].getId() == id) {
                return reservas[i];
            }
        }

        return null;
    }

    public void eliminarReserva(int id) {

        for (int i = 0; i < cantidadReservas; i++) {

            if (reservas[i].getId() == id) {

                for (int j = i; j < cantidadReservas - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }

                reservas[cantidadReservas - 1] = null;
                cantidadReservas--;

                break;
            }
        }
    }

    // CANTIDADES

    public int cantidadClientes() {
        return cantidadClientes;
    }

    public int cantidadMembresias() {
        return cantidadMembresias;
    }

    public int cantidadEntrenadores() {
        return cantidadEntrenadores;
    }

    public int cantidadReservas() {
        return cantidadReservas;
    }
}