/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.filedecorators;
import java.nio.charset.StandardCharsets;


/**
 *
 * @author user
 */
class UTF8Decorator extends DataSourceDecorator {
    public UTF8Decorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // Assume data is already in UTF-8 encoding
        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();
        System.out.println("Converting data to UTF-8: " + data);
        byte[] utf8Bytes = data.getBytes(StandardCharsets.UTF_8);
        return new String(utf8Bytes, StandardCharsets.UTF_8);
    }
}
