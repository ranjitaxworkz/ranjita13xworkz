SELECT * FROM hospital.hospital_details;

SHOW COLUMNS FROM HOSPITAL_DETAILS;

 INSERT INTO hospital_details (ID,NAME,ADDRESS,TYPE,FEES,MOBILE_NO)VALUES(1,'VASTALYA_HOSPITAL','GULBARGA','PRIVATE',10000.00,3541887767);
 INSERT INTO hospital_details VALUES(2,'EAI_HOSPITAL','GULBARGA','GOVERNMENT',5000.00,3450750770);
 INSERT INTO hospital_details VALUES(3,'SPARSHA_HOSPITAL','GULBARGA','PRIVATE',20000.00,2323445894);
 INSERT INTO hospital_details VALUES(4,'SUGUNA_HOSPITAL','BANGLORE','PRIVATE',25000.00,8197347823);
 INSERT INTO hospital_details VALUES(5,'ASHWINI_HOSPITAL','SOLAPUR','PRIVATE',30000.00,9145678933);
 INSERT INTO hospital_details VALUES(6,'SANGMESHWAR_HOSPITAL','GULBARGA','PRIVATE',35000.00,1234567893);
 INSERT INTO hospital_details VALUES(7,'KAMREDDI_HOSPITAL','GULBARGA','PRIVATE',40000.00,8156237893);

select ID,NAME,MOBILE_NO from hospital.hospital_details;

select distinct ADDRESS,TYPE from hospital.hospital_details; -- DISTINCT --

SELECT * FROM hospital_details WHERE ID = 1; -- WHERE --
SELECT * FROM hospital_details WHERE NAME = 'EAI_HOSPITAL';
SELECT * FROM hospital_details WHERE ADDRESS = 'GULBARGA';

SELECT * FROM hospital_details where FEES < 30000.00 AND TYPE = 'PRIVATE';  -- AND --
SELECT * FROM hospital_details where ID < 6 OR  ADDRESS = 'BELAGAVI';  -- OR --

SELECT * FROM hospital_details  where MOBILE_NO IS NULL;  -- IS NULL --
SELECT * FROM hospital_details  where ID IS NULL;

SELECT * FROM hospital_details where NAME IS NOT NULL; -- IS NOT NULL --

select * from hospital.hospital_details LIMIT 4;  -- LIMIT --

select * from hospital.hospital_details ORDER BY NAME;  -- ORDER BY --
select * from hospital.hospital_details ORDER BY ADDRESS;

select * from hospital.hospital_details ORDER BY ID DESC;   -- DESCENDING ORDER --
select * from hospital.hospital_details ORDER BY ID ASC;   -- ASCENDING ORDER --
select * from hospital.hospital_details ORDER BY NAME DESC, TYPE ASC;

UPDATE hospital_details  SET FEES = 15000.00 WHERE ID = 2;  -- UPDATE --
UPDATE hospital_details SET  TYPE = 'PRIVATE' WHERE FEES = 15000.00; 
UPDATE hospital_details SET TYPE = 'GOVERMENT' WHERE  FEES <= 15000.00;

alter table hospital.hospital_details modify FEES FLOAT NOT null;  -- MODIFY --

SELECT *FROM hospital.hospital_details WHERE FEES BETWEEN 25000.00 AND 40000.00; -- between --
SELECT *FROM  hospital.hospital_details WHERE ID IN(1,5); 

SELECT sum(FEES) AS TOTAL_SUM FROM hospital.hospital_details;   -- SUM --
SELECT min(FEES) AS MINIMUM_VALUE FROM hospital.hospital_details; -- MAXIMUM --
SELECT max(FEES)AS MAXIMUM_VALUE FROM hospital.hospital_details; -- MINIMUM --
SELECT avg(FEES) AS AVERAGE_VALUE FROM hospital.hospital_details;  -- AVERAGE --
SELECT COUNT(FEES)FROM hospital.hospital_details ;    -- COUNT  --

SELECT * FROM hospital.hospital_details WHERE NAME LIKE '_A%' ; -- WILD OPERATOR _  --
SELECT * FROM hospital.hospital_details WHERE NAME LIKE 'S%' ;
SELECT * FROM hospital.hospital_details WHERE NAME LIKE '%L' ;
SELECT * FROM hospital.hospital_details WHERE NAME LIKE 'K%_M__D%' ;














