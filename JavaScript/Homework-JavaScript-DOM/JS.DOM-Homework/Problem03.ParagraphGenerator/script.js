function appendMessage() {
    var newElement = document.createElement('p');
    var newText = document.createTextNode('Some text');
    newElement.appendChild(newText);
    document.body.appendChild(newElement);
}
