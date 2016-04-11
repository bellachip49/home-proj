# Krystal Kwan
# Friday March 25 2016
# Press a button to make RGB LEDS turn red, blue, and green. 

import random, time
import RPi.GPIO as GPIO
 
def color_test(LED):
   LED['turn'] += 1
   if LED['turn'] == 1:
       LED['RED'].ChangeDutyCycle(100)
       LED['GREEN'].ChangeDutyCycle(0)
       LED['BLUE'].ChangeDutyCycle(0)
       time.sleep(.2)
   elif LED['turn'] == 2:
       LED['RED'].ChangeDutyCycle(0)
       LED['GREEN'].ChangeDutyCycle(100)
       LED['BLUE'].ChangeDutyCycle(0)
       time.sleep(.2)
   elif LED['turn'] == 3:
       LED['RED'].ChangeDutyCycle(0)
       LED['GREEN'].ChangeDutyCycle(0)
       LED['BLUE'].ChangeDutyCycle(100)
       time.sleep(.2)
   else:
       LED['turn'] = 0
      
def main():
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
    
    led0 = { 'RED' :RED, 'GREEN': GREEN, 'BLUE': BLUE, 'turn': 0 }
    led1 = { 'RED' :RED1, 'GREEN': GREEN1, 'BLUE': BLUE1, 'turn': 0 }
     
    while True:
        if (GPIO.input(25) == 0):
            color_test(led0)
        if (GPIO.input(21) == 0):
           	color_test(led1)
    
    GPIO.cleanup()


if __name__ == '__main__':
  main()
