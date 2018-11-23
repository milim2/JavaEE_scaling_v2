<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="m" tagdir="/WEB-INF/tags" %>

<jsp:useBean id="cal" class="com.example.Calculation" />

<!-- 
    int rand = (int)(52 * Math.random());
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] faces = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven","Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String cardName = faces[rand % 13] + " of " + suits[rand / 13];
    String fileName = rand + 1 + ".png";
 %>  -->



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scaling Factor version 2</title>

<style>
  table,th,td {
   border:1px solid black;
  }
 </style>
</head>

<body>
   <!-- What the USER sees !!!! -->
    <main>
        <h1>Random Cards</h1>
         <m:cal />
        <p>You picked <span class=""></span></p>
        <p>You picked <span class=""></span></p>
        
        <p>Card Servlet doGet: <%=out %></p>
        <p>out</p>
    </main>
    <footer>
       
    </footer>
</body>
</html>