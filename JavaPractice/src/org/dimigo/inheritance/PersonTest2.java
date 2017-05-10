/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author 		: cdb23
 * @version		: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person[] person = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍"),
		};
		
//		Person e = new Person("Tom");
//		Korean k = new Korean("홍길동");
//		Japanese j = new Japanese("다나카");
//		Chinese c = new Chinese("왕밍");
//		
		for(Person p : person){
			System.out.println(p);
			p.sayHello();
			p.sayBye();
			System.out.println();
		}
		
////		System.out.println(e);
////		System.out.println(k);
////		System.out.println(j);
////		System.out.println(c);
////		System.out.println();
//		
//		e.sayHello();
//		k.sayHello();
//		j.sayHello();
//		c.sayHello();
//		System.out.println();
//		
//		e.sayBye();
//		k.sayBye();
//		j.sayBye();
//		c.sayBye();
//		System.out.println();
		
	}

}
