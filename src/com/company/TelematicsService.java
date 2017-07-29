package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class TelematicsService {
    public TelematicsService() {}
    public void report (VehicleInfo vehicleInfo){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String filename = vehicleInfo.getVIN() + ".json";
            mapper.writeValue(new File(filename), vehicleInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<VehicleInfo> jsonToObject() throws IOException {
        File file = new File(".");
        List<VehicleInfo> jsonFileList  = new ArrayList<>();
        for (File f : file.listFiles()) {
            if (f.getName().endsWith(".json")) {
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    VehicleInfo vehicleInfo = mapper.readValue(f, VehicleInfo.class);
                    jsonFileList.add(vehicleInfo);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return jsonFileList;
    }
}

