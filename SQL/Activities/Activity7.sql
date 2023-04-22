REM   Script: Activity7
REM   Activity7

SELECT SUM(purchase_amount) AS "total_purchase" FROM orders;

SELECT AVG(purchase_amount) AS "AVERAGE_PURCHASE" FROM orders;

SELECT MAX(purchase_amount) AS "MAX_PURCHASE" FROM orders;

SELECT MIN(purchase_amount) AS "MIN_PURCHASE" FROM orders;

SELECT COUNT(DISTINCT salesman_id) AS "NO_OF_SALESMEN" FROM orders;

