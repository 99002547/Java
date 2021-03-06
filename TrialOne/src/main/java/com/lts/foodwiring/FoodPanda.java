package com.lts.foodwiring;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
	@Autowired
	@Qualifier("chinese")
	Menu cMenu;
	@Autowired
	@Qualifier("indian")
	Menu iMenu;
	
	public List<String> showMenu(String choice)
	{
		if(choice.equals("chinese")) {
			return cMenu.itemsAvailable();
			
		}
		else if(choice.equals("indian")) {
			return iMenu.itemsAvailable();
			
		}
		return null;
	}

}
