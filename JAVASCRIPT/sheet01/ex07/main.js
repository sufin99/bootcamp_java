days_week = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
numbers = [1, 5, 8, 23, 64, 0, -32];
suma = 0;

i = 0;
j = 0;
while (i < days_week.length) {
	console.log(days_week[i]);
	i++;
}

function sumarArreglo(numbers) {
	while (j < numbers.length) {
		suma += numbers[j];
		j++;
	}
	console.log("El total de la suma es:", suma);
}

sumarArreglo(numbers);