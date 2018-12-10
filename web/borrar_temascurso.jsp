<%@ page import="controller.controladorTemasCurso" %>
<%
    int id_temas = 0;

    try {
        id_temas = Integer.parseInt(request.getParameter("id_temas"));

    } catch (NumberFormatException e) {

    }
    controladorTemasCurso cc = new controladorTemasCurso();
    if(cc.borrarTemasCurso(id_temas)){
        response.sendRedirect("Temascursos.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>
