/**
 * This class for the ComplexNum that includes the real and imaginary numbers
 * 
 * @author Anderson VanLandingham
 */
package assg2_vanlandinghama20;

public class ComplexNum {

	private double realNum;
	private double imagNum;

	/**
	 * Default constructor
	 */
	public ComplexNum() {
		realNum = 0;
		imagNum = 0;
	}
	/**
	 * Constructor with a given real part while the imaginary part is equal to 0
	 * @param The real
	 */
	public ComplexNum(double real) {
		realNum = real;
		imagNum = 0;
	}

	/**
	 * Constructor includes two double values as parameters
	 * realNum represents real part
	 * imagNum represents imaginary part
	 * @param real The real
	 * @param imag The imaginary
	 */
	public ComplexNum(double real, double imag) {
		realNum = real;
		imagNum = imag;
	}

	/**
	 * Retrieves the real part
	 * @return realNum
	 */
	public double getReal() {
		return realNum;
	}

	/**
	 * Retrieves the imaginary part
	 * @return imagNum
	 */
	public double getImaginary() {
		return imagNum;
	}

	/**
	 * Modify the real part
	 * @param newReal The new real number
	 */
	public void setReal(double newReal) {
		realNum = newReal;
	}

	/**
	 * Modify the imaginary part
	 * @param newImag The new imaginary number
	 */
	public void setImaginary(double newImag) {
		imagNum = newImag;
	}

	/**
	 * 
	 * @param num
	 * @return newC A new complex number
	 */
	public ComplexNum add(ComplexNum num) {
		double newReal = this.realNum + num.realNum;
		double newIma = this.imagNum + num.imagNum;
		ComplexNum newC = new ComplexNum(newReal, newIma);
		return newC;
	}

	/**
	 * This method subtract the this number by the parameter
	 * @param num
	 * @return newC A new complex number
	 */
	public ComplexNum sub(ComplexNum num) {
		double newReal = this.realNum - num.realNum;
		double newIma = this.imagNum - num.imagNum;
		ComplexNum newC = new ComplexNum(newReal, newIma);
		return newC;
	}

	/**
	 * This method multiply this number by the parameter
	 * @param num
	 * @return newC A new complex number
	 */
	public ComplexNum mul(ComplexNum num) {
		double newReal = this.realNum * num.realNum;
		double newIma = this.imagNum * num.imagNum;
		ComplexNum newC = new ComplexNum(newReal, newIma);
		return newC;
	}

	/**
	 * Takes no parameters, and negated this object
	 * @return newC A new complex number
	 */
	public ComplexNum neg() {
		double newReal = -(this.realNum);
		double newIma = -(this.imagNum);
		ComplexNum newC = new ComplexNum(newReal, newIma);
		return newC;
	}

	/**
	 * It returns the string of the ComplexNum object
	 * It also returns a string if real or imaginary number are not equal to 0
	 * If real or imaginary are equal to zero, then it returns the non-zero part
	 */
	public String toString() {
		
		if (this.realNum == 0 && this.imagNum == 0)
			return "0.0";
		
		if (this.imagNum < 0)
			return realNum + "" + imagNum + "i";
		
		if (this.realNum == 0)
			return realNum + "i";
		
		if(this.imagNum == 0)
			return realNum+"";
		else
			return realNum +"+"+ imagNum + "i";
		
	}
	
	/**
	 * Compare the real and imaginary numbers to this object
	 * @param obj The object to compare this numbers
	 * @return Returns true if Complex Numbers are equal. If not, then it is false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof ComplexNum) {
			ComplexNum temp = (ComplexNum) obj;
			return (this.realNum == temp.realNum && this.imagNum == temp.imagNum);
		}
		else
			return false;
	}

}
