// studentregistration.js

function validateForm(event) {
    event.preventDefault(); // Prevent the default form submission behavior

    var name = document.getElementById('name').value;
    var password = document.getElementById('password').value;
    var address = document.getElementById('address').value;

    var genderSelected = false;
    var gameSelected = false;

    // Check gender
    var genderRadios = document.getElementsByName('gender');
    for (var i = 0; i < genderRadios.length; i++) {
        if (genderRadios[i].checked) {
            genderSelected = true;
            break;
        }
    }

    // Check game
    var gameCheckboxes = document.getElementsByName('game');
    for (var i = 0; i < gameCheckboxes.length; i++) {
        if (gameCheckboxes[i].checked) {
            gameSelected = true;
            break;
        }
    }

    var errorMessages = '';

    if (name.trim() === '') {
        errorMessages += 'Name is required.\n';
    }

    if (password.trim() === '') {
        errorMessages += 'Password is required.\n';
    }

    if (address.trim() === '') {
        errorMessages += 'Address is required.\n';
    }

    if (!genderSelected || !gameSelected) {
        errorMessages += 'Please select gender and at least one favorite game.\n';
    }

    var validationMessagesElement = document.getElementById('validationMessages');
    var successMessageElement = document.getElementById('successMessage');

    if (errorMessages !== '') {
        validationMessagesElement.innerText = errorMessages.trim();
        validationMessagesElement.style.display = 'block';
        successMessageElement.style.display = 'none';
    } else {
        validationMessagesElement.style.display = 'none';
        successMessageElement.style.display = 'block';
    }

    return false; // Prevents the form from submitting
}
