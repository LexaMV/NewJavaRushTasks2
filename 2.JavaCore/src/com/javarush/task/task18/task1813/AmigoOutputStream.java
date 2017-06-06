package com.javarush.task.task18.task1813;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream

Требования:
1. Метод main изменять нельзя.
2. Класс AmigoOutputStream должен наследоваться от класса FileOutputStream.
3. Класс AmigoOutputStream должен принимать в конструкторе обьект типа FileOutputStream.
4. Все методы write(), flush(), close() в классе AmigoOutputStream должны делегировать свое выполнение объекту FileOutputStream.
5. Метод close() должен сначала вызвать метод flush(), затем дописать текст, затем закрыть поток.



*/

public class AmigoOutputStream extends FileOutputStream{
    private FileOutputStream original;

    //public AmigoOutputStream(String name) throws FileNotFoundException {
   //    super(name);
  //  }

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(String.valueOf(fileOutputStream));
        this.original = fileOutputStream;
    }

    //public void AmigoOutputStream(FileOutputStream fileOUT)
   // {
  //      this.original = fileOUT;
  //  }



    public void close() throws IOException {

        original.flush();
        String s = "JavaRush © All rights reserved.";
        byte[] bytesArray = s.getBytes();
        original.write(bytesArray);
        original.close();
    }

    public void write(byte[] b) throws IOException {
        original.write(b);
    }

    public void write(int b) throws IOException {
        original.write(b);
    }


    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }




    public void flush() throws IOException {
        original.flush();
    }

    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
