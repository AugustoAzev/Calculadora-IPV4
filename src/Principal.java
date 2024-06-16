
public class Principal {

    public static void main(String [] args){
        //entre com um endereço de subrede
        Subrede subrede = new Subrede(255, 0, 0, 0, 32);
        //entre com um endereço de ip
        Endereco endereco = new Endereco(130, 100, 10, 80);
        //CLASSIFICAÇÃO
        endereco.enderecoDeRede(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        endereco.enderecoValidoEBroadcast(endereco.octeto1, endereco.octeto2, endereco.octeto3, endereco.octeto4);
        subrede.mascaraDeSubrede(subrede.mascara1, subrede.mascara2, subrede.mascara3, subrede.mascara4);
        subrede.verificaClasseMascara(subrede.mascara1, subrede.mascara2, subrede.mascara3, subrede.mascara4);
        subrede.numeroDeHost(subrede.bits);

        System.out.print("Representação binária do IP: ");
        endereco.transformaEmBinario(endereco.octeto1);
        endereco.transformaEmBinario(endereco.octeto2);
        endereco.transformaEmBinario(endereco.octeto3);
        endereco.transformaEmBinario(endereco.octeto4);


    }
}
