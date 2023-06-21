#Krystal Kwan
#organizes things in order

nxt = 1
wdlist = []
print("Press ^C when done typing words.")
while True:
    try:
        print (("Word #%i:") % (nxt))
        word = raw_input("> ")
        wdlist.append(word)
        nxt += 1
    except KeyboardInterrupt:
        break
print
for i in sorted(wdlist):
    print i
    nxt = raw_input("Press ENTER to quit: ")
