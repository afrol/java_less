package less_10;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class FileManager {
    private final ObjectMapper mapper;

    public FileManager() {
        mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);
    }

    public void write(String name, Object obj) {
        FileWriter file = null;
        try {
            String stringObj = mapper.writeValueAsString(obj);

            file = new FileWriter(resolveFilePath(name));
            file.write(stringObj);
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("JSON Object: " + stringObj);
        } catch (JsonProcessingException e) {
        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            try {
                if (file != null) {
                    file.flush();
                    file.close();
                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Contact> load(String name) {
        try {
            String stringObj = new String(Files.readAllBytes(Paths.get(resolveFilePath(name))));

            return mapper.readValue(stringObj, new TypeReference<ArrayList<Contact>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String resolveFilePath(String name) {
        String path = "/Users/Shared/";
        String extension = ".txt";
        return path + name + extension;
    }
}
