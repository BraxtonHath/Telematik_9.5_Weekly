package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleInfo CarOne = new VehicleInfo();
        TelematicsService result = new TelematicsService();

        System.out.println("VIN number?");
        int jsonFileName = scanner.nextInt();
        CarOne.setVIN(jsonFileName);

        System.out.println("Current odometer reading?");
        double Odometer = scanner.nextDouble();
        CarOne.setOdometer(Odometer);

        System.out.println("Gallons of gas you've consumed?");
        double Gallons = scanner.nextDouble();
        CarOne.setGallons(Gallons);

        System.out.println("Odometer reading at last service?");
        double OdometerService = scanner.nextDouble();
        CarOne.setOdometerService(OdometerService);

        System.out.println("Engine Size?");
        double EngineSize = scanner.nextDouble();
        CarOne.setEngineSize(EngineSize);

        result.report(CarOne);

        VehicleInfo CarTwo = new VehicleInfo();
        CarTwo.setVIN(4);
        CarTwo.setOdometer(5);
        CarTwo.setGallons(6);
        CarTwo.setOdometerService(7);
        CarTwo.setEngineSize(8);

        result.report(CarTwo);



        try {
            System.out.println("===============================================");
            List<VehicleInfo> vehicleInfoList = result.jsonToObject();
            for (VehicleInfo vehicleInfo : vehicleInfoList) {
                System.out.println(vehicleInfo.toString());
//                vehicleInfo.toHtml();
            }
//            System.out.println(vehicleInfoList);
//            System.out.println("===============================================");
            System.out.println("===============================================");
//            String html = vehicleInfoList.toHtml();
//            System.out.println(html);
//            System.out.println("===============================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
