
public class Principal {

    public static void main(String [] args){
        //entre com um endereço de subrede
        Subrede subrede = new Subrede(255, 255, 224, 0, 19);
        //entre com um endereço de ip
        Endereco endereco = new Endereco(123, 100, 10, 80);
        //CLASSIFICAÇÃO
        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        subrede.mascaraDeSubrede(subrede.mascara1, subrede.mascara2, subrede.mascara3, subrede.mascara4);
        subrede.verificaClasse(subrede.bits);
        subrede.numeroDeHost(subrede.bits);

        System.out.print("Representação binária rede: ");
        endereco.transformaEmBinario(endereco.octeto1);
        endereco.transformaEmBinario(endereco.octeto2);
        endereco.transformaEmBinario(endereco.octeto3);
        endereco.transformaEmBinario(endereco.octeto4);


    }
}
