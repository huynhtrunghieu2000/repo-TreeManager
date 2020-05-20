package tk.dntree.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tk.dntree.service.ITreeService;
import tk.dntree.service.IUserService;

@WebServlet(urlPatterns = { "/form" })
public class FormController extends HttpServlet {
	@Inject
	private ITreeService treeService;
	private static final long serialVersionUID = 2990196416970679956L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("tree", treeService.findAll());
		// request.setAttribute("user", userService.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/form.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
