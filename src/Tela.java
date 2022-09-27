import java.util.Scanner;

public class Tela {

    private Scanner scanner = new Scanner(System.in);
    private int tentativas;
    private int horasDeSono;
    private String resposta;
    private final String opcaoSim = "S";
    private final String opcaoNao = "N";
    private String opcao;

    public void exibirTela() {
        if (this.opcao.equals(opcaoSim)) {
            telaCalculo();
        }else if (this.opcao.equals(opcaoNao)) {
            System.out.println("Fim do programa.");
        } else {
            System.out.println("Opção inválida, digite S ou N:");
            telaInicial();
        }
    }
    public void telaInicial(){
        System.out.println("Desejas calcular privação de Sono? (S/N)");
        this.resposta = scanner.next();
        this.opcao = resposta.toUpperCase();
        exibirTela();
    }

    public void telaCalculo() {
        System.out.println("Digite quantas tentativas queres executar:");
        tentativas = scanner.nextInt();
        for (int i = 0; i < tentativas; i++) {
            System.out.println("Digite quantas horas dormiu:");
            horasDeSono = scanner.nextInt();
            ValidacaoDoSono valid = new ValidacaoDoSono(horasDeSono);
            valid.calcular();
        }
    }

}
