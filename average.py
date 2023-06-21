# Krystal Kwan
# 7/20/2016
# average

def find_avg():

while True:
    try:
        print("Amount of numbers in list:")
        a = int(input("> "))
        for i in range(a - 1):
            print("Integer #%i:" % (a + 1))
            b = int(input("> "))
            num_list.append(b)
        find_avg()
    except KeyboardInterrupt:
        print("Quitting...")
        break
    except ValueError:
        print("Invalid Input.")

print("Quitting.")
