<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ChatGPT</title>
    <link rel="stylesheet" type="text/css" href="../resources/css/chat-style.css">
</head>
<body>
<div class="chat-container">
    <div class="chat-header">
        <h2>ChatGPT</h2>
    </div>
    <div class="chat-messages">
        <div class="message user-message">User's message</div>
        <div class="message bot-message">Bot's response</div>
    </div>
    <div class="chat-input">
        <input type="text" id="user-input" placeholder="Type your message here...">
        <button onclick="sendMessage()">Send</button>
    </div>
</div>
<script src="../resources/js/script.js"></script>
</body>
</html>
