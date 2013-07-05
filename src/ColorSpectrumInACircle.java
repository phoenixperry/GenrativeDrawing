import processing.core.*;
public class ColorSpectrumInACircle {
	PApplet p;
	int radius = 300; 
	int segementCount = 12;
	ColorSpectrumInACircle(PApplet p_){
		p=p_;
		
	}
	public void update(){
		p.colorMode(p.HSB, 360, p.width, p.height);
		p.background(360);
		float angleStep = 360/segementCount; 
		p.beginShape(p.TRIANGLE_FAN); 
		p.vertex(p.width/2, p.height/2);
		//test double test
		for(float angle=0; angle<360; angle+=angleStep){
			//float vx = width/2 + cos(p.radians(angle))*radius; 
		}
	} 
}
