package servlet;

import controller.controladorCurso;
import include.Curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletModificarCurso", urlPatterns = {"/modificarCurso"})
public class ServletModificarCurso extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id_curso = 0;

        try {
            id_curso = Integer.parseInt(request.getParameter("id_curso"));

        } catch (NumberFormatException e) {

        }


        String nombre_curso = request.getParameter("nombre_curso");
        String nivel = request.getParameter("nivel");


        Curso nuevoCurso = new Curso(id_curso, nombre_curso, nivel);

        controladorCurso cc = new controladorCurso();
        if (cc.actualizarCurso(nuevoCurso)) {
            response.sendRedirect("Cursos.jsp");
        } else {
            response.sendRedirect("m_curso.jsp?clave=" + id_curso);
        }
    }


        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }
    }

