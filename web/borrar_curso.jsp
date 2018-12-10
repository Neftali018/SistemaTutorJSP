<%@ page import="controller.controladorCurso" %>
<%
    int id_curso = 0;

    try {
        id_curso = Integer.parseInt(request.getParameter("id_curso"));

    } catch (NumberFormatException e) {

    }
    controladorCurso cc = new controladorCurso();
    if(cc.eliminarCurso(id_curso)){
        response.sendRedirect("Cursos.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
