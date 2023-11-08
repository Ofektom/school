package org.example.utility;


import org.example.services.FileInputServices;

import javax.swing.*;
import java.io.*;

public class FileInputServiceImpl implements FileInputServices{
//    public BufferedReader openFile() throws IOException {
//        BufferedReader doc = null;
//        JFileChooser chooser = new JFileChooser();
//        int returnVal = chooser.showOpenDialog(null);
//        if(returnVal == JFileChooser.APPROVE_OPTION) {
//            doc = openFile(chooser.getSelectedFile().getAbsoluteFile());
//    }
//        return doc;
//    }

    public BufferedReader openFile(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufReader = new BufferedReader(fileReader);
        return bufReader;

    }
}
