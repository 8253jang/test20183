package kosta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
   void execute(HttpServletRequest request, HttpServletResponse respons)
				   throws ServletException, IOException;
}
