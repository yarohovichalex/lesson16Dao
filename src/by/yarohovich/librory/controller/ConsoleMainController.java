package by.yarohovich.librory.controller;

import by.yarohovich.librory.action.BaseAction;
import by.yarohovich.librory.action.util.ActionManager;

public class ConsoleMainController {
	private static final int USER_INPUT = 1;

	public static void main(String[] args) {
		
		
		BaseAction action = ActionManager.chooseAction(USER_INPUT);
		action.doSmth();
	}

}
