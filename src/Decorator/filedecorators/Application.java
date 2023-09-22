/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.filedecorators;

/**
 *
 * @author user
 */
class Application {
    
    public static void main(String[] args) {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salaryRecords");

        source = new CompressionDecorator(source);
        source.writeData("salaryRecords");

        source = new EncryptionDecorator(source);
        source.writeData("salaryRecords");
        
        source = new UTF8Decorator(source);
        source.writeData("salaryRecords");
        
    }
}