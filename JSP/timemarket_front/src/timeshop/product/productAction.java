package timeshop.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.Action.Action;

public class productAction implements Action {
public String requestProcess(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		return "/page/product/product.jsp";
	}
}
