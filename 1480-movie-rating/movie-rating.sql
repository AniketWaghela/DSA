-- # Write your MySQL query statement below
SELECT(
SELECT name
FROM Users
WHERE user_id IN (
        SELECT user_id 
        FROM MovieRating
        GROUP BY user_id
        HAVING COUNT(*) =
            (SELECT COUNT(*) nomora
            FROM MovieRating
            GROUP BY user_id
            ORDER BY nomora DESC 
            LIMIT 1)
    ) 
ORDER BY name ASC
LIMIT 1) AS results

UNION ALL

SELECT(
SELECT title
FROM Movies
WHERE movie_id IN (
        SELECT movie_id 
        FROM MovieRating
        WHERE created_at LIKE ('2020-02%')
        GROUP BY movie_id
        HAVING SUM(rating)/COUNT(rating) = (
                SELECT SUM(rating)/COUNT(rating) AS avg
                FROM MovieRating
                WHERE created_at LIKE ('2020-02%')
                GROUP BY movie_id
                ORDER BY avg DESC
                LIMIT 1
            )
    )
ORDER BY title ASC
LIMIT 1) AS results