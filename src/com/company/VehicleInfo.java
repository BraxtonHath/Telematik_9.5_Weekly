package com.company;

public class VehicleInfo {

    int VIN;
    double odometer;
    double gallons;
    double odometerService;
    double engineSize;



    public String toHtml() {
        Double odometer = this.odometer;
        Double gallons = this.gallons;
        Double odometerService = this.odometerService;
        Double engineSize = this.engineSize;

        String htmlString = String.format("<html>\n" +
                "  <title>Vehicle Telematics Dashboard</title>\n" +
                "  <body>\n" +
                "    <table align='center'>\n" +
                "      <tr>\n" +
                "       <th>Odometer</th><th>Gallons</th><th>odometerService</th><th>Engine Size</th>\n" +
                "      </tr>\n" +
                "      <tr>\n" +
                "       <td align='center'>%s</td><td align='center'>%s</td><td align='center'>%s</td align='center'><td align='center'>%s</td>\n" +
                "      </tr>\n" +
                "    </table>\n" +
                "  </body>\n" +
                "</html>", odometer, gallons, odometerService, engineSize);

        return htmlString;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public double getOdometerService() {
        return odometerService;
    }

    public void setOdometerService(double odometerService) {
        this.odometerService = odometerService;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "Vin=" + VIN +
                ", odometer=" + odometer +
                ", gallons=" + gallons +
                ", odometerService=" + odometerService +
                ", engineSize=" + engineSize +
                '}';
    }
}
