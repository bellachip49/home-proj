# Krystal Kwan
# 6/1/2016
# finds–of a number in binary–the biggest binary gap of zeros

a = 0
b = []
c = []

def solution(N):
    for i in range(1,648): #1, 648
        d1 = bin(i)
        d2 = list(d1)
        for j in d2:
            if 'b' in d2:
                d2.remove('b')
            while a < 1:
                if j == '1':
                    a += 1
                    break
                else:
                    d2.pop(0)
                    break
        for k in d2:
            for l in range(1):
                if '0' in d2[0]:
                    del d2[0]
            if k == '1':
                del d2[0]
                c.append(int(len(b)))
            else:
                b = d2.pop(0)
        b = sorted(c)
        return max(b)
