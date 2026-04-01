-- ============================================================
--  ASSIGNMENT 3 — SQL Queries (emp, dept, salgrade)
-- ============================================================


-- Q1. Find only the departments that currently have no employees assigned to them.
-- Hint: dept 40 (OPERATIONS) has no employees

SELECT deptno, dname
FROM dept
WHERE deptno NOT IN (
    SELECT DISTINCT deptno FROM emp WHERE deptno IS NOT NULL
);


-- ============================================================
-- Q2. List Employees Who Are Both Managers and Analysts (Using INTERSECT)
-- Note: MySQL does not support INTERSECT natively, simulated using IN

SELECT ename, job
FROM emp
WHERE job = 'MANAGER'
AND ename IN (
    SELECT ename FROM emp WHERE job = 'ANALYST'
);

-- Note: In this dataset no employee holds both jobs so result will be empty.
-- If you want to simulate INTERSECT properly in MySQL:
SELECT ename FROM emp WHERE job = 'MANAGER'
AND ename IN (SELECT ename FROM emp WHERE job = 'ANALYST');


-- ============================================================
-- Q3. Employees Who Work in Same Department as 'SCOTT' and 'KING' (Using INTERSECT)
-- SCOTT is in dept 20, KING is in dept 10
-- INTERSECT = departments common to both → none (different depts)
-- Simulated using IN

SELECT ename, deptno
FROM emp
WHERE deptno IN (SELECT deptno FROM emp WHERE ename = 'SCOTT')
AND deptno IN (SELECT deptno FROM emp WHERE ename = 'KING');


-- ============================================================
-- Q4. List Employees in Dept 10 or Having Salary > 3000 (Using UNION)

SELECT ename, deptno, sal
FROM emp
WHERE deptno = 10

UNION

SELECT ename, deptno, sal
FROM emp
WHERE sal > 3000;


-- ============================================================
-- Q5. Find Employees Who Do NOT Belong to Any Department

SELECT ename, deptno
FROM emp
WHERE deptno IS NULL;


-- ============================================================
-- Q6. List Departments with Total Salary Greater Than 2000

SELECT deptno, SUM(sal) AS total_salary
FROM emp
GROUP BY deptno
HAVING SUM(sal) > 2000;


-- ============================================================
-- Q7. Show Dept with Highest Total Salary

SELECT deptno, SUM(sal) AS total_salary
FROM emp
GROUP BY deptno
ORDER BY total_salary DESC
LIMIT 1;


-- ============================================================
-- Q8. Display Total Commission Paid Department-wise

SELECT deptno, SUM(IFNULL(comm, 0)) AS total_commission
FROM emp
GROUP BY deptno;


-- ============================================================
-- Q9. Show Departments Where Average Salary is Greater Than Overall Average

SELECT deptno, AVG(sal) AS avg_salary
FROM emp
GROUP BY deptno
HAVING AVG(sal) > (SELECT AVG(sal) FROM emp);


-- ============================================================
-- Q10. Departments Where At Least One Employee Earns More Than 4000

SELECT deptno, MAX(sal) AS max_salary
FROM emp
GROUP BY deptno
HAVING MAX(sal) > 4000;


-- ============================================================
--  END OF ASSIGNMENT 3
-- ============================================================
