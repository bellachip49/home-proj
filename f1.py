# Krystal Kwan
# Friday March 25 2016
# Press a button to make RGB LEDS turn red, blue, and green. 

import random, time
import RPi.GPIO as GPIO
 
GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)
red = 18
green = 24
blue = 23 
 
GPIO.setup(red, GPIO.OUT)
GPIO.setup(green, GPIO.OUT)
GPIO.setup(blue, GPIO.OUT)
GPIO.setup(25, GPIO.IN, pull_up_down = GPIO.PUD_UP)

Freq = 100 
 
RED = GPIO.PWM(red, Freq)
RED.start(0)
GREEN = GPIO.PWM(green, Freq)
GREEN.start(0)
BLUE = GPIO.PWM(blue, Freq)
BLUE.start(0)
 
def color(R, G, B):
    RED.ChangeDutyCycle(R)
    GREEN.ChangeDutyCycle(G)
    BLUE.ChangeDutyCycle(B)
    time.sleep(1)
 
    RED.ChangeDutyCycle(0)
    GREEN.ChangeDutyCycle(0)
    BLUE.ChangeDutyCycle(0)
   
turn = 0
while True:
    if(GPIO.input(25) == 0):
        turn +=1
        if turn == 1:
          color(100,0,0)
        elif turn == 2:
          color(0,100,0)
        elif turn == 3:
          color(0,0,100)
        else:
          turn = 0

GPIO.cleanup()

