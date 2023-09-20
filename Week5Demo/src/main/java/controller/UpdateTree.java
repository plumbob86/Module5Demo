package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Tree;

/**
 * Servlet implementation class UpdateTree
 */
@WebServlet("/updateTree")
public class UpdateTree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTree() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TreeHelper helper = new TreeHelper();
		
		String oldName = request.getParameter("oldName");
		String commonName = request.getParameter("commonName");
		String latinName = request.getParameter("latinName");
		Double avgHeight = Double.valueOf(request.getParameter("avgHeight"));

		Tree treeToUpdate = helper.searchTreeByName(oldName);
		treeToUpdate.setCommonName(commonName);
		treeToUpdate.setLatinName(latinName);
		treeToUpdate.setAvgHeight(avgHeight);
		helper.update(treeToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
