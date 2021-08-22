package by.http.newsportal.controller;

import java.util.HashMap;
import java.util.Map;
import by.http.newsportal.controller.impl.AddNews;
import by.http.newsportal.controller.impl.ChangeLocal;
import by.http.newsportal.controller.impl.GoToAddNews;
import by.http.newsportal.controller.impl.GoToLogInPage;
import by.http.newsportal.controller.impl.GoToLogInInfoPage;
import by.http.newsportal.controller.impl.GoToMainPage;
import by.http.newsportal.controller.impl.GoToRegistrationInfoPage;
import by.http.newsportal.controller.impl.GoToRegistrationPage;
import by.http.newsportal.controller.impl.LogIn;
import by.http.newsportal.controller.impl.Registration;
import by.http.newsportal.controller.impl.UnknownCommand;

public class CommandProvider {
	private Map<CommandName, ICommand> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
		commands.put(CommandName.GO_TO_LOG_IN_PAGE, new GoToLogInPage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		commands.put(CommandName.GO_TO_ADD_NEWS_PAGE, new GoToAddNews());
		commands.put(CommandName.GO_TO_LOG_IN_INFO_PAGE, new GoToLogInInfoPage());
		commands.put(CommandName.CHANGE_LOCAL, new ChangeLocal());
		commands.put(CommandName.REGISTRATION, new Registration());
		commands.put(CommandName.LOG_IN, new LogIn());
		commands.put(CommandName.ADD_NEWS, new AddNews());
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
