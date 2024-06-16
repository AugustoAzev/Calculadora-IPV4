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
    }
    public void mascaraDeSubrede(int mascara1, int mascara2, int mascara3, int mascara4){
        System.out.println("Mascara de Subrede: "+mascara1+"."+mascara2+"."+mascara3+"."+mascara4);
    }
    public void verificaClasse(int bits){
        if(bits >= 1 && bits <= 8){
            System.out.println("Endereço de classe: A");
        } else if (bits >= 9 && bits <= 23) {
            System.out.println("Endereço de classe: B");
        } else if (bits >= 24 && bits <= 32) {
            System.out.println("Endereço de classe: C");
        } else{
            System.out.println("Endereço inválido");
        }
    }
    public void numeroDeHost(int bits){
        //2^n - 2 onde n é a quant. de bits - 2 de rede e broadcast
        int hosts = (2 * bits) - 2;
        System.out.println("Hosts disponiveis: " + hosts);
    }
}
