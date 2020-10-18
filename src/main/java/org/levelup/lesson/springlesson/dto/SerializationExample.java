package org.levelup.lesson.springlesson.dto;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee empObj = new Employee("Maksim", "Tikhonov", "JJ", 200, "IT");
        Employee empObj2 = new Employee("Ivan", "2", "JJ", 18, "IT");
        Employee empObj3 = new Employee("Elena", "3", "JJ", 78, "IT");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(empObj);
        employeeList.add(empObj2);
        employeeList.add(empObj3);
        System.out.println("Object before serialization  => " + Arrays.toString(employeeList.toArray()));
        // Serialization
        serialize(employeeList);
        // Deserialization
        List<Employee> deserialisedEmpObj = deserialize();
        System.out.println("Object after deserialization => " + deserialisedEmpObj.toString());
    }
    // Serialization code
    static void serialize(List<Employee> empObj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(empObj);
        }
    }
    // Deserialization code
    static List<Employee> deserialize() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            return (List<Employee>) ois.readObject();
        }
    }
}
