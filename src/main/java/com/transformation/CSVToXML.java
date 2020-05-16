package com.transformation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVToXML {
    public static void main(String[] args) throws IOException {
      List<String> lines=Files.readAllLines(Paths.get(new File("employee.csv").getAbsolutePath()));
      List<Employee> employees=new ArrayList<>();
        lines.remove(0);
      for(String line:lines) {
          Employee e = convertLineIntoEmoployee(line);
          XmlMapper objectMapper=   xmlMapper();

          String xmlString= objectMapper.writeValueAsString(e);
          System.out.println(xmlString);
      }
        //System.out.println(employees);

    }

    public static XmlMapper xmlMapper(){
        XmlMapper objectMapper=new XmlMapper();
        return objectMapper;
    }
    private static Employee convertLineIntoEmoployee(String line) {
      String[] columns=  line.split("\\|");
      Employee e=new Employee(columns[0],columns[1],columns[2],columns[3]);
      return e;
    }
}
