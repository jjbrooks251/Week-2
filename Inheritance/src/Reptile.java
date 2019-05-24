
public class Reptile extends Animal {

	private String scaleColour;
	private double tongueLen;
	private Boolean thermalVis;

	public String getScaleColour() {
		return scaleColour;
	}

	public void setScaleColour(String scaleColour) {
		this.scaleColour = scaleColour;
	}

	public double getTongueLen() {
		return tongueLen;
	}

	public void setTongueLen(double tongueLen) {
		this.tongueLen = tongueLen;
	}

	public Boolean getThermalVis() {
		return thermalVis;
	}

	public void setThermalVis(Boolean thermalVis) {
		this.thermalVis = thermalVis;
	}

	public Reptile(int age, String species, String colour, String scaleColour, double tongueLen, Boolean thermalVis) {
		super(age, species, colour);
		this.scaleColour = scaleColour;
		this.tongueLen = tongueLen;
		this.thermalVis = thermalVis;
	}

}
