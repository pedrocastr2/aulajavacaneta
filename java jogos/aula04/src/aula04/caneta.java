package aula04;

public class caneta {
  private String modelo;
  private float ponta;
  private String cor;
  private boolean tampa;
  
  
  public  caneta (String m, String c ,float p) {
	  this.tampar();
	  this.modelo = m;
	  this.cor= c;
	  this.setPonta(p);
	  
	  
  }
  
 
	public String getModelo () {
		return this.modelo;
		
	}
	public void setModelo (String m) {
		
		this.modelo =m;
	}
	public float getPonta () {
		return this.ponta;
		
	}
	public void setPonta (float p) {
		
		this.ponta=p;
	}
	
	public void status() {
		System.out.println("Sobre a caneta");
		System.out.println("Ponta "+ this.getPonta());
		System.out.println("Modelo "+this.getModelo());
		System.out.println("cor "+this.cor);
	}
	
	
	
	
	public void tampar() {
		
		this.tampa = true;
		System.out.println("A caneta está tampada: "+this.tampa);
	}
	
public void detampar() {
	this.tampa = false;
	System.out.println("A caneta está tampada:  "+this.tampa);
	}
	
}
