package by.http.newsportal.controller;

import java.util.HashMap;
import java.util.Map;

import by.http.newsportal.controller.impl.AddNews;
import by.http.newsportal.controller.impl.ChangeLocal;
import by.http.newsportal.controller.impl.DeleteNews;
import by.http.newsportal.controller.impl.GoToMainPage;
import by.http.newsportal.controller.impl.GoToManageNews;
import by.http.newsportal.controller.impl.GoToAddNews;
import by.http.newsportal.controller.impl.GoToAuthorizationInfoPage;
import by.http.newsportal.controller.impl.GoToAuthorizationPage;
import by.http.newsportal.controller.impl.GoToRegistrationInfoPage;
import by.http.newsportal.controller.impl.GoToRegistrationPage;
import by.http.newsportal.controller.impl.GoToUpdateNews;
import by.http.newsportal.controller.impl.GoToViewAllNewsPage;
import by.http.newsportal.controller.impl.GoToViewNewsPage;
import by.http.newsportal.controller.impl.Authorization;
import by.http.newsportal.controller.impl.Registration;
import by.http.newsportal.controller.impl.UnknownCommand;
import by.http.newsportal.controller.impl.UpdateNews;

public class CommandProvider {
	private Map<CommandName, ICommand> commands = new HashMap<>();

	public CommandProvider() {
		commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
		commands.put(CommandName.GO_TO_AUTHORIZATION_PAGE, new GoToAuthorizationPage());
		commands.put(CommandName.GO_TO_AUTHORIZATION_INFO_PAGE, new GoToAuthorizationInfoPage());
		commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
		commands.put(CommandName.GO_TO_REGISTRATION_INFO_PAGE, new GoToRegistrationInfoPage());
		commands.put(CommandName.GO_TO_ADD_NEWS_PAGE, new GoToAddNews());
		commands.put(CommandName.GO_TO_MANAGE_NEWS, new GoToManageNews());
		commands.put(CommandName.GO_TO_UPDATE_NEWS, new GoToUpdateNews());
		commands.put(CommandName.GO_TO_VIEW_NEWS_PAGE, new GoToViewNewsPage());  
		commands.put(CommandName.GO_TO_VIEW_ALL_NEWS_PAGE, new GoToViewAllNewsPage());  
		commands.put(CommandName.CHANGE_LOCAL, new ChangeLocal());
		commands.put(CommandName.REGISTRATION, new Registration());
		commands.put(CommandName.AUTHORIZATION, new Authorization());
		commands.put(CommandName.ADD_NEWS, new AddNews());
		commands.put(CommandName.DELETE_NEWS, new DeleteNews());
		commands.put(CommandName.UPDATE_NEWS, new UpdateNews());
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
