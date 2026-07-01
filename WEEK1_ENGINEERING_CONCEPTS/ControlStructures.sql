-- Scenario 1: Discount loan interest for customers above 60
BEGIN
    FOR c IN (SELECT customer_id, age, loan_interest_rate FROM Customers) LOOP
        IF c.age > 60 THEN
            UPDATE Customers
            SET loan_interest_rate = loan_interest_rate - 1
            WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 2: Set VIP flag if balance is above 10000
BEGIN
    FOR acc IN (SELECT customer_id, balance FROM Accounts) LOOP
        IF acc.balance > 10000 THEN
            UPDATE Customers
            SET is_vip = 'Y'
            WHERE customer_id = acc.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- Scenario 3: Reminder for loans due in next 30 days
BEGIN
    FOR loan IN (SELECT customer_id, due_date FROM Loans) LOOP
        IF loan.due_date BETWEEN SYSDATE AND SYSDATE + 30 THEN
            DBMS_OUTPUT.PUT_LINE('Reminder sent to customer: ' || loan.customer_id);
        END IF;
    END LOOP;
END;
/