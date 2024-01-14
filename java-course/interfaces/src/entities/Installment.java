package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Installment {
    LocalDate duedate;
    double amount;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment(LocalDate duedate, double amount) {
        this.duedate = duedate;
        this.amount = amount;
    }

    public String toString() {
        return duedate.format(dtf) + " - " + String.format("%.2f", amount);
    }
}