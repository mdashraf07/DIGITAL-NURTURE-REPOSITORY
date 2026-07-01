-- Procedure 1: Apply monthly interest to all savings accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET balance = balance + (balance * 0.05)
    WHERE account_type = 'SAVINGS';
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied.');
END;
/

-- Procedure 2: Update employee bonus based on department
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(dept_id IN NUMBER, bonus_pct IN NUMBER) AS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * bonus_pct / 100)
    WHERE department_id = dept_id;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Bonus updated for department: ' || dept_id);
END;
/

-- Procedure 3: Transfer funds between accounts
CREATE OR REPLACE PROCEDURE TransferFunds(
    from_acc IN NUMBER,
    to_acc   IN NUMBER,
    amount   IN NUMBER
) AS
    current_balance NUMBER;
BEGIN
    SELECT balance INTO current_balance
    FROM Accounts WHERE account_id = from_acc;

    IF current_balance < amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient balance.');
    ELSE
        UPDATE Accounts SET balance = balance - amount WHERE account_id = from_acc;
        UPDATE Accounts SET balance = balance + amount WHERE account_id = to_acc;
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    END IF;
END;
/