<%--
  Created by IntelliJ IDEA.
  User: Neftali
  Date: 27/11/2018
  Time: 07:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="col s12">
    <header id="header" class="page-topbar">
        <nav class="navbar-color gradient-45deg-light-blue-cyan">
            <div class="nav-wrapper">
                <ul class="right hide-on-med-and-down">
                    <li><a href="index.jsp"><i class="material-icons left">home</i>Inicio</a></li>
                    <li>
                        <a href="Cursos.jsp" class="waves-effect waves-block waves-light profile-button"
                           data-activates="document-dropdown">
                            <i class="material-icons left">view_module</i>Cursos
                        </a>

                        <ul id="document-dropdown" class="dropdown-content" style="white-space: nowrap; opacity: 1; left: 1710.64px; position: absolute; top: 64px; display: none;">
                        </ul>
                    </li>
                    <li>
                        <a href="Temascursos.jsp" class="waves-effect waves-block waves-light profile-button"
                           data-activates="document-dropdown">
                            <i class="material-icons left">view_module</i>Temas Curso
                        </a>


                    </li>

                    <li><a href="acercade.jsp"><i class="material-icons left">help</i>Acerca de</a></li>
                    <li>
                        <a href="manual.jsp">
                            <i class="material-icons left">keyboard_tab</i>Manual</a>
                    </li>
                    <li>
                        <a href="logout.jsp">
                            <i class="material-icons left">keyboard_tab</i>Salir</a>
                    </li>
                </ul>
            </div>
        </nav>
        <!-- end header nav-->
    </header>
</div>