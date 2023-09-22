/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator.filedecorators;

/**
 *
 * @author user
 */
class ApplicationConfigurator {
    public void configurationExample(boolean enabledEncryption, boolean enabledCompression) {
        DataSource source = new FileDataSource("salary.dat");

        if (enabledCompression) {
            source = new CompressionDecorator(source);
        }

        if (enabledEncryption) {
            source = new EncryptionDecorator(source);
        }

        SalaryManager logger = new SalaryManager(source);
        String salary = logger.load();
        System.out.println("Loaded salary data: " + salary);
    }
}