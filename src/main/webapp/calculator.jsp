<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
 <form action="CalcServletGet" method="get" name="frm">
        
               Enter num1:
               <input name="txt1" type="text" />
            

                Enter num2:
               <input name="txt2" type="text" />
            
           
               Operator
                
                <select name="op">
                   
                    <option value="Addition">Addition</option>
                    <option value="Subtraction">Subtraction</option>
                    <option value="multiplication">multiplication</option>
                    <option value="division">division</option>
                </select>
            

                <input type="submit" value="submit" />
            
        </form>
</body>
</html>