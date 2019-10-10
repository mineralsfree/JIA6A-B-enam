package com.company;

import com.company.model.Airport.Airport;
import com.company.model.Airport.AirportRepo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        AirportRepo airportRepo= new AirportRepo();
        while (true){
            System.out.println("enter Commmand");
            String command = scanner.nextLine();
            switch (command){
                case "create":
                {
                    System.out.println("enter name");
                    String coordinates =  scanner.nextLine();
                    String servicingCost =  scanner.nextLine();
                    String country = scanner.nextLine();
                    Airport port = new Airport();
                    port.setServicingCost(Integer.parseInt(servicingCost));
                    port.setCoordinates(coordinates);
                    port.setCountry(country);
                    airportRepo.create(port);
                    break;
                }
            }
        }
    }
}
