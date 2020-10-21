package com.lts.foodwiring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinese implements Menu {

	@Override
	public List<String> itemsAvailable() {
		List<String> list=new ArrayList<>();
		list.add("Noodles");
		list.add("Fried rice");
		list.add("Gobi");
		return list;
	}

}
