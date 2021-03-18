package com.example.test12.service;

import com.example.test12.model.Device;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *
 * @author Iurii
 * @Project test12
 * </p>
 * @Date 18.03.2021
 */
public class ServiceDevice {


    public List<Device> readFileAndSplit() {
        try (BufferedReader br = new BufferedReader(new FileReader(Objects.requireNonNull(this.getClass().getClassLoader().getResource("data/devices.csv")).getPath()))) {
            Stream<String> stringStream = br.lines().skip(1);
            return stringStream
                    .map(string -> string.split(","))
                    .map(this::creamDeviceToArrayString)
                    .distinct()
                    .sorted(Comparator.comparing(Device::getCALIBRATION_YEAR).reversed())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Exception to ReadFile and Pars ", e);
        }
    }

    public Device creamDeviceToArrayString(String[] strings) {
        if (strings != null && strings.length == 5) {
            return new Device(strings[0], parseStringToDate(strings[1]), Integer.parseInt(strings[2]), strings[3], Integer.parseInt(strings[4]));
        } else {
            throw new NullPointerException("List strings to csv file is null or is empty");
        }

    }

    @SneakyThrows
    public Date parseStringToDate(String date) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        return format.parse(date);
    }

}
