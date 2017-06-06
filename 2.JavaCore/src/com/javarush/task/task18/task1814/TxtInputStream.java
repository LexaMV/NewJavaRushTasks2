package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.javarush.task.task18.task1813.AmigoOutputStream.fileName;

/* 
UnsupportedFileName

 public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(String.valueOf(fileOutputStream));
        this.original = fileOutputStream;
    }


*/

public class TxtInputStream extends FileInputStream {

    private FileInputStream original;

    public TxtInputStream(FileInputStream fileInputStream) throws FileNotFoundException {
        super(String.valueOf(fileInputStream));
        this.original = fileInputStream;
    }

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
        super(fileName);

        if (!fileName.endsWith(".txt")) {
            throw new UnsupportedFileNameException();
        }
    }



   // public void read() throws IOException, UnsupportedFileNameException{
   //     String s = fileName.substring(fileName.length()-4, fileName.length());
    //    if(s.equals(".txt")){
    //        return super.read();
    //    }
     //   else
    //    {
    //        super.close();
     //       new UnsupportedFileNameException();
     //   }

   // }




    public static void main(String[] args) {
    }
}

