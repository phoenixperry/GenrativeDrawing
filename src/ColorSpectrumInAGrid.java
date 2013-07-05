
import processing.core.*;

public class ColorSpectrumInAGrid {

	public int stepX; 
	public int stepY; 
	PApplet p; 
	
	ColorSpectrumInAGrid(PApplet p_){
		p=p_;
		p.size(800,400); 
		p.background(0); 
	}
	
	public void update(){
		p.colorMode(PApplet.HSB, p.width, p.height, 100); 
		p.noStroke(); 
		stepX = p.mouseX+1; 
		stepY = p.mouseY+1; 
		
		for(int gridY=0; gridY < p.height; gridY +=stepY){
			for(int gridX=0; gridX < p.height; gridX +=stepX){
				p.fill(gridX, p.height-gridY, 100);
				p.rect(gridX,gridY,stepX, stepY);
			}
			
		} 
		
	}
}


