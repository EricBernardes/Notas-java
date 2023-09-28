public class TestaNotas {

    public static void main(String[] args){
        Notas minhasNotas= new Notas();
        minhasNotas.setProva1(10.00);
        minhasNotas.setProva2(8.00);
        System.out.println("Nota da prova 1 = "+ minhasNotas.getProva1());
        System.out.println("Nota da prova 2 = "+ minhasNotas.getProva2());
        System.out.println("Media das notas = "+ minhasNotas.getMedia());
    }
}
