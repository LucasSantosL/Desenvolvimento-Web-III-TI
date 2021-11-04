public class Fisica {
    
    public float forcaPeso(double peso, double massa, double gravidadeLocal) {
        peso = massa * gravidadeLocal;
        return (float) peso;
    }
    
    public float forcaCentripeta(float velocidade, double grama, float raio) {
        return (float) ((velocidade * velocidade) / (raio * grama));
    }

    public float impulso(float forcaConstante, float kg, float ms, float s) {
        return (forcaConstante * s) + (ms * kg); 
    }

    public float forcaElastica(double k, double x, double g) {
        return (float) ((k * x) / g);
    }

    public float velocidadeMedia(float descolamento, float intervaloTempo) {
        return descolamento / intervaloTempo;
    }

    public float mru(float dis, float temp) {
        return dis / temp;
    } 

    public float mruv(double v, float t) {
        return (float) (v / t);
    }

}