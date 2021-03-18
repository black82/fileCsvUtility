package com.example.test12.model;

import java.util.Date;
import java.util.Objects;

/**
 * <p>
 *
 * @author Iurii
 * @Project test12
 * </p>
 * @Date 18.03.2021
 */
public class Device  {
    private String DEVICE_ID;
    private Date MANUFACTURE_DATE;
    private Integer FIRMWARE_VERSION;
    private String ADDRESS;
    private Integer CALIBRATION_YEAR;

    public Device() {
    }

    public Device(String DEVICE_ID, Date MANUFACTURE_DATE, Integer FIRMWARE_VERSION, String ADDRESS, Integer CALIBRATION_YEAR) {
        this.DEVICE_ID = DEVICE_ID;
        this.MANUFACTURE_DATE = MANUFACTURE_DATE;
        this.FIRMWARE_VERSION = FIRMWARE_VERSION;
        this.ADDRESS = ADDRESS;
        this.CALIBRATION_YEAR = CALIBRATION_YEAR;
    }

    public String getDEVICE_ID() {
        return DEVICE_ID;
    }

    public Date getMANUFACTURE_DATE() {
        return MANUFACTURE_DATE;
    }

    public Integer getFIRMWARE_VERSION() {
        return FIRMWARE_VERSION;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public Integer getCALIBRATION_YEAR() {
        return CALIBRATION_YEAR;
    }

    public void setDEVICE_ID(String DEVICE_ID) {
        this.DEVICE_ID = DEVICE_ID;
    }

    public void setMANUFACTURE_DATE(Date MANUFACTURE_DATE) {
        this.MANUFACTURE_DATE = MANUFACTURE_DATE;
    }

    public void setFIRMWARE_VERSION(Integer FIRMWARE_VERSION) {
        this.FIRMWARE_VERSION = FIRMWARE_VERSION;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public void setCALIBRATION_YEAR(Integer CALIBRATION_YEAR) {
        this.CALIBRATION_YEAR = CALIBRATION_YEAR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return getDEVICE_ID().equals(device.getDEVICE_ID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDEVICE_ID());
    }

    @Override
    public String toString() {
        return "Device{" +
                "DEVICE_ID='" + DEVICE_ID + '\'' +
                ", CALIBRATION_YEAR='" + CALIBRATION_YEAR + '\'' +
                '}';
    }
}
