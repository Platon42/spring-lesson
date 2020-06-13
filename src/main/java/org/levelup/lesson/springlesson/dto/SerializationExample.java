package org.levelup.lesson.springlesson.dto;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee empObj = new Employee("Maksim", "Tikhonov", "JJ", 90, "IT");
        System.out.println("Object before serialization  => " + empObj.toString());
        // Serialization
        serialize(empObj);
        // Deserialization
        Employee deserialisedEmpObj = deserialize();
        System.out.println("Object after deserialization => " + deserialisedEmpObj.toString());
    }
    // Serialization code
    static void serialize(Employee empObj) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("data.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(empObj);
        }
    }
    // Deserialization code
    static Employee deserialize() throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("data.obj");
             ObjectInputStream ois = new ObjectInputStream(fis))
        {
            return (Employee) ois.readObject();
        }
    }
}
