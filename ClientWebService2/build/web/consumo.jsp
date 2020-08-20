<%-- 
    Document   : consumo
    Created on : 20/08/2020, 05:42:20 PM
    Author     : Aaron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora de sueldos por hora de trabajadores DGIP!</h1>

        <%!
            String sueldohora;
            String dia1, dia2, dia3, dia4, dia5, dia6, dia7, con;
        %>

        <form action="consumo.jsp" method="POST">
            <div class="form-group">
                <label for="valor">Valor por hora: </label>
                <input type="text" name="valor"/>
                <br>
                <label for="valor">Horas Trabajadas día Lunes: </label>
                <input type="text" name="lunes"/>
                <br>
                <label for="valor">Horas Trabajadas día Martes: </label>
                <input type="text" name="martes"/>
                <br>
                <label for="valor">Horas Trabajadas día Miércoles: </label>
                <input type="text" name="miercoles"/>
                <br>
                <label for="valor">Horas Trabajadas día Jueves: </label>
                <input type="text" name="jueves"/>
                <br>
                <label for="valor">Horas Trabajadas día Viernes: </label>
                <input type="text" name="viernes"/>
                <br>
                <label for="valor">Horas Trabajadas día Sábado: </label>
                <input type="text" name="sabado"/>
                <br>
                <label for="valor">Horas Trabajadas día Domingo: </label>
                <input type="text" name="domingo"/>
                <br>
                <label for="valor">Digite 1 si desea saber el sueldo o digite 2 si desea ver las horas de la semana: </label>
                <input type="text" name="menu"/>
            </div>
            <div>
                <button type="submit" class="btn btn-primary">Calcular</button>
            </div>
        </form>

        <%sueldohora = request.getParameter("valor");%>
        <%dia1 = request.getParameter("lunes");%>
        <%dia2 = request.getParameter("martes");%>
        <%dia3 = request.getParameter("miercoles");%>
        <%dia4 = request.getParameter("jueves");%>
        <%dia5 = request.getParameter("viernes");%>
        <%dia6 = request.getParameter("sabado");%>
        <%dia7 = request.getParameter("domingo");%>
        <%con = request.getParameter("menu");%>

    </body>
</html>
