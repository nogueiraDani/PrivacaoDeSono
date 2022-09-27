public class ValidacaoDoSono {

    private final int horasDeSono;

    public ValidacaoDoSono(int horasDeSono) {
        this.horasDeSono = horasDeSono;
    }

    public void calcular() {
        if (this.horasDeSono <= 7) {
            System.out.println("Com " + this.horasDeSono + " horas de sono, estás com privação de sono");
        } else {
            System.out.println("Com " + this.horasDeSono + " horas de sono, não estás com privação de sono");
            ;
        }
    }
}
