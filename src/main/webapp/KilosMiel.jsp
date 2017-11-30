<%-- 
    Document   : KilosMiel
    Created on : 30/11/2017, 01:51:29 AM
    Author     : fernando stiven
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="VO.RegistroMiel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="wrapper">
            <section>
                <div class="container">
                    <div class="dynamicContent">
                        <!--content-->
                        <h1>Registro de Colmenas</h1>
                        <table>
                            <tr>
                                <td>ID COLMENA</td>
                                <td>SUMATORIA DE KILOS DE MIEL</td>
                                

                            </tr>
                            <%
                                if (request.getAttribute("lis") != null) {
                                    ArrayList<RegistroMiel> em = (ArrayList<RegistroMiel>) request.getAttribute("lis");

                                    if (em != null) {
                                        for (RegistroMiel es : em) {

                            %>
                            <h1></h1>
                            <tr>  
                                <td><%=es.getIdColmena()%></td>
                                <td><%=es.getKilosMiel()%></td>
                                
                            </tr>

                            <%

                                        }
                                    }
                                }
                            %>

                        </table>
                    </div>
                </div>
            </section>
        </div>
        <script type="text/javascript" src="js/bootstrap.js"></script>
        <script>
            $(".fancybox").fancybox({});
        </script>
        <h2><a href="index.jsp"> volver al menu</a></h2>
    </body>
</html>
