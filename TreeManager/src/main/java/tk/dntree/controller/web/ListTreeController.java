package tk.dntree.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tk.dntree.constant.SystemConstant;
import tk.dntree.model.TreeModel;
import tk.dntree.service.ITreeService;

@WebServlet(urlPatterns = { "/list-tree" })
public class ListTreeController extends HttpServlet {
	@Inject
	private ITreeService treeService;
	private static final long serialVersionUID = 2990196416970679956L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TreeModel model = new TreeModel();
		model.setListResult(treeService.findAll());
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/list-tree.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
