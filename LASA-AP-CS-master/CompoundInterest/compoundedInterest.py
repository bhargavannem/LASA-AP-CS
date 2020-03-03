import math
import numpy as np


def solve(A, P, r, n, t):
    solution = 0
    if int(A) == 0:
        return(P * pow((1 + (r/n), (n*t))))
    elif int(P) == 0:
        return(A/pow((1 + (r/n)), (n*t)))
    elif r == 0.00:
        return((pow((A/P), (1/n*t)) - 1))
    elif int(t) == 0:
        return(np.ln(A/P) / n*(np.ln(1 + r/n)))
    elif int(n) == 0:
        return(np.ln(A / P)/np.ln(1 + r))
    else:
        return(str("Invalid entry"))


print("This is a compounded interest calculator")
print("Enter 0 if you are solving the variable")
print("Also, any part of the equation cannot be equal to 0")
print("------------------------------------")
print("A = final amount")
print("P = principal amount")
print("r = interest rate")
print("n = number of times interest is applied")
print("t = Time periods elapsed")
print("------------------------------------")
A=float(input("A = ") or 0)
P=float(input("P = ") or 0)
r=float(input("r = ") or 0.00)
n=float(input("n = ") or 0)
t=float(input("t = ") or 0)
print("--------------------------------------")
information=(A, P, r, n, t)
print("Your solution is $", solve(A, P, r, n, t))
