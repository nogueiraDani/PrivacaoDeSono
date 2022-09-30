import java.util.Scanner;

public class Tela {

    private Scanner scanner = new Scanner(System.in);
    private int tentativas;
    private int horasDeSono;
    private String resposta;
    private String opcao;
    private final String opcaoSim = "S";
    private final String opcaoNao = "N";

    private String mensagemErroPrimeiraPergunta = "Opção inválida, digite S ou N:";
    private String mensagemErroSegundaPergunta = "Caracter inválido, digite somente números para quantidade de " +
            "tentativas.";
    private String mensagemErroTerceiraPergunta = "Caracter inválido, digite somente números para quantidade de " +
            "horas." ;

    public void telaInicial() {
        try {
            primeiraTela();
        } catch (Exception e) {
            System.out.println(mensagemErroPrimeiraPergunta);
            primeiraTela();
        }
    }
    private void primeiraTela() {
            primeiraPergunta();
            exibirSegundaTela();
    }

    private void primeiraPergunta() {
            System.out.println("Desejas calcular privação de Sono? (S/N)");
            this.resposta = scanner.next();
            this.opcao = resposta.toUpperCase();
    }

    public void exibirSegundaTela() {
        if (this.opcao.equals(opcaoSim)) {
            segundaTela();
        } else if (this.opcao.equals(opcaoNao)) {
            System.out.println("Fim do programa.");
        }
    }

    public void segundaTela() {
        try {
            segundaPergunta();
        } catch (Exception e) {
            System.out.println(mensagemErroSegundaPergunta);
            segundaPergunta();
        }
            for (int i = 0; i < tentativas; i++) {
                try {
                terceiraPergunta();
                } catch (Exception e) {
                    System.out.println(mensagemErroTerceiraPergunta);
                    terceiraPergunta();
                }
            }
    }

    private void terceiraPergunta() {
                System.out.println("Digite quantas horas dormiu:");
                horasDeSono = scanner.nextInt();
                ValidacaoDoSono valid = new ValidacaoDoSono(horasDeSono);
                valid.calcular();
    }

    private void segundaPergunta() {
            System.out.println("Digite quantas tentativas queres executar:");
            tentativas = scanner.nextInt();
    }

}
