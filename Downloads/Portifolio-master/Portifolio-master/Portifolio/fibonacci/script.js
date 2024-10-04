document.getElementById('calculo').addEventListener('click', function() {
    const num = parseInt(document.getElementById('num').value);
    const resultDiv = document.getElementById('result');

    if (isNaN(num) || num < 0) {
        resultDiv.textContent = "Por favor, insira um número inteiro não negativo.";
        return;
    }

    const fib = fibonacci(num);
    resultDiv.textContent = `O ${num}º número de Fibonacci é: ${fib}`;
});

function fibonacci(n) {
    if (n <= 1) return n;
    
    let a = 0, b = 1, c;
    for (let i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}
