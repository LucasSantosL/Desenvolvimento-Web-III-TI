public class App {
    public static void main(String[] args) throws Exception {
        Fisica fisica = new Fisica();
        
        /* 
           Força Peso: 
           um objeto de 10 kg na Terra, onde a gravidade é de aproximadamente 9,8 m/s², 
           terá um peso de 98 N, enquanto na Lua, onde a gravidade é de 1,6 m/s².
        */
        System.out.println("");
        System.out.println("FORÇA PESO");
        System.out.println("um objeto de 10 kg na Terra, onde a gravidade é de aproximadamente 9,8 m/s², terá um peso de 98 N, enquanto na Lua, onde a");
        System.out.println("gravidade é de 1,6 m/s²");
        double peso = 0;
        double massa = 10;
        double gravidadeLocal = 1.6;
        double resultadoFP = fisica.forcaPeso(peso, massa, gravidadeLocal);
        System.out.println("O resultado é: " + resultadoFP + " N");
        System.out.println("");

        /* 
           Força Centrípeta:
           Um carro de 1000 kg de massa entra, a 30 m/s, em uma curva de raio igual a 300 m, contida 
           em uma superfície horizontal. Determine o módulo do coeficiente de atrito estático entre os 
           pneus do carro e o asfalto, para que esse veículo não derrape.
        */
        System.out.println("FORÇA CENTRÍPETA");
        System.out.println("Um carro de 1000 kg de massa entra, a 30 m/s, em uma curva de raio igual a 300 m, contida em uma superfície horizontal.");
        System.out.println("Determine o módulo do coeficiente de atrito estático entre os pneus do carro e o asfalto, para que esse veículo não derrape.");
        float velocidade = 30;
        double grama = 0.10;
        float raio = 300;
        double resultadoFC = fisica.forcaCentripeta(velocidade, grama, raio);
        System.out.println("O resultado é: " + resultadoFC + ".");
        System.out.println("");

        /*
           Sobre uma partícula de 8 kg, movendo-se a 25m/s, passa a atuar uma força constante de 
           intensidade 2,0 x 102N durante 3s no mesmo sentido do movimento. Determine a quantidade de 
           movimento desta partícula após o término da ação da força. 
        */
        System.out.println("IMPULSO:");
        System.out.println("Sobre uma partícula de 8 kg, movendo-se a 25m/s, passa a atuar uma força constante de intensidade 2,0 x 102N durante 3s");
        System.out.println("no mesmo sentido do movimento. Determine a quantidade de movimento desta partícula após o término da ação da força. ");
        float forcaConstante = 200;
        float kg = 8;
        float ms = 25;
        float s = 3;
        float resultadoIP = fisica.impulso(forcaConstante, kg, ms, s);
        System.out.println("O resultado é: " + resultadoIP + " kgm/s.");
        System.out.println("");

        /*
        Uma mola está suspensa verticalmente próxima à superfície terrestre, onde a aceleração da 
        gravidade pode ser adotada como 10 m/s². Na extremidade livre da mola é colocada uma cestinha 
        de massa desprezível, que será preenchida com bolinhas de gude, de 15 g cada. Ao acrescentar 
        bolinhas à cesta, verifica-se que a mola sofre uma elongação proporcional ao peso aplicado. 
        Sabendo-se que a mola tem uma constante elástica k = 9,0 N/m, quantas bolinhas devem ser 
        acrescentadas à cesta para que a mola estique exatamente 5 cm? 
        */
        System.out.println("FORÇA ELASTICA");
        System.out.println("Uma mola está suspensa verticalmente próxima à superfície terrestre, onde a aceleração da gravidade pode ser adotada como");
        System.out.println("10 m/s². Na extremidade livre da mola é colocada uma cestinha de massa desprezível, que será preenchida com bolinhas de");
        System.out.println("gude, de 15 g cada. Ao acrescentar bolinhas à cesta, verifica-se que a mola sofre uma elongação proporcional ao peso aplicado. Sabendo-se que a mola tem uma constante elástica k = 9,0 N/m, quantas bolinhas devem ser acrescentadas à cesta para que a mola estique exatamente 5 cm?");
        double k = 9; 
        double x = 0.05;
        double g = 10;
        float resultadoFE = fisica.forcaElastica(k, x, g);
        System.out.println("O resultado é: " + resultadoFE + ", São necessarias 3 bolinhas.");
        System.out.println("");
        
        /*
        Uma família viaja de São Paulo para o Rio de Janeiro, para passar as férias. 
        A viagem tem uma duração de 6 horas em um percurso de 435 km. 
        Qual a velocidade média do automóvel da família? 
        */
        System.out.println("VELOCIDADE MÉDIA");
        System.out.println("Uma família viaja de São Paulo para o Rio de Janeiro, para passar as férias.A viagem tem uma duração de 6 horas em um percurso de 435 km.Qual a velocidade média do automóvel da família? ");
        float descolamento = 435;
        float intervaloTempo = 6;
        float resultadoVM = fisica.velocidadeMedia(descolamento, intervaloTempo);
        System.out.println("O resultado é: " + resultadoVM + " Km/h.");
        System.out.println("");

        /*
        MOVIMENTO RETILÍNEO UNIFORME (MRU)
        Um movel percorre 7 Km em 2 horas. Determine a velocidade?
        */
        System.out.println("Um movel percorre 7 Km em 2 horas. Determine a velocidade?");
        float temp = 2;
        float dis = 7;
        float resultadoMRU = fisica.mru(dis, temp);
        System.out.println("O resultado é: " + resultadoMRU + "km/h");
        System.out.println("");

        /*
        MOVIMENTO RETILÍNEO UNIFORME VARIADO (MRUV)
        Um automóvel parte do repouso e atinge a velocidade de 100 km/h em 8s. Qual é a aceleração 
        desse automóvel?
        */
        System.out.println("Um automóvel parte do repouso e atinge a velocidade de 100 km/h em 8s. Qual é a aceleração desse automóvel?");
        double v = 27.7; //m/s
        float t = 8; //s
        float resultadoMRUV = fisica.mruv(v, t);
        System.out.println("O resultado é: " + resultadoMRUV);
        System.out.println("");
        System.out.println("FIM :)");
    }
}
