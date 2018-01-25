package by.yarohovich.librory.action.util;

import by.yarohovich.librory.action.BaseAction;
import by.yarohovich.librory.action.console.AddBookImpl;
import by.yarohovich.librory.action.console.ViewBookListImpl;

public class ActionManager {
	public static BaseAction chooseAction(int userInput) {
		
		//problim NPE
		BaseAction action = null;
		
		switch(userInput) {
		case 1: action = new ViewBookListImpl();
			break;
		case 2:	action = new AddBookImpl();
			break;
		case 3:
			break;
		default: 
			break;
		}
		return action;
	}
}	
