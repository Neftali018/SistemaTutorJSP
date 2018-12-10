<%--
  Created by IntelliJ IDEA.
  User: Neftali
  Date: 05/12/2018
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Curso" %>
<%@ page import="controller.controladorCurso" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Cursos</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="Curso.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>IDCURSO</th>
                    <th>NOMBRE CURSO</th>
                    <th>NIVEL</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorCurso cc = new controladorCurso();
                    int contador = 0;
                    ArrayList<Curso> curso = new ArrayList<Curso>();
                    curso = cc.obtenerCurso();
                    if(curso.size() > 0){
                        for(int a=0; a<curso.size();a++){
                            htmlcode += "<tr><td>" + curso.get(a).getId_curso()
                                    + "</td><td>" + curso.get(a).getNombre_curso()
                                    + "</td><td>" + curso.get(a).getNivel()
                                    + "</td><td>" +
                                    "<a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_curso.jsp?id_curso="+curso.get(a).getId_curso()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_curso('"+curso.get(a).getId_curso()+"')\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";

                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen cursos</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>

