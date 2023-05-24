package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Coins;

@Repository
public class CoinsRepo {

	private List<Coins> lists = new ArrayList<Coins>();
//	private static List<Coins> lists = new ArrayList<Coins>();
//	static {
//		lists.add(new Coins("1cent", 100, 0.01d));
//		lists.add(new Coins("5cent", 100, 0.05d));
//		lists.add(new Coins("10cent", 100, 0.10d));
//		lists.add(new Coins("25cent", 100, 0.25d));
//	}
	
	public CoinsRepo() {
		lists.add(new Coins("c25", 100, 0.25d));
		lists.add(new Coins("c10", 100, 0.10d));
		lists.add(new Coins("c05", 100, 0.05d));
		lists.add(new Coins("c01", 100, 0.01d));
	}
	
	
	public List<Coins> getCoins() {
		return lists;
	}
	
	
}
