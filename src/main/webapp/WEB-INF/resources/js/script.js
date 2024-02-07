function sendMessage() {
    var userInput = document.getElementById("user-input").value;
    displayUserMessage(userInput);

    // Gửi yêu cầu đến server
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "/chat", true);
    xhr.setRequestHeader("Content-Type", "application/json");
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            // Xử lý tin nhắn phản hồi từ bot
            var response = JSON.parse(xhr.responseText);
            displayBotMessage(response.message);
        }
    };
    var data = JSON.stringify({ question: userInput });
    xhr.send(data);
}

function displayUserMessage(message) {
    var chatMessages = document.querySelector(".chat-messages");
    var userMessageElement = document.createElement("div");
    userMessageElement.classList.add("message", "user-message");
    userMessageElement.textContent = message;
    chatMessages.appendChild(userMessageElement);
    // Cuộn xuống dưới cùng của vùng hiển thị tin nhắn
    chatMessages.scrollTop = chatMessages.scrollHeight;
}

function displayBotMessage(message) {
    var chatMessages = document.querySelector(".chat-messages");
    var botMessageElement = document.createElement("div");
    botMessageElement.classList.add("message", "bot-message");
    botMessageElement.textContent = message;
    chatMessages.appendChild(botMessageElement);
    // Cuộn xuống dưới cùng của vùng hiển thị tin nhắn
    chatMessages.scrollTop = chatMessages.scrollHeight;
}
