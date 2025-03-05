document.addEventListener('DOMContentLoaded', function() {
    const usernameField = document.getElementById('login');
    const passwordField = document.getElementById('password');
    const usernameWarning = document.getElementById('username-warning');
    const passwordWarning = document.getElementById('password-warning');
    const loginForm = document.getElementById('loginForm');

    usernameField.addEventListener('input', function() {
        if (usernameField.value.length > 10) {
            usernameWarning.style.display = 'block';
        } else {
            usernameWarning.style.display = 'none';
        }
    });

    passwordField.addEventListener('input', function() {
        if (passwordField.value.length > 10) {
            passwordWarning.style.display = 'block';
        } else {
            passwordWarning.style.display = 'none';
        }
    });

    loginForm.addEventListener('submit', function(event) {
        event.preventDefault();

        const username = usernameField.value.trim();
        const password = passwordField.value.trim();

        if (username === 'juan' && password === '123') {
            window.location.href = 'PAGES/menu.html';
        } else {
            alert('Credenciales incorrectas');
        }
    });
});    