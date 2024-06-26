public class Subrede {
    int mascara1;
    int mascara2;
    int mascara3;
    int mascara4;
    int bits;

    public Subrede(int mascara1, int mascara2, int mascara3, int mascara4, int bits){
        this.mascara1 = mascara1;
        this.mascara2 = mascara2;
        this.mascara3 = mascara3;
        this.mascara4 = mascara4;
        this.bits = bits;
        System.out.println("Máscara informada: "+mascara1+"."+mascara2+"."+mascara3+"."+mascara4+"/"+bits);
    }
    public void mascaraDeSubrede(int mascara1, int mascara2, int mascara3, int mascara4){
        System.out.println("Mascara de Subrede: "+mascara1+"."+mascara2+"."+mascara3+"."+mascara4);
    }
    public void classeMascara(int mascara1, int mascara2, int mascara3, int mascara4){
        //Essa verificação é com os octetos da mascara
        if(mascara1 <= 255 && mascara2 <= 254){
            System.out.println("Máscara de classe: A");
        } else if (mascara2 == 255 && mascara3 <= 254) {
            System.out.println("Máscara de classe: B");
        } else if (mascara3 == 255 && mascara4 <= 255) {
            System.out.println("Máscara de classe: C");
        } else{
            System.out.println("Endereço inválido");
        }
    }
    public void numeroDeHost(int bits) {
        // 2^n - 2 onde n é a quantidade de bits para hosts - 2 de rede e broadcast
        if (bits > 30) {
            System.out.println("Hosts disponíveis: 0");
        } else {
            int zeros = 32 - bits;
            int hosts = (int) Math.pow(2, zeros) - 2;
            System.out.println("Hosts disponíveis: " + hosts);
            int totalHosts = hosts + 2;
            System.out.println("Total de hosts: " + totalHosts);
        }
    }
    public void cIDR(int bits){
        if (bits > 32) {
            System.out.println("CIDR: Inválido");
        }else{
            System.out.println("Notação CIDR:/"+bits);
        }
    }
    public void mascaraEmBinario(int octeto) {
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
