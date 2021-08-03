package by.http.newsportal.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ICommand {
	void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
