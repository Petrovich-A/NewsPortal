package by.http.newsportal.controller;

import java.util.HashMap;
import java.util.Map;

import by.http.newsportal.controller.impl.ChangeLocal;
import by.http.newsportal.controller.impl.GoToLogIn;
import by.http.newsportal.controller.impl.GoToLogInInfo;
import by.http.newsportal.controller.impl.GoToMainPage;
import by.http.newsportal.controller.impl.GoToRegistration;
import by.http.newsportal.controller.impl.RegistrationNewUser;
import by.http.newsportal.controller.impl.UnknownCommand;

public class CommandProvider {
	private Map<CommandName, ICommand> commands = new HashMap<>();
	
	public CommandProvider(){
		commands.put(CommandName.LOGIN, new GoToLogIn());
		commands.put(CommandName.REGISTRATION, new GoToRegistration());
		commands.put(CommandName.REGISTRATION_NEW_USER, new RegistrationNewUser());
		commands.put(CommandName.LOGININFO, new GoToLogInInfo());
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
		commands.put(CommandName.CHANGE_LOCAL, new ChangeLocal());
		
		commands.put(CommandName.UNKNOWN_COMMAND, new UnknownCommand());
	}
	
	public ICommand findCommand(String name) {
		if (name == null) {
			name = CommandName.UNKNOWN_COMMAND.toString();
		}
		
		CommandName commandName;
		try {
			commandName = CommandName.valueOf(name.toUpperCase());
		} catch (IllegalArgumentException e) {
			commandName = CommandName.UNKNOWN_COMMAND;
		}
		ICommand command = commands.get(commandName);
		return command;
	}

}
