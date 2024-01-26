package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    int numero;
    LocalDate date;
    double valorContrato;

    List<Installment> installments = new ArrayList<>();

    public Contract(int numero, LocalDate date, double valorContrato) {
        this.numero = numero;
        this.date = date;
        this.valorContrato = valorContrato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}