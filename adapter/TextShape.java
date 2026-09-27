package adapter;

public class TextShape implements Shape {

private TextView meuTextView;

public TextShape(TextView textView){
       this.meuTextView=textView;
}
public int getLimiteX(){
      return meuTextView.getLin1();
  }
public int getLimiteY(){
	return this.meuTextView.getCol1();
}
} 