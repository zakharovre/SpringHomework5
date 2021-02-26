START TRANSACTION;
DROP TABLE IF EXISTS product_repo;
CREATE TABLE product_repo (`id` INT NOT NULL AUTO_INCREMENT, `name` VARCHAR(45) NOT NULL, `cost` INT NOT NULL, PRIMARY KEY (`id`));
INSERT INTO product_repo (`id`, `name`, `cost`) VALUES ('1', 'Apple', '100');
INSERT INTO product_repo (`id`, `name`, `cost`) VALUES ('2', 'Grape', '150');
INSERT INTO product_repo (`id`, `name`, `cost`) VALUES ('3', 'Orange', '200');
INSERT INTO product_repo (`id`, `name`, `cost`) VALUES ('4', 'Banana', '50');
INSERT INTO product_repo (`id`, `name`, `cost`) VALUES ('5', 'Kiwi', '75');
COMMIT;