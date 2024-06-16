public class Endereco {
    int octeto1;
    int octeto2;
    int octeto3;
    int octeto4;

    public Endereco(int octeto1, int octeto2, int octeto3, int octeto4){
        this.octeto1 = octeto1;
        this.octeto2 = octeto2;
        this.octeto3 = octeto3;
        this.octeto4 = octeto4;
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
}
