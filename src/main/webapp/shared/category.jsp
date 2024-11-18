<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="model.TheLoai"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            ArrayList<TheLoai> dsTheLoai = (ArrayList<TheLoai>) request.getAttribute("dsTheLoai");
            for (TheLoai t : dsTheLoai) {
        %>

        <li class="list-group-item"> <a href="product?MaLoai=<%=t.getMaloai()%>" class="text-decoration-none"> <i class="bi bi-arrow-right-circle"></i> <%=t.getTenloai()%> </a> </li>
            <%
                }
            %>
    </ul>   
</div>
