/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author 		: cdb23
 * @version		: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SmartPhone[] phone ={
			new IPhone("iPhone7", "애플", 900000),
			new Galaxy("갤럭시 S8", "삼성", 800000),
		};
		
		for(SmartPhone i : phone){
			System.out.println(i.toString());
			i.turnOn();
			i.pay();
			i.useSpecialFunction(i);
			i.turnOff();
		}
		
		
	}

}
