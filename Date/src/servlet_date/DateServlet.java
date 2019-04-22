package servlet_date;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/date")
public class DateServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html;Charset=utf-8");
	PrintWriter w=resp.getWriter();
	Date nowDate = new Date(System.currentTimeMillis());
	SimpleDateFormat time = new SimpleDateFormat("yyyy年MM月dd日-HH时mm分ss秒");
	w.print("当前系统时间为："+ time.format(nowDate));	
}
}
