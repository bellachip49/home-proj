# Krystal Kwan
# 7/20/2016
# number-factoring calculator

import sys

def factor():
    try:
        print("Number:")
        n = int(input("> "))
        for i in range(1, (n + 1)):
            if n % i == 0:
                print i
    except ValueError:
        print("Invalid Input.")
    except KeyboardInterrupt:
        print("Quitting...")
        sys.exit(0)
    except SyntaxError:
        print("Invalid Input.")

while True:
    factor()
