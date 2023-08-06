function validateName() {
  var name = document.getElementById("nombre").value;
  if (name == "") {
    alert("Por favor, ingrese su nombre.");
    return false;
  }
  return true;
}

function validateEmail() {
  var email = document.getElementById("correo").value;
  var re = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  if (!re.test(email)) {
    alert("Por favor, ingrese una dirección de correo electrónico válida.");
    return false;
  }
  return true;
}

// This function validates the subject field.
function validateSubject() {
  var subject = document.getElementById("asunto").value;
  if (subject == "") {
    alert("Por favor, ingrese un asunto.");
    return false;
  }
  return true;
}

function validateMessage() {
  var message = document.getElementById("mensaje").value;
  if (message == "") {
    alert("Por favor, ingrese su mensaje.");
    return false;
  }
  return true;
}

function validateForm() {
  return validateName() && validateEmail() && validateSubject() && validateMessage();
}

document.getElementById("submission").addEventListener("click", function() {
  if (!validateForm()) {
    return false;
  }
});
