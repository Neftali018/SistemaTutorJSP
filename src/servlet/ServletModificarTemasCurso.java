package servlet;

import controller.controladorTemasCurso;
import include.TemasCurso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarTemasCurso", urlPatterns = {"/modificarTemasCurso"})
public class ServletModificarTemasCurso extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_temas = 0;

        try {
            id_temas = Integer.parseInt(request.getParameter("id_temas"));

        } catch (NumberFormatException e) {

        }
        String nombre_tema = request.getParameter("nombre_tema");

        int id_curso = 0;
        try {
            id_curso = Integer.parseInt(request.getParameter("id_curso"));

        } catch (NumberFormatException e) {

        }

        TemasCurso nuevoTemasCurso = new TemasCurso(id_temas, nombre_tema, id_curso);

        controladorTemasCurso cc = new controladorTemasCurso();
        if (cc.actualizarTemasCurso(nuevoTemasCurso)) {
            response.sendRedirect("Temascursos.jsp");
        } else {
            response.sendRedirect("m_temascursos.jsp?clave=" + id_temas);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
