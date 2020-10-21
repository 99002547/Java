package com.lts.foodwiring;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Indian implements Menu {

	@Override
	public List<String> itemsAvailable() {
		List<String> list=new ArrayList<>();
		list.add("Dosa");
		list.add("Idli");
		list.add("Upma");
		list.add("Puri");
		return list;
	}

}
