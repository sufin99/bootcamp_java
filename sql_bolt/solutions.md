# Ejercicios de SQL Bolt
Soluciones de los ejercicios de (https://sqlbolt.com/)


## Lección 1: Consultas SELECT 101
1. Find the title of each film
2. Find the director of each film
3. Find the title and director of each film
4. Find the title and year of each film
5. Find all the information about each film 

~~~sql
1. SELECT title FROM movies;
2. SELECT director FROM movies;
3. SELECT title, director FROM movies; 
4. SELECT title, year FROM movies;
5. SELECT * FROM movies;
~~~

## Lección 2: Consultas con restricciones (Parte 1)
1. Find the movie with a row id of 6
2. Find the movies released in the years between 2000 and 2010
3. Find the movies not released in the years between 2000 and 2010
4. Find the first 5 Pixar movies and their release year

~~~sql
1. SELECT * FROM movies WHERE id == 6;
2. SELECT * FROM movies WHERE year >= 2000 AND year <= 2010; || SELECT * FROM movies WHERE year BETWEEN 2000 AND 2010;
3. SELECT * FROM movies WHERE year < 2000 OR year > 2010; || SELECT * FROM movies WHERE year NOT BETWEEN 2000 AND 2010;
4. SELECT * FROM movies WHERE id <= 5;
~~~

## Lección 3: Consultas con restricciones (Parte 2)
1. Find all the Toy Story movies
2. Find all the movies directed by John Lasseter
3. Find all the movies (and director) not directed by John Lasseter
4. Find all the WALL-* movies

~~~sql
1. SELECT * FROM movies WHERE title LIKE "%Toy Story%";
2. SELECT * FROM movies WHERE director = "John Lasseter";
3. SELECT * FROM movies WHERE director != "John Lasseter";
4. SELECT * FROM movies WHERE title LIKE "WALL-_";
~~~

## Lección 4: Filtrado y ordenación de resultado y consultas
1. Lista de todos los directores de películas de Pixar (en orden alfabético), sin duplicados
2. Enumere las últimas cuatro películas de Pixar estrenadas (ordenadas de la más reciente a la menos reciente)
3. Enumera las cinco primeras películas de Pixar ordenadas alfabéticamente
4. Enumera las próximas cinco películas de Pixar ordenadas alfabéticamente

~~~sql
1. SELECT DISTINCT director FROM movies ORDER BY director;
2. SELECT DISTINCT * FROM movies ORDER BY year desc LIMIT 4;
3. SELECT DISTINCT * FROM movies ORDER BY title LIMIT 5;
4. SELECT DISTINCT * FROM movies ORDER BY title LIMIT 5 OFFSET 5;
~~~

## Lección Review: consultas simples de SELECT
1. List all the Canadian cities and their populations
2. Order all the cities in the United States by their latitude from north to south
3. List all the cities west of Chicago, ordered from west to east
4. List the two largest cities in Mexico (by population)
5. List the third and fourth largest cities (by population) in the United States and their population

~~~sql
1. SELECT * FROM north_american_cities WHERE country LIKE "Canada";
2. SELECT * FROM north_american_cities WHERE country LIKE "United States"
ORDER BY latitude desc;
3. SELECT * FROM north_american_cities WHERE longitude < (SELECT longitude FROM north_american_cities WHERE city = "Chicago") ORDER BY longitude;
4. SELECT * FROM north_american_cities WHERE country = "Mexico" ORDER BY population desc LIMIT 2;
5. SELECT * FROM north_american_cities WHERE country = "United States" ORDER BY population desc LIMIT 2 OFFSET 2;
~~~

## Lección 6: Consutas multitabla con JOIN
1. Find the domestic and international sales for each movie
2. Show the sales numbers for each movie that did better internationally rather than domestically
3. List all the movies by their ratings in descending order

~~~sql
1. SELECT * FROM movies
INNER JOIN boxoffice
    ON movies.id = boxoffice.movie_id;
2. SELECT * FROM movies
INNER JOIN boxoffice
    ON movies.id = boxoffice.movie_id
WHERE international_sales > domestic_sales;
3. SELECT * FROM movies
INNER JOIN boxoffice
    ON movies.id = boxoffice.movie_id
ORDER BY rating desc;
~~~

## Lección 7: JOINs externos
1. Find the list of all buildings that have employees
2. Find the list of all buildings and their capacity
3. List all buildings and the distinct employee roles in each building (including empty buildings)

~~~sql
1. SELECT DISTINCT building FROM employees
LEFT JOIN buildings
    ON employees.building = buildings.building_name;
2. SELECT DISTINCT building_name, capacity FROM employees
LEFT JOIN buildings;
3. SELECT DISTINCT building_name, role FROM buildings
LEFT JOIN employees
    ON employees.building = buildings.building_name;
~~~

## Lección 8: Breves nota sobre NULL
1. Find the name and role of all employees who have not been assigned to a building
2. Find the names of the buildings that hold no employees

~~~sql
1. SELECT * FROM employees
LEFT JOIN buildings
    ON buildings.building_name = employees.building
WHERE building IS NULL;
2. SELECT * FROM buildings
LEFT JOIN employees
    ON buildings.building_name = employees.building
WHERE building IS NULL;
~~~

## Lección 9: Consultas con expresiones
1. List all movies and their combined sales in millions of dollars
2. List all movies and their ratings in percent
3. List all movies that were released on even number years

~~~sql
1. SELECT title, (domestic_sales + international_sales)/1000000 FROM boxoffice
LEFT JOIN movies
    ON movies.id = boxoffice.movie_id;
2. SELECT title, rating * 10 FROM boxoffice
LEFT JOIN movies
    ON movies.id = boxoffice.movie_id;
3. SELECT title, year FROM boxoffice
LEFT JOIN movies
    ON movies.id = boxoffice.movie_id
WHERE year % 2 = 0;
~~~

## Lección 10: Consultas con agregaciones (Parte 1)
1. Find the longest time that an employee has been at the studio
2. For each role, find the average number of years employed by employees in that role
3. Find the total number of employee years worked in each building

~~~sql
1. 
2. 
3. 
~~~
