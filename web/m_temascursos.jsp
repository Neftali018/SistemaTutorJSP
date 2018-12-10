
<%@ page import="controller.controladorTemasCurso" %>
<%@ page import="include.TemasCurso" %>
<%@ page import="include.Curso" %>
<%@ page import="controller.controladorCurso" %>

<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int id_temas = Integer.parseInt(request.getParameter("id_temas"));
    controladorTemasCurso cc = new controladorTemasCurso();
    ArrayList<TemasCurso> temas_curso = new ArrayList<TemasCurso>();
    temas_curso = cc.obtenerTemaCurso(id_temas);
%>

<%
    controladorCurso cu = new controladorCurso();
    ArrayList<Curso> curso = new ArrayList<Curso>();
    curso = cu.obtenerCurso();


    String htmlselect = "";
    htmlselect += "<select name=\"id_curso\">\n" +
            "                <option value=\"\" selected disabled>Elige el curso" +
            "</option>\n";
    for(int a=0; a<curso.size();a++){
        htmlselect += "<option value=\""+curso.get(a).getId_curso()+"\">"+curso.get(a).getNombre_curso()+"</option>\n";
    }
    htmlselect += "            </select>";

%>

<div class="container">
    <form class="col s12" action="/modificarTemasCurso" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar Temas Curso</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_temas" name="id_temas" type="text" readonly="readonly" value="<% out.print(temas_curso.get(0).getId_temas()); %>">
                <label for="id_temas" class="center-align">Temas Curso</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_tema" name="nombre_tema" type="text" value="<% out.print(temas_curso.get(0).getNombre_tema()); %>">
                <label for="nombre_tema" class="center-align">Nombre Tema</label>
            </div>
            <div class="col s2">

            </div>
        </div>


        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <%
                    out.print(htmlselect);
                %>

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="Temascursos.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
