<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="controller.controladorCurso" %>
<%@ page import="include.Curso" %>
<%@ page import="java.util.ArrayList" %>



<%
    controladorCurso cc = new controladorCurso();
    ArrayList<Curso> curso = new ArrayList<Curso>();
    curso = cc.obtenerCurso();


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
    <form class="col s12" action="/crearTemasCurso" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Insertar un nuevo Tema </p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="id_temas" name="id_temas" type="text" value="">
                <label for="id_temas" class="center-align">Id Temas</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombre_tema" name="nombre_tema" type="text" value="">
                <label for="nombre_tema" class="center-align">Nombre del tema</label>
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
            <div class="col s4">

            </div>
            <div class="input-field col s4">
                <input type="submit" value="Insertar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s12">
            </div>
            <div class="col s4">

            </div>
        </div>
    </form>
</div>

<jsp:include page='views/footer.jsp'></jsp:include>
