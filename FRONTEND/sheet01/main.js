document.addEventListener('DOMContentLoaded', function() {
	const cajaContainer = document.querySelector('.pokemon-container');

	fetch('https://pokeapi.co/api/v2/pokemon/?limit=400')
	.then(response => {
		if (!response.ok){
			throw new Error('La red no responde bien');
		}
		return (response.json());
	})
	.then(data => {
		data.results.forEach(pokemon => {
			fetch(pokemon.url) // Obtiene los detalles de cada Pokemon
			.then(response => {
				if (!response.ok){
					throw new Error('La red no responde bien');
				}
				return (response.json());
			})
			.then(details => {
				// Extrae el id, la URL de la imagen, el nombre y los tipos del Pokémon
				const pokemonId = details.id;
				const pokemonImage = details.sprites.front_default;
				const pokemonName = details.name;
				const pokemonTypes = details.types.map(type => type.type.name);

				// Extraer datos de preevolución
				fetch(`https://pokeapi.co/api/v2/pokemon-species/${pokemonId}/`)
				.then(response => response.json())
				.then(speciesData => {
					const pokemonPreevolution = speciesData.evolves_from_species.name;
					if (!pokemonPreevolution)
						return (null);
					// Evolución
					const preevolutionElement = document.createElement('div');
					preevolutionElement.classList.add('pokemon-preevolution');
					preevolutionElement.innerHTML = `Evoluciona de:<br>${pokemonPreevolution}`;
					pokemonContainerCaja.appendChild(preevolutionElement);
				});

				// Se crea o encuentra un contenedor para este Pokemon
				const pokemonContainerCaja = document.createElement('div');
				pokemonContainerCaja.classList.add('pokemon-card'); // Añade clase para estilos

				// ID
				idDiv = document.createElement('div');
				idDiv.classList.add('pokemon-id');
				idDiv.textContent = `ID/${pokemonId}`;
				pokemonContainerCaja.appendChild(idDiv);

				// Imagen
				const imageElement = document.createElement('img');
				imageElement.classList.add('pokemon-img');
				imageElement.src = pokemonImage;// Añade la URL de la imagen al elemento img
				imageElement.alt = `Pokemon ID: ${pokemonId}`; // Añade un texto alternativo a la imagen
				pokemonContainerCaja.appendChild(imageElement);// Añade los elementos de imagen creados al div

				// Nombre
				const nameElement = document.createElement('div');
				nameElement.classList.add('pokemon-name');
				nameElement.textContent = `${pokemonName}`;
				pokemonContainerCaja.appendChild(nameElement);

				// Tipos
				const typesElement = document.createElement('div');
				typesElement.classList.add('pokemon-types');
				typesElement.textContent = `${pokemonTypes}`;
				pokemonContainerCaja.appendChild(typesElement);

				// Añade el contenedor del Pokemon al elemento principal en el DOM
				cajaContainer.appendChild(pokemonContainerCaja);
			})
			.catch(error => {
				console.error('Error al obtener los datos de la API del pokemon: ', error);
			});
		});
	})
	.catch(error => {
		console.error('Error al obtener los datos de la API de la operación: ', error);
	});
});