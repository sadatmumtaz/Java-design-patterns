/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Basic.Iterator;

/**
 *
 * @author user
 */
public class Demo {

	public static void main(String[] args) {
		TV tv = new ConcreteTV();
		
		Iterator it = tv.getIterator();
		
		while(it.hasMore()){
			System.out.println("My TV is playing "+it.getNext()+" now");
		}

	}

}
