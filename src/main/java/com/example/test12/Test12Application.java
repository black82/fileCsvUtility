package com.example.test12;

import com.example.test12.model.Device;
import com.example.test12.service.ServiceDevice;

import java.util.List;


public class Test12Application {

    public static void main(String[] args) {
        ServiceDevice serviceDevice = new ServiceDevice();
        List<Device> devices = serviceDevice.readFileAndSplit();
        System.out.println(devices);
    }

}
