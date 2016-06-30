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
 
turn = 0
while True:
  color(100,0,0)
  time.sleep(.5)
  color(100,100,0)
  time.sleep(.5)
  color(30,100,0)
  time.sleep(.5)
  color(0,100,0)
  time.sleep(.5)
  color(0,0,100)
  time.sleep(.5)
  color(100,0,100)
  time.sleep(.5)
  color(100,0,30)
  time.sleep(.5)
GPIO.cleanup()

