
INSERT INTO clientes(nombre, direccion, telefono)
VALUES('Sabrina Carpenter', 'los angeles', '98765429'),
	  ('Justin Bieber', 'canada', '76492045'),
	  ('Momo Ayase', 'japon', '49728493'),
	  ('Camila Cabello', 'new york', '59407204'),
	  ('Bruno Mars', 'california', '82295871');
      
/* SELECT *
FROM clientes;*/

INSERT INTO pedidos(total, cliente_id)
VALUES('9000', '1'),
      ('80000', '1'),
      ('7000', '2'),
      ('14000', '2'),
      ('18000', '2'),
      ('58980', '2'),
      ('55000', '2'),
      ('23000', '3'),
      ('10000', '4'),
      ('7000', '4'),
      ('78000', '4'),
      ('90000', '5'),
      ('55555', '5');
      
SELECT *
FROM clientes JOIN pedidos
    ON clientes.id = pedidos.cliente_id;
    
/*SELECT *  //para seleccionar todos los pedidos de un cliente segun su id
FROM pedidos
WHERE cliente_id = 2; */
    
SELECT clientes.nombre, pedidos.total, cliente_id  /* muestra el nombre del cliente, todos sus pedidos y su id */
FROM clientes JOIN pedidos
    ON clientes.id = pedidos.cliente_id
    WHERE cliente_id = 2;
    
SELECT clientes.nombre, cliente_id, SUM(total) AS total
FROM pedidos JOIN clientes
	ON clientes.id = pedidos.cliente_id
GROUP BY cliente_id;

DELETE FROM pedidos
WHERE cliente_id = 3;

DELETE FROM clientes
WHERE id = 3;

SELECT cliente_id, COUNT(id) AS total
FROM pedidos
GROUP BY cliente_id
ORDER BY total DESC
LIMIT 3;


