package adapter;

public class TextView {
 private int lin;
 private int col;
 private int lin1;
 private int col1;
public TextView(int lin_,int col_,int lin1_,int col1_){
    this.lin =lin_;
    this.col=col_;
    this.lin1 =lin1_;
    this.col1=col1_;
}
/**
 * @return the lin
 */
public int getLin() {
	return lin;
}
/**
 * @param lin the lin to set
 */
public void setLin(int lin) {
	this.lin = lin;
}
/**
 * @return the col
 */
public int getCol() {
	return col;
}
/**
 * @param col the col to set
 */
public void setCol(int col) {
	this.col = col;
}
/**
 * @return the lin1
 */
public int getLin1() {
	return lin1;
}
/**
 * @param lin1 the lin1 to set
 */
public void setLin1(int lin1) {
	this.lin1 = lin1;
}
/**
 * @return the col1
 */
public int getCol1() {
	return col1;
}
/**
 * @param col1 the col1 to set
 */
public void setCol1(int col1) {
	this.col1 = col1;
}

} 