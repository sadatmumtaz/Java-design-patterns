/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.filedecorators;

/**
 *
 * @author user
 */
class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data: " + data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("Decompressing data: " + data);
        return data;
    }
}