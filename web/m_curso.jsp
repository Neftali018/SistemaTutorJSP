<%@ page import="controller.controladorCurso" %>
<%@ page import="include.Curso" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    int id_curso = Integer.parseInt(request.getParameter("id_curso"));
    controladorCurso cc = new controladorCurso();
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    cursos = cc.obtenerCursos(id_curso);
%>

<div class="container">
    <form class="col s12" action="/modificarCurso" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar curso</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_curso" name="id_curso" type="text" readonly="readonly" value="<% out.print(cursos.get(0).getId_curso()); %>">
                <label for="id_curso" class="center-align">Curso</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_curso" name="nombre_curso" type="text" value="<% out.print(cursos.get(0).getNombre_curso()); %>">
                <label for="nombre_curso" class="center-align">Nombre Curso</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nivel" name="nivel" type="text" value="<% out.print(cursos.get(0).getNivel()); %>">
                <label for="nivel" class="center-align">Nivel</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="Cursos.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>
