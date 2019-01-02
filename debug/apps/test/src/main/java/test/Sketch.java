package test;

import processing.core.PApplet;

import template.*;

public class Sketch extends PApplet {

  HelloLibrary hello;

  public void settings() {
    fullScreen();
  }

  public void setup() {
    hello = new HelloLibrary(this);
  
    PFont font = createFont("SansSerif", 40 * displayDensity);
    textFont(font);
  }

  public void draw() {
    background(0);
    fill(255);
    text(hello.sayHello(), mouseX, mouseY);
  }
}
