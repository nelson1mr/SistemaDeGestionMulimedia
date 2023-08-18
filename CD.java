public class CD extends Elemento{
    private String autor;
    private int numeroDePistas;
    
    public CD(String elTitulo, String autor, int numeroDePistas, int tiempo){
        super(elTitulo, tiempo);
        this.autor = autor;
        this.numeroDePistas = numeroDePistas;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getNumeroDePistas(){
        return this.numeroDePistas;
    }
    
    public void print(){
        System.out.println("CD");
        System.out.println("Título: " + super.getTitulo());
        System.out.println("Autor: " + autor);
        System.out.println("Num pistas: " + numeroDePistas);
    }
}