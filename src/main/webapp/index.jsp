<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1> S1mple Calculator</h1>
<br/>
<form method="post" action="/calculate">
    <table>
        <tr>
            <td>First Operand: </td>
            <td><input name = "first-operand" type="text"></td>
        </tr>
        <tr>
            <td> Operator</td>
            <td>
                <select name="operator">
                    <option value = "+">Addition</option>
                    <option value = "-">Subtraction</option>
                    <option value = "*">Multiplication</option>
                    <option value = "/">Division</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Second Operand: </td>
            <td><input type="text" name="second-operand"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="calculate"></td>
        </tr>
    </table>
</form>
</body>
</html>