package com.example.calculatorservlet.CalculatorServlet;

import com.example.calculatorservlet.models.Calculator;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float firstOperand = Float.parseFloat(request.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(request.getParameter("second-operand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Result: </h1>");
        try {
            float result = Calculator.calculate(firstOperand,secondOperand,operator);
            printWriter.println(firstOperand + " " + operator + " " + secondOperand + " = " + result);
        }
        catch (Exception ex) {
            printWriter.println("Error: " + ex.getMessage());
        }
        printWriter.println("</html>");
    }

    public void destroy() {
    }
}