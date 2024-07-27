document.getElementById('chatbot-send').addEventListener('click', function() {
    const input = document.getElementById('chatbot-input').value;
    const messages = document.getElementById('chatbot-messages');
    if (input) {
        const userMessage = document.createElement('div');
        userMessage.textContent = "You: " + input;
        messages.appendChild(userMessage);

        // Simulate a bot response
        const botResponse = document.createElement('div');
        botResponse.textContent = "Bot: " + "This is a response to your message.";
        messages.appendChild(botResponse);

        // Clear the input
        document.getElementById('chatbot-input').value = '';
        messages.scrollTop = messages.scrollHeight;
    }
});
