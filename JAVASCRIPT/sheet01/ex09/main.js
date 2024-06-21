function invertirCadena(str) {
	if (str) {
		return str.split('').reverse().join('');
	}
	return ('');
}

console.log(invertirCadena("Auxilio"));
