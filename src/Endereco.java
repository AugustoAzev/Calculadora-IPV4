public class Endereco {
    int octeto1;
    int octeto2;
    int octeto3;
    int octeto4;

    public Endereco(int octeto1, int octeto2, int octeto3, int octeto4){
        if(octeto1 > 255 || octeto2 > 255 || octeto3 > 255 || octeto4 > 255){
            System.out.println("Endereço de rede inválido!");
        } else{
            this.octeto1 = octeto1;
            this.octeto2 = octeto2;
            this.octeto3 = octeto3;
            this.octeto4 = octeto4;
            System.out.println("Endereço IP informado: "+octeto1+"."+octeto2+"."+octeto3+"."+octeto4);
        }
    }
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
            System.out.println("Endereço inválido");
        }
    }
    public void transformaEmBinario(int octeto) {
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
    public void enderecoValidoEBroadcast(int octeto1, int octeto2, int octeto3, int octeto4){
        int classe = verificaClasse(octeto1);
        if (classe == 1){
            octeto2 = 0;
            octeto3 = 0;
            octeto4 = 1;
            System.out.println("Primeiro endereço válido: "+ octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4);
        } else if (classe == 2) {
            octeto3 = 0;
            octeto4 = 1;
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
}
