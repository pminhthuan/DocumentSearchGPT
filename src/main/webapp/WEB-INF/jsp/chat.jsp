<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document Search Chat</title>
    <link rel="stylesheet" href="../../resources/css/chat-style.css">
</head>
<body>
<div class="chat-container">
    <div class="chat-box" id="chatBox">
        <div class="chat-message bot-message">
            <span class="chat-time">12:01</span>
            <span class="chat-text">Welcome to Document Search Chat. How can I assist you today?</span>
        </div>
    </div>
    <div class="chat-input">
        <input type="text" id="userMessage" placeholder="Type your message here...">
        <button id="sendButton">Send</button>
    </div>
</div>
<script src="../../resources/js/script.js"></script>
</body>
</html>
