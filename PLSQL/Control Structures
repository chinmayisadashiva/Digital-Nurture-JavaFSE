-- Scenario 1

DECLARE

CURSOR c IS
SELECT customer_id,
age
FROM customers;

BEGIN

FOR rec IN c LOOP

IF rec.age > 60 THEN

UPDATE customers

SET interest_rate =
interest_rate - 1

WHERE customer_id =
rec.customer_id;

END IF;

END LOOP;

COMMIT;

END;
/

-- Scenario 2

DECLARE

CURSOR c IS

SELECT customer_id,
balance

FROM customers;

BEGIN

FOR rec IN c LOOP

IF rec.balance > 10000 THEN

UPDATE customers

SET IsVIP='TRUE'

WHERE customer_id =
rec.customer_id;

END IF;

END LOOP;

COMMIT;

END;
/

-- Scenario 3

SET SERVEROUTPUT ON;

DECLARE

CURSOR c IS

SELECT customer_name

FROM loans

WHERE loan_due_date
<= SYSDATE+30;

BEGIN

FOR rec IN c LOOP

DBMS_OUTPUT.PUT_LINE(
'Reminder sent to '
||
rec.customer_name
);

END LOOP;

END;
/