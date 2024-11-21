package main.fpij.test;

import java.io.Serializable;

public class DeviceParamBase implements Serializable {


    private Long id;

    protected String paramId;
    protected String paramName;
    protected Device device;

    public DeviceParamBase() {

    }

    public DeviceParamBase(Long id, String paramId, String paramName, Device device) {
        this.id = id;
        this.paramId = paramId;
        this.paramName = paramName;
        this.device = device;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "DeviceParamBase{" +
                "id=" + id +
                ", paramId='" + paramId + '\'' +
                ", paramName='" + paramName + '\'' +
                ", device=" + device +
                '}';
    }
}
