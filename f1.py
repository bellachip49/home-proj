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
red1 = 12
green1 = 16
blue1 = 20
 
GPIO.setup(red, GPIO.OUT)
GPIO.setup(green, GPIO.OUT)
GPIO.setup(blue, GPIO.OUT)
GPIO.setup(25, GPIO.IN, pull_up_down = GPIO.PUD_UP)
GPIO.setup(21, GPIO.IN, pull_up_down = GPIO.PUD_UP)
GPIO.setup(red1, GPIO.OUT)
GPIO.setup(green1, GPIO.OUT)
GPIO.setup(blue1, GPIO.OUT)

Freq = 100 
 
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
 
def color(R, G, B):
    RED.ChangeDutyCycle(R)
    GREEN.ChangeDutyCycle(G)
    BLUE.ChangeDutyCycle(B)

def color1(R1, G1, B1):
    RED1.ChangeDutyCycle(R1)
    GREEN1.ChangeDutyCycle(G1)
    BLUE1.ChangeDutyCycle(B1)
    
def button1(turn):
    turn += 1
    if turn == 1:
        color(100,0,0)
        time.sleep(.2)
    elif turn == 2:
        color(0,100,0)
        time.sleep(.2)
    elif turn == 3:
        color(0,0,100)
        time.sleep(.2)
    else:
        turn = 0

def button2(turn):
    turn += 1
    if turn == 1:
        color1(100,0,0)
        time.sleep(.2)
    elif turn == 2:
        color1(0,100,0)
        time.sleep(.2)
    elif turn == 3:
        color1(0,0,100)
        time.sleep(.2)
    else:
        turn = 0

while True:
    #if (GPIO.input(25) == 0):
    #    button1(0)
    if (GPIO.input(21) == 0):
        button2(0)

GPIO.cleanup()

