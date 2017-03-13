/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator.java
 * 
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 * @author : cdb12
 * @version : 1.0
 */
public class Operator {

	
	public static void main(String[] args) {
		
		int wol = 1700000, gik = 3, su = 1500;
		long in = (long)wol *12 * gik * su;
		String.format("%,d", 10000);
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n", wol);
		System.out.printf("점포 내 직원 수 : %,d명\n", gik);
		System.out.printf("점포 수 : %,d개\n\n", su);
		System.out.printf("연간 인건비 : %,d원", in);

	}

}
