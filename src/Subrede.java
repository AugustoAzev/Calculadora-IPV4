public class Subrede {
    int bits;

    public void definirCidr(int bits){
        int[] binario = new int[8];
        // Preenche o array binário com a representação do octeto
        for (int i = 7; i >= 0; i--) {
            binario[i] = (bits & 1);
            bits >>= 1;
        }
        for (int bit : binario) {
            System.out.print(bit);
        }
        System.out.print(" ");
    }
}
