public class Rede {
    int octeto1;
    int octeto2;
    int octeto3;
    int octeto4;
    int bits;

    //CONSTRUTORES
    public Rede(int octeto1, int octeto2, int octeto3, int octeto4){
        if(octeto1 > 255 || octeto2 > 255 || octeto3 > 255 || octeto4 > 255){
            System.out.println("Endereço de rede inválido!");
        } else{
            this.octeto1 = octeto1;
            this.octeto2 = octeto2;
            this.octeto3 = octeto3;
            this.octeto4 = octeto4;
            System.out.println("Endereço IP informado: "+octeto1+"."+octeto2+"."+octeto3+"."+octeto4);
            System.out.println();
        }
    }
    public Rede(int octeto1, int octeto2, int octeto3, int octeto4, int bits){
        if(octeto1 > 255 || octeto2 > 255 || octeto3 > 255 || octeto4 > 255 || bits > 32){
            System.out.println("Endereço de rede inválido!");
        } else{
            this.octeto1 = octeto1;
            this.octeto2 = octeto2;
            this.octeto3 = octeto3;
            this.octeto4 = octeto4;
            this.bits = bits;
            System.out.println("Endereço IP informado: "+octeto1+"."+octeto2+"."+octeto3+"."+octeto4+"/"+bits);
            System.out.println();
        }
    }
    //VERIFICA QUAL A CLASSE
    public int verificaClasse(int octeto1){
        if(octeto1 >= 1 && octeto1 <= 126){
            //CLASSE A
            return 1;
        } else if (octeto1 == 127) {
            //LOOPBACK
            return 2;
        } else if (octeto1 >= 128 && octeto1 <= 191) {
            //CLASSE B
            return 3;
        } else if (octeto1 >= 192 && octeto1 <= 223) {
            //CLASSE C
            return 4;
        } else{
            return 0;
        }
    }
    //DEFINE A CLASSE DO ENDEREÇO -> EX: A, B ou C
    public void classeEndereco(int octeto1){
        int classe = verificaClasse(octeto1);

        if (classe == 1){
            System.out.print("Endereço de classe: A");
        } else if (classe == 2) {
            System.out.print("Endereço de loopback");
        } else if (classe == 3) {
            System.out.print("Endereço de classe: B");
        } else if (classe == 4) {
            System.out.print("Endereço de classe: C");
        } else {
            System.out.print("Endereço inválido!");
        }
    }
    //ENDEREÇO DE REDE -> EX:10.0.0.0
    public void enderecoDeRede(int octeto1, int octeto2, int octeto3, int octeto4){
        System.out.println();
        //verificar a classe e será o primeiro endereço Ex: 100.10.20.0
        if(octeto1 >= 1 && octeto1 <= 126){
            System.out.println("Endereço de rede: " + octeto1 + ".0.0.0");
        } else if (octeto1 == 127) {
            System.out.println("Endereço de rede: " + octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (octeto1 >= 128 && octeto1 <= 191) {
            System.out.println("Endereço de rede: " + octeto1 + "."+ octeto2 +".0.0");
        } else if (octeto1 >= 192 && octeto1 <= 223) {
            System.out.println("Endereço de rede: " + octeto1 + "."+ octeto2 +"."+ octeto3 +".0");
        } else{
            System.out.println("Endereço inválido!");
        }
    }
    //ENDEREÇO EM BINÁRIO
    public void enderecoEmBinario(int octeto) {
        int[] binario = new int[8];
        // Preenche o array binário com a representação do octeto
        for (int i = 7; i >= 0; i--) {
            binario[i] = (octeto & 1);
            octeto >>= 1;
        }
        for (int bit : binario) {
            System.out.print(bit);
        }
        System.out.print(" ");
    }
    //PRIMEIRO ENDEREÇO VÁLIDO
    public void primeiroEnderecoValido(int octeto1, int octeto2, int octeto3, int octeto4){
        int classe = verificaClasse(octeto1);
        if (classe == 1){
            octeto2 = 0;
            octeto3 = 0;
            octeto4 = 1;
            System.out.println("Primeiro endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 2) {
            System.out.println("Primeiro endereço válido: endereço de loopback");
            System.out.println("Primeiro endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 3) {
            octeto3 = 0;
            octeto4 = 1;
            System.out.println("Primeiro endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 4) {
            octeto4 = 1;
            System.out.println("Primeiro endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else {
            System.out.println("Endereço inválido!");
        }
    }
    //ULTIMO ENDEREÇO VÁLIDO
    public void ultimoEnderecoValido(int octeto1, int octeto2, int octeto3, int octeto4){
        int classe = verificaClasse(octeto1);
        if (classe == 1){
            octeto2 = 255;
            octeto3 = 255;
            octeto4 = 254;
            System.out.println("Último endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 2) {
            System.out.println("Último endereço válido: endereço de loopback");
        } else if (classe == 3) {
            octeto3 = 255;
            octeto4 = 254;
            System.out.println("Último endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 4) {
            octeto4 = 254;
            System.out.println("Último endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else {
            System.out.println("Endereço inválido!");
        }
    }
    //VERIFICA A MÁSCARA DO ENDEREÇO INFORMADO
    public void mascaraDaRede(int bits){
            // Validação de entrada
            if (bits < 1 || bits > 32) {
                System.out.println("Máscara da rede: nenhuma subrede informada");
                return;
            }
            // Variáveis para armazenar os octetos da máscara
            int octeto1 = 0, octeto2 = 0, octeto3 = 0, octeto4 = 0;
            // Preencher os octetos baseando-se no número de bits
            if (bits > 24) {
                octeto1 = 255;
                octeto2 = 255;
                octeto3 = 255;
                octeto4 = 256 - (1 << (32 - bits));
            } else if (bits > 16) {
                octeto1 = 255;
                octeto2 = 255;
                octeto3 = 256 - (1 << (24 - bits));
            } else if (bits > 8) {
                octeto1 = 255;
                octeto2 = 256 - (1 << (16 - bits));
            } else {
                octeto1 = 256 - (1 << (8 - bits));
            }
            System.out.printf("Máscara de rede: %d.%d.%d.%d%n", octeto1, octeto2, octeto3, octeto4);
    }
    //VERIFICA A QUANTIDADE DE HOST E QUANTOS ESTÃO DISPONIVEIS
    public void numeroDeHost(int bits) {
        //2^n - 2 onde n é a quantidade de bits para hosts - 2 de rede e broadcast
        if (bits > 30) {
            System.out.println("Hosts disponíveis: 0");
        } else {
            int zeros = 32 - bits;
            int hosts = (int) Math.pow(2, zeros) - 2;
            int totalHosts = hosts + 2;
            System.out.println("Total de hosts: " + totalHosts);
            System.out.println("Hosts disponíveis: " + hosts);

        }
    }
    //DEFINE A NOTAÇÃO CIDR
    public void cIDR(int bits){
        if (bits > 32) {
            System.out.println("CIDR: Inválido");
        }else{
            System.out.println("Notação CIDR: /"+bits);
        }
    }
    //DEFINE MÁSCARA EM BINÁRIO
    public void mascaraEmBinario(int bits) {
        if (bits < 0 || bits > 32) {
            System.out.println("Número de bits inválido. Deve ser entre 0 e 32.");
            return;
        }
        int[] binario = new int[32];
        // Preenche os primeiros 'bits' bits com 1
        for (int i = 0; i < bits; i++) {
            binario[i] = 1;
        }
        // Imprime a representação binária da máscara de sub-rede
        for (int i = 0; i < 32; i++) {
            System.out.print(binario[i]);
            // Adiciona um espaço após cada octeto para melhor legibilidade
            if ((i + 1) % 8 == 0 && i < 31) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    //DEFINE A CLASSE DA MÁSCARA
    public void classeDaMascara(int bits) {
        if (bits < 0 || bits > 32) {
            System.out.println("Número de bits inválido. Deve ser entre 0 e 32.");
            return;
        }
        if(bits > 0 && bits < 7){
            System.out.println("Máscara de classe: A");
        } else if (bits > 8 && bits < 17) {
            System.out.println("Máscara de classe: B");
        }
        else if (bits > 16 && bits < 25) {
            System.out.println("Máscara de classe: C");
        }else{
            System.out.println("Máscara de classe: Multicast ou utilização futura (D ou E)");
        }
    }
    //VERIFICA O ÚLTIMO ENDEREÇO DE REDE
    public void ultimoEndereco(int octeto1, int octeto2, int octeto3, int octeto4, int bits) {
        int classe = verificaClasse(octeto1);
        if (classe == 1){
            octeto2 = 255;
            octeto3 = 255;
            octeto4 = 255;
            System.out.println("Endereço de broadcast: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 2) {
            System.out.println("Endereço de broadcast: endereço de loopback");
        } else if (classe == 3) {
            octeto3 = 255;
            octeto4 = 255;
            System.out.println("Endereço de broadcast: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 4) {
            octeto4 = 255;
            System.out.println("Endereço de broadcast: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else {
            System.out.println("Endereço inválido!");
        }
    }
    //VERIFICA SE O ENDEREÇO É PÚBLICO, PRIVADO OU ESPECIAL
    public void verificarTipoDeEndereco(int octeto1, int octeto2, int octeto3, int octeto4) {
        if ((octeto1 == 10) ||
            (octeto1 == 172 && (octeto2 >= 16 && octeto2 <= 31)) ||
            (octeto1 == 192 && octeto2 == 168)) {
            System.out.println("Endereço: Privado");
        } else if (octeto1 == 127) {
            System.out.println("Endereço Especial: Loopback");
        } else if ((octeto1 >= 224 && octeto1 <= 239)) {
            System.out.println("Endereço Especial: Multicast");
        } else if ((octeto1 >= 240 && octeto1 <= 255)) {
            System.out.println("Endereço Especial: Reservado");
        } else {
            System.out.println("Endereço: Público");
        }
    }
    //METODO DE ULTIMA HORA PARA VERIFICAR SE A CLASSE É VALIDO (EVITAR TERMINAL BUGADO)
    public int confirmaClasse(){
            if(octeto1 > 255){
                //invalido
                return 0;
            } else if (octeto2 > 255) {
                //invalido
                return 0;
            } else if (octeto3 > 255) {
                //invalido
                return 0;
            } else if (octeto4 > 255) {
                //invalido
                return 0;
            } else{
                return 1; //valido
            }
    }
    //os bits precisam ser maiores que 24 para rolar
    public void intervalosHost(int bits){
        int confirma = confirmaClasse();

        if (bits > 30) {
            System.out.println("Endereço inválido!");
        } else if(confirma == 0){
            System.out.println("Endereço inválido!");
        } else if(bits < 24){
            System.out.println("Intervalos somente para > 23 bits ou endereço inválido!");
        } else {
            int zeros = 32 - bits;
            int intervalo = (int) Math.pow(2, zeros) - 2;

            int classe = verificaClasse(this.octeto1);

            if (classe == 2) {
                System.out.println("Endereço de loopback! Sem intervalos!");
            }
            else{
                int variacao = 0;
                for(int i = 0; i < 10; i++){
                    System.out.print(this.octeto1+"."+this.octeto2+"."+this.octeto3+"."+variacao+"  -  ");
                    variacao = variacao + 1;
                    System.out.print(this.octeto1+"."+this.octeto2+"."+this.octeto3+"."+variacao+"  -  ");
                    variacao = variacao + intervalo;
                    variacao = variacao - 1;
                    System.out.print(this.octeto1+"."+this.octeto2+"."+this.octeto3+"."+variacao+"  -  ");
                    variacao = variacao + 1;
                    System.out.println(this.octeto1+"."+this.octeto2+"."+this.octeto3+"."+variacao);
                    variacao = variacao + 1;
                }
            }
        }

    }
}
