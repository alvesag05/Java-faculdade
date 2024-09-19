/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Formas");
		Triangulo t = new Triangulo();
		t.lados();
		t.altura();
		t.base();
		t.largura();
		
		Quadrilatero q = new Quadrilatero();
		q.lados();
		q.altura();
		q.base();
		q.largura();
		
		Pentagono p = new Pentagono();
		p.lados();
		p.altura();
		p.base();
		p.largura();
		
		Hexagono h = new Hexagono();
		h.lados();
		h.altura();
		h.base();
		h.largua();
		
		Octágono o = new Octágono();
		o.lados();
		o.altura();
		o.base();
		o.largura();
	}
}