package lab4.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lab4.model.University;

import java.io.*;

public class JsonManager {
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void writeToFile(University university, String filePath) throws IOException {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(university, writer);
            System.out.println("Serialized object to JSON:");
            System.out.println(gson.toJson(university)); // Log serialized data
        }
    }

    public static University readFromFile(String filePath) throws IOException {
        try (Reader reader = new FileReader(filePath)) {
            University university = gson.fromJson(reader, University.class);
            System.out.println("Deserialized object from JSON:");
            System.out.println(gson.toJson(university)); // Log deserialized data
            return university;
        }
    }
}