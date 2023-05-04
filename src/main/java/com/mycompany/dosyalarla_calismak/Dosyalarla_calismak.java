/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dosyalarla_calismak;
//banka ödeme dökümünü farklı versiyonlarla verebilir
//okuyup programa aktarmamız gerekir

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author melek
 */
public class Dosyalarla_calismak {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        writeFile();
        
        
    }
    
    
    public static void createFile(){
        
        File file =new File("C:\\Users\\melek\\OneDrive\\Belgeler\\NetBeansProjects\\files\\students.txt");//dosya yolu oluşturma
        try{
           if(file.createNewFile()){
              System.out.println("Dosya oluşturuldu");
           }else{
             System.out.println("Dosya zaten var");
           }
            
        }catch(IOException e){
         e.printStackTrace(); //printstacktrace oluşan hatayı ekrana yazdırır
        } 
        
    
    }
    
    
    public static void getFileInfo(){ //dosya bilgilerini okumayı sağlayan class
         File file =new File("C:\\Users\\melek\\OneDrive\\Belgeler\\NetBeansProjects\\files\\students.txt");
        if(file.exists()){
            
            System.out.println("dosya adı: " +file.getName());
            System.out.println("dosya yolu: " +file.getAbsolutePath());
            System.out.println("dosya okunabilir mi: " +file.canRead());
            System.out.println("Dosya yazılabilir mi: "+file.canWrite());
            System.out.println("dosya boyutu: "+file.length());
            
            
        
        }
    
    
    }
    
    public static void readFile() throws FileNotFoundException{
        
            File file =new File("C:\\Users\\melek\\OneDrive\\Belgeler\\NetBeansProjects\\files\\students.txt");
            try{
                
                 Scanner reader=new Scanner(file); //file nesnesinde okuma yapmayı sağlar.
                 while(reader.hasNextLine()){ //okunacak satır olduğu sürece okuma işlemi devam edecek.okuma işlemi satır satır yapılır
                     String line=reader.nextLine();//okunan datayı aktarmamız gerekir.
                     System.out.println(line);
                       
                 }
                 
                 reader.close();
            }catch(FileNotFoundException e){
                
                e.printStackTrace();
                
            }       
    
    }
    
    
    public static void writeFile() throws IOException{
        
        
    try {
            FileWriter writer = new FileWriter("C:\\Users\\melek\\OneDrive\\Belgeler\\NetBeansProjects\\files\\students.txt");
            writer.write("Hello World!"); // Write the string to the file
            writer.close(); // Close the writer to save the changes
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    
       
    
    }
    
    
    
    
    
    
    
}


