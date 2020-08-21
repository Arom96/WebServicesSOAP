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
            String valor;
            String dato1, dato2, dato3, dato4, dato5, dato6, dato7, dato8;
        %>

        <form action="consumo.jsp" method="POST">
            <div class="form-group">
                <label for="valor">Valor por hora: </label>
                <input type="text" name="valor1"/>
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

        <%valor = request.getParameter("valor1");%>
        <%dato1 = request.getParameter("lunes");%>
        <%dato2 = request.getParameter("martes");%>
        <%dato3 = request.getParameter("miercoles");%>
        <%dato4 = request.getParameter("jueves");%>
        <%dato5 = request.getParameter("viernes");%>
        <%dato6 = request.getParameter("sabado");%>
        <%dato7 = request.getParameter("domingo");%>
        <%dato8 = request.getParameter("menu");%>

    </body>
</html>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	ws.CalculoSueldo_Service service = new ws.CalculoSueldo_Service();
	ws.CalculoSueldo port = service.getCalculoSueldoPort();
	 // TODO initialize WS operation arguments here
	double sueldohora = Double.parseDouble(valor);
	int dia1 = Integer.parseInt(dato1);
	int dia2 = Integer.parseInt(dato2);
	int dia3 = Integer.parseInt(dato3);
	int dia4 = Integer.parseInt(dato4);
	int dia5 = Integer.parseInt(dato5);
	int dia6 = Integer.parseInt(dato6);
	int dia7 = Integer.parseInt(dato7);
	int con = Integer.parseInt(dato8);
	// TODO process result here
	double result = port.sueldoCalculado(sueldohora, dia1, dia2, dia3, dia4, dia5, dia6, dia7, con);
        if(con == 1){
            out.println("EL total de horas trabjadas a la semana es: "+result+"H");
        }else if(con == 2){
            out.println("El sueldo a pagar por las horas de la semana es: "+result+"$");
        }
	
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
