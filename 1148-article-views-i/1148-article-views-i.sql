# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
 FROM Views
WHERE(Author_id = Viewer_id) 

ORDER BY Author_id ASC;