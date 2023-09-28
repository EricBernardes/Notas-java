public class Notas {
    private double prova1;
    private double prova2;

    public void setProva1(double NovaNota){
        prova1= NovaNota;
    }

    public void setProva2(double NovaNota){
        prova2= NovaNota;
    }

    public double getProva1(){
        return prova1;
    }

    public double getProva2(){
        return prova2;
    }

    public double getMedia(){
        double media= (prova1+prova2)/2;
        return media;
    }
}
