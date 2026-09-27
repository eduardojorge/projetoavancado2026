package adapter;

public class EditorDesenho {

  public EditorDesenho() {
  }
  public void ImprimeLimite(Shape shape){
    
    System.out.println("Limite X="+shape.getLimiteX()+" Limite Y="+shape.getLimiteY());
  }

  public static void main(String[] args) {
    EditorDesenho editorDesenho = new EditorDesenho();
    Shape textShape = new TextShape(new TextView(10,10,20,20));
    Shape lineShape = new LineShape(10,20,30);
    editorDesenho.ImprimeLimite(textShape);
    editorDesenho.ImprimeLimite(lineShape);
  }
}