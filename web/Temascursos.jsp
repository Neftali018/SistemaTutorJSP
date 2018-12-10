<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.TemasCurso" %>
<%@ page import="controller.controladorTemasCurso" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Temas Curso</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="Temascurso.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>ID TEMAS</th>
                    <th>NOMBRE TEMA</th>
                    <th>ID CURSO</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorTemasCurso cc = new controladorTemasCurso();
                    int contador = 0;
                    ArrayList<TemasCurso> temas_curso = new ArrayList<TemasCurso>();
                    temas_curso = cc.obtenerTemasCurso();
                    if(temas_curso.size() > 0){
                        for(int a=0; a<temas_curso.size();a++){
                            htmlcode += "<tr><td>" + temas_curso.get(a).getId_temas()
                                    + "</td><td>" + temas_curso.get(a).getNombre_tema()
                                    + "</td><td>" + temas_curso.get(a).getId_curso()
                                    + "</td><td>" +
                                    "<a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"m_temascursos.jsp?id_temas="+temas_curso.get(a).getId_temas()+"\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" onclick=\"delete_temascurso('"+temas_curso.get(a).getId_temas()+"')\"><i class=\"material-icons\">delete</i></a>"
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
