/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  joanleonrs
 * Created: 31 ago. 2020
 */

create database gestionComputo;

use gestionComputo;

CREATE TABLE `equipo` (
`codigo` int(11) UNIQUE NOT NULL,
`modelo` varchar(80) NOT NULL,
`marca` varchar(100) NOT NULL,
`categoria` varchar(50) NOT NULL,
`disponible` boolean DEFAULT false
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

use gestionComputo;

SELECT * from equipo;
SELECT `equipo`.`codigo`,
    `equipo`.`modelo`,
    `equipo`.`marca`,
    `equipo`.`categoria`,
    `equipo`.`disponible`
FROM `gestioncomputo`.`equipo`;

INSERT INTO `gestioncomputo`.`equipo`
(`codigo`,
`modelo`,
`marca`,
`categoria`,
`disponible`)
VALUES
("1000",
"Satellite-000",
"Toshiba",
"Laptop",
true);

UPDATE `gestioncomputo`.`equipo`
SET
`modelo` = "Latitude-200",
`marca` = "Dell",
`categoria` = "Ultrabook",
`disponible` = false
WHERE 
`codigo` = "101";

DELETE FROM `gestioncomputo`.`equipo`
WHERE `codigo` = "101";


INSERT INTO gestioncomputo.equipo VALUES(1001, "Satellite-100", "Toshiba", "Laptop", true);
INSERT INTO gestioncomputo.equipo VALUES(1002, "Satellite-200", "Dell", "Ultrabook", false);
INSERT INTO gestioncomputo.equipo VALUES(1003, "Satellite-300", "ASUS", "Laptop", true);
INSERT INTO gestioncomputo.equipo VALUES(1004, "Satellite-400", "Toshiba", "Netbook", true);
INSERT INTO gestioncomputo.equipo VALUES(1005, "Satellite-500", "Acer", "Laptop", false);
INSERT INTO gestioncomputo.equipo VALUES(1006, "Satellite-600", "Toshiba", "Laptop", true);
INSERT INTO gestioncomputo.equipo VALUES(1007, "Satellite-700", "Toshiba", "Laptop", true);
INSERT INTO gestioncomputo.equipo VALUES(1008, "Satellite-800", "MSI", "Ultrabook", false);
INSERT INTO gestioncomputo.equipo VALUES(1009, "Satellite-900", "Alienware", "Laptop", true);

commit;
select * from gestioncomputo.equipo;