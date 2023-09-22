/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

/**
 *
 * @author fa20-bse-011
 */
public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      Observer ob1  = new HexaObserver(subject);
      Observer ob2  = new OctalObserver(subject);
      Observer ob3  = new BinaryObserver(subject);
      

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
      subject.detach(ob2);
      
      System.out.println("---------------------------");
      System.out.println("First state change: 15");	
      subject.setState(1);
      System.out.println("Second state change: 10");	
      subject.setState(2);
   }
}
