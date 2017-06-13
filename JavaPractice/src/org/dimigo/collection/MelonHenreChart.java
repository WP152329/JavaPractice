/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ MelonHenreChart
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 13.
 * </pre>
 *
 * @author 		: cdb23
 * @version		: 1.0
 */
public class MelonHenreChart {

	public static void main(String[] args) {
		List<Music> dancelist = new ArrayList<Music>();
		dancelist.add(new Music("I LUV IT", "PSY"));
		dancelist.add(new Music("맞지?", "언니쓰"));
		
		List<Music> baladlist = new ArrayList<Music>();
		baladlist.add(new Music("팔레트", "아이유"));
		
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", baladlist);
		map.put("댄스", dancelist);
		
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		System.out.println();
		
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		dancelist.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		System.out.println();
		
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		map.remove("댄스", dancelist.remove(0));
		printMap(map);	
		System.out.println();
		
		System.out.println("-- << 전체 리스트 삭제 >> --");
		map.clear();
		printMap(map);
	}
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()) {
			int i=1;
			System.out.println("["+ key + "]");
			for(Music a : map.get(key)){
				System.out.println(i +". " + a.toString());
				i+=1;
			}
			
		}
	}
	

}
