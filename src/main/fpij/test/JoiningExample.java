package main.fpij.test;

import main.fpij.cap3.comparator.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {


    public static void main(String[] args) {

        Device device1 = new Device(1l,"device1");
        Device device2 = new Device(2l,"device2");
        Device device3 = new Device(3l,"device3");
        Device device4 = new Device(4l,"device4");

        DeviceParamBase deviceParamBase = new DeviceParamBase(1l,"1","param1", device1);
        DeviceParamBase deviceParamBase2 = new DeviceParamBase(1l,"2","param2", device1);
        DeviceParamBase deviceParamBase3 = new DeviceParamBase(2l,"3","param3", device2);

        Stream<DeviceParamBase> stream = Stream.of(deviceParamBase, deviceParamBase2, deviceParamBase3);

        Map<String, List<DeviceParamBase>> paramsByDevice = stream
                .collect(Collectors.groupingBy(p-> String.valueOf(p.getDevice().getId())));

        System.out.println("paramsByDevice:" + paramsByDevice.entrySet());
/*
input :[1=[DeviceParamBase{id=1, paramId='1', paramName='param1', device=Device{id=1, name='device1'}}, DeviceParamBase{id=1, paramId='2', paramName='param2', device=Device{id=1, name='device1'}}], 2=[DeviceParamBase{id=2, paramId='3', paramName='param3', device=Device{id=2, name='device2'}}]]
output:{1=[param1, param2], 2=[param3]}
 */

        Map<String, List<String>> parameterMap = paramsByDevice.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), // Extract device ID as key
                        entry -> entry.getValue().stream()
                                .map(DeviceParamBase::getParamName)
                                .collect(Collectors.toList()))); // Extract parameter names as list

        System.out.println("parameterMap:" + parameterMap);

        Map<String, List<String>> result = new HashMap<>();
        for(Map.Entry<String, List<DeviceParamBase>> entry : paramsByDevice.entrySet()){
            List<DeviceParamBase> listaDevices = paramsByDevice.get(entry.getKey());
            List<String> parameters = new ArrayList<>();
            for( DeviceParamBase deviceP : listaDevices){
                parameters.add(deviceP.getParamName());
            }
            result.put(entry.getKey(), parameters);
        }
        System.out.println("result: " + result);

    }
}
