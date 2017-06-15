-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT into actor (actor_id, first_name, last_name) VALUES(201, 'HAMPTON', 'AVENUE');
INSERT into actor (actor_id, first_name, last_name) VALUES(202, 'LISA', 'BYWAY');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT into film (title, description, release_year, language_id, rental_duration) VALUES('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 2008,1 , 198);

SELECT *
FROM film
WHERE title = 'Euclidean PI';


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT into film_actor (actor_id, film_id) VALUES(201, 1001);
INSERT into film_actor (actor_id, film_id) VALUES(202, 1001);

-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) Values ('Mathmagical');
INSERT INTO film_category (film_id,category_id) Values (1001,17);

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
UPDATE film_category
SET category_id = 17f
WHERE film_id = 1001 OR film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996; 



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)ROLLBACK;

UPDATE film
SET rating = 'G'
WHERE film_id IN (
SELECT film.film_id
FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Mathmagical');



-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id) VALUES(1001,1);
INSERT INTO inventory (film_id, store_id) VALUES(1001,2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM inventory
WHERE inventory_id = 4582 OR inventory_id = 4583 OR inventory_id = 4584 OR inventory_id = 4585;

-- 9.
-- Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category
WHERE name = 'Mathmagical';

-- 10. Delete all links to Mathmagical in the film_category table. 
-- (Did it succeed? Why?)
SELECT *
FROM category
WHERE name = 'Mathmagical';

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
 It worked when i tried to delete it.

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
DELETE FROM film_actor
WHERE film_id = 1001;

DELETE FROM film
WHERE film_id = 1001;

SELECT *
FROM film
Where film_id = 1001;
