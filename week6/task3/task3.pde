//Task 3

//a

//PRESS ENTER TO START THE "LIGHT SHOW".
//WHEN THE LIGHT TURNS GREEN, PRESS ENTER TO RUN IT AGAIN.
//REMEMBER TO HAVE THE PROGRAM WINDOW IN FOCUS, OR ELSE IT WONT DETECT INPUT.

color red = color(255, 0, 0);
color green = color(0, 255, 0);
color yellow = color(255, 255, 0);
color grey = color(100);

int offset = 10, lightSize = 150, time, oldTime;

boolean start = false, done = false;

void setup() {
  size(200, 500);
  noStroke();
}


void draw() {
  time = millis();
  background(255);

  fill(0);
  rect(offset, offset, width-offset*2, height-offset*2);

  fill(grey);
  if(start && !done){fill(red);}
  ellipse(width/2, offset*2+lightSize/2, lightSize, lightSize);
  
  fill(grey);
  if(time > oldTime+1500 && start && !done){fill(yellow);}
  ellipse(width/2, height/2, lightSize, lightSize);
  
  fill(grey);
  if(time > oldTime+3000 && start){fill(green); done = true;}
  ellipse(width/2, height-(offset*2+lightSize/2), lightSize, lightSize);
}

void keyPressed() {
  if (keyCode == ENTER) {
    start = true;
    oldTime = time;
    done = false;
  }
}
