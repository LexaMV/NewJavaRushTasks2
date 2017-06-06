package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.ArrayList;

/*
Проход по дереву файлов

1. На вход метода main подаются два параметра.
Первый — path — путь к директории, второй — resultFileAbsolutePath — имя файла, который будет содержать результат.
2. Для каждого файла в директории path и в ее всех вложенных поддиректориях выполнить следующее:
2.1. Если у файла длина в байтах больше 50, то удалить его (используй метод FileUtils.deleteFile).
2.2. Если у файла длина в байтах НЕ больше 50, то для всех таких файлов:
2.2.1. Отсортировать их по имени файла в возрастающем порядке, путь не учитывать при сортировке.
2.2.2. Переименовать resultFileAbsolutePath в ‘allFilesContent.txt‘ (используй метод FileUtils.renameFile).
2.2.3. В allFilesContent.txt последовательно записать содержимое всех файлов из п. 2.2.1. Тела файлов разделять «n«.
Все файлы имеют расширение txt.


Требования:
1. Файл, который приходит вторым параметром в main, должен быть переименован в allFilesContent.txt.
2. Нужно создать поток для записи в переименованный файл.
3. Пройдись по всем файлам в директории, которая приходит первым параметром в main, и всех ее поддиректориях. Файлы с размером более 50 байт нужно удалить используя метод FileUtils.deleteFile.
4. Содержимое всех файлов, размер которых не превышает 50 байт, должно быть записано в файл allFilesContent.txt в отсортированном по имени файла порядке.
5. Поток для записи в файл нужно закрыть.



*/
public class Solution {

    public static ArrayList<File> list = new ArrayList<>();
    public static void main(String[] args) {
        File path = new File(args[0]);
        File result = new File(args[1]);

        //ArrayList<File> list = new ArrayList<>();
    }


        public static void drevo(File pyth){
         //   ArrayList<File> list = new ArrayList<>();
        for(File file : pyth.listFiles()){
            if (file.isFile()){
                list.add(file);
            }
            if (file.isDirectory()){

            }
        }
   }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}
