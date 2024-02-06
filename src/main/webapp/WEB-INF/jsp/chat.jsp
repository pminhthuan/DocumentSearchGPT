<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chat App</title>
    <style>
        #chat-container {
            width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
        }

        #chat-messages {
            max-height: 300px;
            overflow-y: auto;
        }

        .message {
            margin-bottom: 10px;
            padding: 5px 10px;
            border-radius: 5px;
        }

        .user-message {
            background-color: #e0f7fa;
            text-align: right;
        }

        .ai-message {
            background-color: #b2dfdb;
        }

        .user-message, .ai-message {
            max-width: 70%;
            display: inline-block;
        }

        #user-input {
            width: 70%;
            padding: 5px;
            margin-top: 10px;
        }

        #send-button {
            padding: 5px 10px;
            margin-top: 10px;
        }

    </style>
</head>
<body>
<div id="chat-container">
    <div id="chat-messages"></div>
    <input type="text" id="user-input" placeholder="Type your message...">
    <button onclick="sendMessage()">Send</button>
</div>
<script>
    function sendMessage() {
        var userMessage = document.getElementById("user-input").value;
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "${pageContext.request.contextPath}/chat", true);
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.onreadystatechange = function () {
            if (xhr.readyState === XMLHttpRequest.DONE) {
                if (xhr.status === 200) {
                    var response = xhr.responseText;
                    displayResponse(response);
                } else {
                    console.error("Error:", xhr.statusText);
                }
            }
        };
        xhr.send(JSON.stringify({ question: userMessage }));
    }

    function displayResponse(response) {
        var chatMessages = document.getElementById("chat-messages");
        var message = document.createElement("div");
        message.textContent = "AI: " + response;
        chatMessages.appendChild(message);
    }
</script>
</body>
</html>
