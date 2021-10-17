import java.io.*;

public class Main {

  public static void main(String[] args) {
    // создаем каталоги и подкаталоги для src
    File src1 = new File("Games//src//main"); 
    if (src1.mkdirs()) 
      System.out.println("Каталог " + src1.getParent() + "/" + src1.getName());

    File src2 = new File("Games//src//test"); 
    if (src2.mkdir()) 
      System.out.println("Каталог " + src2.getParent() + "/" + src2.getName());

    // создаем каталоги и подкаталоги для res
    File res1 = new File("Games//res//drawables");
    if (res1.mkdirs())
      System.out.println("Каталог " + res1.getParent() + "/" + res1.getName());
    
    File res2 = new File("Games//res//vectors");
    if (res2.mkdir())
      System.out.println("Каталог " + res2.getParent() + "/" + res2.getName());
    
    File res3 = new File("Games//res//icons");
    if (res3.mkdir())
      System.out.println("Каталог " + res3.getParent() + "/" + res3.getName());
    
    
    File savegames = new File("Games//savegames");
    if (savegames.mkdir())
      System.out.println("Каталог " + savegames.getName());
    
    // создаем каталог
    File temp = new File("Games//temp");
    if (temp.mkdir())
      System.out.println("Каталог " + temp.getName());
    
    // создаем файлы
    File file1 = new File("Games//temp//temp.txt");
    try {
      if (file1.createNewFile())
        System.out.println("Путь " + file1.getParent() + " Файл " + file1.getName());
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }

        File file2 = new File("Games//src//main//Main.java");
    try {
      if (file2.createNewFile())
        System.out.println("Путь " + file2.getParent() + " Файл " + file2.getName());
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }

    File file3 = new File("Games//src//main//Utils.java");
    try {
      if (file3.createNewFile())
        System.out.println("Путь " + file3.getParent() + " Файл " + file3.getName());
    } catch (IOException ex) {
        System.out.println(ex.getMessage());
    }
    
    //String text = ""Путь " + file3.getParent() + " Файл " + file3.getName()";
    try (FileWriter writer = new FileWriter("Games//temp//temp.txt", true)) {
      writer.write(src1.toString());
      writer.write("  ");
      writer.append(src2.toString());
      writer.write("  ");
      writer.append(res1.toString());
      writer.write("  ");
      writer.append(res2.toString());
      writer.write("  ");      
      writer.append(res3.toString());
      writer.write("  ");      
      writer.append(savegames.toString());
      writer.write("  ");      
      writer.append(temp.toString());
      writer.write("  ");      
      writer.append(file1.toString());
      writer.write("  ");      
      writer.append(file2.toString());  
      writer.write("  ");      
      writer.append(file3.toString());           
      writer.flush();
    } catch (IOException ex) {
        System.out.println(ex.getMessage());  
    }
  }
}