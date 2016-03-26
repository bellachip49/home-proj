# Krystal Kwan
# Friday March 25 2016
# Press a button to make RGB LEDS turn red, blue, and green. 

import random, time
import RPi.GPIO as GPIO
 
RUNNING = True
GPIO.setmode(GPIO.BCM)
red = 18
green = 24
blue = 23 
red1 = 16
green1 = 12
blue1 = 21 
 
GPIO.setup(red, GPIO.OUT)
GPIO.setup(red1, GPIO.OUT)
GPIO.setup(green, GPIO.OUT)
GPIO.setup(green1, GPIO.OUT)
GPIO.setup(blue, GPIO.OUT)
GPIO.setup(blue1, GPIO.OUT)

Freq = 100 #Hz
 
RED = GPIO.PWM(red, Freq)
RED.start(0)
GREEN = GPIO.PWM(green, Freq)
GREEN.start(0)
BLUE = GPIO.PWM(blue, Freq)
BLUE.start(0)
RED1 = GPIO.PWM(red1, Freq)
RED1.start(0)
GREEN1 = GPIO.PWM(green1, Freq)
GREEN1.start(0)
BLUE1 = GPIO.PWM(blue1, Freq)
BLUE1.start(0)
 
def color(R, G, B, on_time):
    # Color brightness range is 0-100%
    RED.ChangeDutyCycle(R)
    GREEN.ChangeDutyCycle(G)
    BLUE.ChangeDutyCycle(B)
    RED1.ChangeDutyCycle(R)
    GREEN1.ChangeDutyCycle(G)
    BLUE1.ChangeDutyCycle(B)
    time.sleep(on_time)
 
    # Turn all LEDs off after on_time seconds
    RED.ChangeDutyCycle(0)
    GREEN.ChangeDutyCycle(0)
    BLUE.ChangeDutyCycle(0)
    RED1.ChangeDutyCycle(0)
    GREEN1.ChangeDutyCycle(0)
    BLUE1.ChangeDutyCycle(0)
 
print("Light It Up!")
print("Press CTRL + C to quit.\n")
print(" R  G  B\n---------")
 
# Main loop
try:
    while RUNNING:
        for x in range(0,2):
            for y in range(0,2):
                for z in range(0,2):
                    print (x,y,z)
                    for i in range(0,101):
                        color((x * i),(y * i),(z * i), 0.02)
 
# If CTRL+C is pressed the main loop is broken
except KeyboardInterrupt:
    RUNNING = False 
    print ("\Quitting")
 
finally:
    GPIO.cleanup()

