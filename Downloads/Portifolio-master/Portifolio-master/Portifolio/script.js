document.getElementById('contatoForm').addEventListener('submit', function(e) {
    e.preventDefault(); // Evita o envio do formulário

    const nome = document.getElementById('nome').value;
    const email = document.getElementById('email').value;
    const mensagem = document.getElementById('mensagem').value;

    alert(`Obrigado pelo contato, ${nome}! Sua mensagem foi recebida.`);
    
    // Limpar os campos do formulário
    this.reset();
});
