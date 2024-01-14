package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.TaxaPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("valor do contrato: ");
        double contractValue = sc.nextDouble();
        System.out.print("Entre com o numero de parcelas: ");
        int portionValue = sc.nextInt();

        Contract contract = new Contract(number, date, contractValue);
        
        ContractService contractService = new ContractService(new TaxaPaypal());
        contractService.processContract(contract, portionValue);

        System.out.println("Parcelas: ");
        for(Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }
    }
}