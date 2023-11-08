package org.example.utility;

import org.example.entities.Person;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SaveStudentInfo {
    public void saveFile(List<Person> list, String fileName)  {

        try{
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fw);
            int len = list.size();
            for (int i = 0; i < len; i++){
                writer.write(list.get(i).toString()+ "\n");
            }
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
