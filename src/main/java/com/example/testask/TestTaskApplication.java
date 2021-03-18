package com.example.testask;

import com.example.testask.model.Device;
import com.example.testask.service.ServiceDevice;

import java.util.List;


public class TestTaskApplication {

    public static void main(String[] args) {
        ServiceDevice serviceDevice = new ServiceDevice();
        List<Device> devices = serviceDevice.readFileAndBuildersDevice();
        System.out.println(devices);
    }

}
