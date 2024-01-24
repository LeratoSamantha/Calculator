<%-- 
    Document   : newjsp
    Created on : 26 Sep 2023, 10:40:56 AM
    Author     : BHEKOKWAKHE MAVUSO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Subtraction Quiz</h1>
    
    <form action="QuizResults.jsp" method="post">
        <%
            int numQuestions = 5; // Number of questions in the quiz

            // Initialize variables to keep track of questions and score
            int score = 0;
            
            for (int i = 1; i <= numQuestions; i++) {
                // Generate two random numbers for subtraction
                int num1 = (int) (Math.random() * 100); // You can adjust the range as needed
                int num2 = (int) (Math.random() * num1); // Ensure the second number is less than the first
                
                // Calculate the correct answer
                int correctAnswer = num1 - num2;
                
                // Display the question
                %>
                <p>Question <%= i %>: What is <%= num1 %> - <%= num2 %> ?</p>
                <input type="hidden" name="correctAnswer<%= i %>" value="<%= correctAnswer %>">
                <input type="number" name="userAnswer<%= i %>">
                <br>
                <%
            }
        %>
        <input type="submit" value="Submit Answers">
        </form>
    </body>
</html>
