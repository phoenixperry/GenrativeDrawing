
import processing.core.*;

public class GenrativeDrawing extends PApplet {

	ColorSpectrumInAGrid cg; 
	
	public void setup(){
		cg = new ColorSpectrumInAGrid(this);
		
	}
	
	public void draw(){
		cg.update();
		
	}
}
