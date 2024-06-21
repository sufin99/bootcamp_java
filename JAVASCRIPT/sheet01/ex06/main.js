function saludar(nombre) {
	console.log("Hola,", nombre);
}

function mayor(a, b) {
	if (a > b)
		console.log("El número más grande es:", a);
	else if (a == b)
		console.log("Los 2 números son iguales", a, "=", b);
	else
		console.log("El número más grande es:", b);
}

saludar("Juan");
mayor(5, 6);