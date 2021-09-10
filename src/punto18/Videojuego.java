package punto18;

public class Videojuego implements Entregable {

    static final int HORAS_ESTIMADAS_POR_DEFECTO = 10;
    static final boolean ESTADO_ENTREGADO = false;

    private String titulo, genero, compania;
    private int horasEstimadas;
    private boolean entregado;

    public Videojuego() {
        this.horasEstimadas = HORAS_ESTIMADAS_POR_DEFECTO;
        this.entregado = ESTADO_ENTREGADO;
        this.titulo = "";
        this.genero = "";
        this.compania = "";
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.compania = "";
        this.genero = "";
        this.entregado = ESTADO_ENTREGADO;
    }

    public Videojuego(String titulo, String genero, String compania, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEstimadas = horasEstimadas;
        this.entregado = ESTADO_ENTREGADO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compañia='" + compania + '\'' +
                ", horas Estimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                '}';
    }

    @Override
    public void prestar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isPrestado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        //el videojuego con más hora retornara 1, 0 si son iguales y -1 si es menor :)
        int auxRes = -1;
        Videojuego miVideojuego = (Videojuego) a;
        if (this.horasEstimadas > miVideojuego.horasEstimadas) {
            auxRes = 1;
        } else if (this.horasEstimadas == miVideojuego.getHorasEstimadas()) {
            auxRes = 0;
        }
        return auxRes;
    }

}
